package Chau;

import java.util.ArrayList;
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

	/**
	 * The entry point to the program
	 * @param args unused
	 * @throws InvalidInputException 
	 */
	public static void main(String[] args) throws InvalidInputException {
		int option = 0; //command chosen
		//do while loops are implemented with try catch in order to use the try catch more than once in case error occur repeatedly
		do {
			System.out.println("Press 1 - Enter New Record" + "\nPress 2 - Print All Student to Screen" + "\nPress 3 - Quit");
			option = 0;
			do {
				try {
					option = sc.nextInt();
					error = false;
				} 
				catch(Exception e){
					System.out.println("Please choose the following options using the digits listed." + "\nPress 1 - Enter New Record" + "\nPress 2 - Print All Student to Screen" + "\nPress 3 - Quit");
					sc.nextLine();
					error = true;
				}
			}while(error == true);

			sc.nextLine();
			//checks if any of the three options are inputed, reads again to obtain a command
			while(option != 1 && option != 2 && option != 3) {
				System.out.println("Please choose the following options using the digits listed." + "\nPress 1 - Enter New Record" + "\nPress 2 - Print All Student to Screen" + "\nPress 3 - Quit");
				do {
					try {
						option = sc.nextInt();
						error = false;
					} catch(Exception e){
						System.out.println("Please choose the following options using the digits listed." + "\nPress 1 - Enter New Record" + "\nPress 2 - Print All Student to Screen" + "\nPress 3 - Quit");
						sc.nextLine();
						error = true;
					}
				}while(error == true);
				sc.nextLine();
			}
			if (option == 1){
				studRecs.add(createRecord()); // creates two new records
			}
			if (option == 2){
				printRecords();
			}
			//quits the program
		}while (option != 3);
		System.out.println("GoodBye, See You Soon!");

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
		System.out.println("Please enter the student's postal code:");
		String PostalCode = sc.nextLine();
		System.out.println("Please enter the student's province:");
		String Province = sc.nextLine();
		System.out.println("Please enter the student's phone number:");	
		long PhoneNumber = 0;
		do {
			try {
				PhoneNumber = sc.nextLong();
				error = false;
			} catch(Exception e){
				System.out.println("The value entered has to be digits. Please enter the student's phone number:");
				sc.nextLine();
				error = true;
			}
		}while(error == true);
		System.out.println("Please enter the student's student number:");
		int StudentNumber = 0;
		do {
			try {
				StudentNumber = sc.nextInt();
				error = false;
			} catch(Exception e){
				System.out.println("The value entered has to be digits. Please enter the student's student number:");
				sc.nextLine();
				error = true;
			}
		}while(error == true);
		System.out.println("Please enter the student's grade:");
		int GradeStudent = 0;
		do {
			try {
				GradeStudent = sc.nextInt();
				error = false;
			} catch(Exception e){
				System.out.println(e.getMessage());
				System.out.println("The value entered has to be digits. Please enter the student's grade:");
				sc.nextLine();
				error = true;
			}
		}while(error == true);
		
		Student r = new Student(FirstName, LastName, MiddleInitial, Email, StreetAddress, City, PostalCode, Province, StudentNumber, GradeStudent, PhoneNumber);	
		return r;
	}

	/**
	 * The method prints the given Student to the screen in a nicely formatted manner.
	 * @param r - the Student to print
	 */
	public static void printRecord(Student r) {
		System.out.println("\nStudent Record: \nFirst Name: " + r.getFirstName() + "\nLast Name: " + r.getLastName() + "\nMiddle Initial: " +r.getMiddleInitial() + "\nEmail: " + r.getEmail() + "\nStreet Address: " + r.getStreetAddress() + "\nCity: " + r.getCity() + "\nPostal Code: " + r.getPostalCode() + "\nProvince: " + r.getProvince() + "\nStudent Number: " + r.getStudentNumber() + "\nGrade: " + r.getGradeStudent() + "\nPhone Number: " + r.getPhoneNumber());
	}
	
	private static void printRecords() {
		for (int i = 0; i < studRecs.size(); i++) {
			printRecord(studRecs.get(i));
		}
		
	}
}
