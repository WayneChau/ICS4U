package Chau;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * SchoolSystem.java
 * Method are created so that creates a record, allows the user to enter a data, and then returns a reference to that record to be able to be printed.
 * April 13th, 2018
 * @author WayneChau
 */
public class SchoolSystem {

	//Global
	static Scanner sc = new Scanner(System.in);
	static boolean error = false; //if error is repeated
	static ArrayList <Student> studRecs = new ArrayList <Student>();
	static Scanner fscan = new Scanner("src/Chau/dataBase.txt");

	/**
	 * The entry point to the program
	 * @param args unused
	 * @throws InvalidInputException 
	 */
	public static void main(String[] args) throws InvalidInputException {
		int option = 0; //command chosen
		int searchOpt = 0; //search command chosen
		//do while loops are implemented with try catch in order to use the try catch more than once in case error occur repeatedly
		do {
			System.out.println("Press 1 - Enter New Record" + "\nPress 2 - Print All Student to Screen" + "\nPress 3 - Quit" + "\nPress 4 - Save to File" + "\nPress 5 - Load File" + "\nPress 6 - Sort File" + "\nPress 7 - Search For A Student");
			option = 0;
			do {
				try {
					option = sc.nextInt();
					error = false;
				} 
				catch(Exception e){
					System.out.println("Please choose the following options using the digits listed." + "\nPress 1 - Enter New Record" + "\nPress 2 - Print All Student to Screen" + "\nPress 3 - Quit" + "\nPress 4 - Save to File" + "\nPress 5 - Load File" + "\nPress 6 - Sort File" + "\nPress 7 - Search For A Student");
					sc.nextLine();
					error = true;
				}
			}while(error == true);
			sc.nextLine();
			//checks if any of the three options are inputed, reads again to obtain a command
			while(option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 7) {
				System.out.println("Please choose the following options using the digits listed." + "\nPress 1 - Enter New Record" + "\nPress 2 - Print All Student to Screen" + "\nPress 3 - Quit" + "\nPress 4 - Save to File" + "\nPress 5 - Load File" + "\nPress 6 - Sort File" + "\nPress 7 - Search For A Student");
				do {
					try {
						option = sc.nextInt();
						error = false;
					} catch(Exception e){
						System.out.println("Please choose the following options using the digits listed." + "\nPress 1 - Enter New Record" + "\nPress 2 - Print All Student to Screen" + "\nPress 3 - Quit" + "\nPress 4 - Save to File" + "\nPress 5 - Load File" + "\nPress 6 - Sort File" + "\nPress 7 - Search For A Student");
						sc.nextLine();
						error = true;
					}
				}while(error == true);
				sc.nextLine();
			}
			if (option == 1){
				studRecs.add(createRecord()); // creates new records
			}
			if (option == 2){
				printRecords();
			}
			if (option == 4) {
				saveFile();
				System.out.println("Student information saved to File.");
			}
			if (option == 5) {
				loadFile();
				System.out.println("Student information loaded from File.");
			}
			if (option == 6) {
				Collections.sort(studRecs);
				System.out.println("Student Record have been sorted.");
			}
			if (option == 7) {
				String Key = ""; //first name or student number searched by
				System.out.println("What would you like to search by?" + "\nPress 1 - First Name" + "\nPress 2 - Student Number");
				searchOpt = 0;
				do {
					try {
						searchOpt = sc.nextInt();
						error = false;
					} 
					catch(Exception e){
						System.out.println("Please choose the following options using the digits listed." + "\nPress 1 - First Name" + "\nPress 2 - Student Number");
						sc.nextLine();
						error = true;
					}
				}while(error == true);
				sc.nextLine();
				//checks if any of the three options are inputed, reads again to obtain a command
				while(searchOpt != 1 && searchOpt != 2) {
					System.out.println("Please choose the following options using the digits listed." + "\nPress 1 - First Name" + "\nPress 2 - Student Number");
					do {
						try {
							option = sc.nextInt();
							error = false;
						} catch(Exception e){
							System.out.println("Please choose the following options using the digits listed." + "\nPress 1 - First Name" + "\nPress 2 - Student Number");
							sc.nextLine();
							error = true;
						}
					}while(error == true);
					sc.nextLine();
				}
				if (searchOpt == 1) {
					System.out.println("Enter the First Name of the student searched for."); 
					Key = sc.nextLine();
					int index = idxKy(Key);
					printRecord(studRecs.get(index));
				}
				if (searchOpt == 2) {
					System.out.println("Enter the Student Number of the student searched for.");
					Key = sc.nextLine();
					int index = idxKy(Key);
					printRecord(studRecs.get(index));
				}
			}
		//Quit Program
		}while(option != 3);
		System.out.println("Goodbye, See you later!");
	}

	/**
	 * This method will get the information required to set the fields in
	 * the record.
	 * @param r - the Student to get data for
	 * @throws InvalidInputException 
	 */
	public static Student createRecord() throws InvalidInputException {
		System.out.println("Please enter the student's first name:");
		String FirstName = sc.nextLine();
		System.out.println("Please enter the student's last name:");
		String LastName = sc.nextLine();
		System.out.println("Please enter the student's middle initial:");
		String MiddleInitial = sc.nextLine();
		System.out.println("Please enter the student's email:");
		String Email = sc.nextLine();
		System.out.println("Please enter the student's street address:");
		String StreetAddress = sc.nextLine();
		System.out.println("Please enter the student's city:");
		String City = sc.nextLine();
		System.out.println("Please enter the student's province:");
		String Province = sc.nextLine();
		Student r = new Student(FirstName, LastName, MiddleInitial, Email, StreetAddress, City, Province);
		System.out.println("Please enter the student's postal code:");
		String postalCode = "";
		do {
			try {
				postalCode = sc.nextLine();
				r.setPostalCode(postalCode);
				error = false;
			} catch(Exception e){
				System.out.println(e.getMessage()); 
				System.out.println("Please enter the student's postal code:");
				error = true;
			}
		}while(error == true);
		System.out.println("Please enter the student's phone number:");
		String phoneNumber = "";
		do {
			try {
				phoneNumber = sc.nextLine();
				r.setPhoneNumber(phoneNumber);
				error = false;
			} catch(Exception e){
				System.out.println(e.getMessage()); 
				System.out.println("Please enter the student's phone number:");
				error = true;
			}
		}while(error == true);
		System.out.println("Please enter the student's student number:");
		String studentNumber = "";
		do {
			try {
				studentNumber = sc.nextLine();
				r.setStudentNumber(studentNumber);
				error = false;
			} catch(Exception e){
				System.out.println(e.getMessage());
				System.out.println("Please enter the student's student number:");
				error = true;
			}
		}while(error == true);
		System.out.println("Please enter the student's grade:");
		int gradeStudent = 0;
		do {
			try {
				gradeStudent = sc.nextInt();
				r.setGradeStudent(gradeStudent);
				error = false;
			} catch(Exception e){
				System.out.println(e.getMessage());
				System.out.println("Please enter the student's grade:");
				sc.nextLine();
				error = true;
			}
		}while(error == true);

		return r;
	}

	/**
	 * The method prints the given Student to the screen in a nicely formatted manner.
	 * @param r - the Student to print
	 */
	public static void printRecord(Student r) {
		System.out.println("\nStudent Record: \nFirst Name: " + r.getFirstName() + "\nLast Name: " + r.getLastName() + "\nMiddle Initial: " +r.getMiddleInitial() + "\nEmail: " + r.getEmail() + "\nStreet Address: " + r.getStreetAddress() + "\nCity: " + r.getCity()  + "\nProvince: " + r.getProvince() + "\nPostal Code: " + r.getPostalCode() + "\nStudent Number: " + r.getStudentNumber() + "\nGrade: " + r.getGradeStudent() + "\nPhone Number: " + r.getPhoneNumber());
	}

	/**
	 * Prints all students with the Records.
	 */
	public static void printRecords() {
		for (int i = 0; i < studRecs.size(); i++) {
			printRecord(studRecs.get(i));
		}
	}

	/**
	 * Saves student information into a text file.
	 */
	public static void saveFile() {
		try {
			File file = new File ("dataBase.txt");
			PrintStream fps = new PrintStream(file);
			fps.println(studRecs.size());
			for (int i = 0; i < studRecs.size(); i++) {
				fps.println(studRecs.get(i).toString());
			}
			fps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Load student information from a text file.
	 * @throws InvalidInputException
	 */
	public static void loadFile( ) {
		try {
			File file = new File ("dataBase.txt");
			Scanner fscan = new Scanner(file);
			int size = fscan.nextInt();
			fscan.nextLine();
			for (int i = 0; i < size; i++) {
				String input = fscan.nextLine();
				String [] data = input.split(",");
				Student s = new Student(data[0], data[1], data[2], data [3], data[4], data[5], data[6], data [7], data[8], Integer.parseInt(data[9]), data[10]);
				studRecs.add(s);
			}
			fscan.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Linear search for the student with the key (information searched by).
	 * @param Key - The piece of information to identify the student being searched for.
	 * @return i - index of the student that has the information key.
	 * @return -1 - when no student in the student records has the information key.
	 */
	public static int idxKy(String Key) {
		for (int i = 0; i < studRecs.size(); i++) {
			Student stu = studRecs.get(i);
			//searched by first name
			if (stu.getFirstName().equals(Key)) {
				return i;
			}
			//searched by student number
			if (stu.getStudentNumber().equals(Key)) {
				return i;
			}
		}
		return -1;
	}

}
