package Chau;

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

	/**
	 * The entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		int option = 0; //command chosen
		int idx1 = 0; //index of student to input information
		int idx2 = 0; //Print index of student 
		int counter = -1; //counts how many student(s) to choose from
		Student [] Student = new Student [100];
		//do while loops are implemented with try catch in order to use the try catch more than once in case error occur repeatedly
		do {
			System.out.println("Press 1 - Enter New Record" + "\nPress 2 - Print to Screen" + "\nPress 3 - Quit");
			option = 0;
			do {
				try {
					option = sc.nextInt();
					error = false;
				} 
				catch(InputMismatchException e){
					System.out.println("Please chose the following options using the digits listed." + "\nPress 1 - Enter New Record" + "\nPress 2 - Print to Screen" + "\nPress 3 - Quit");
					sc.nextLine();
					error = true;
				}
			}while(error == true);

			sc.nextLine();
			//checks if any of the three options are inputed, reads again to obtain a command
			while(option != 1 && option != 2 && option != 3) {
				System.out.println("Please chose the following options using the digits listed." + "\nPress 1 - Enter New Record" + "\nPress 2 - Print to Screen" + "\nPress 3 - Quit");
				do {
					try {
						option = sc.nextInt();
						error = false;
					} catch(InputMismatchException e){
						System.out.println("Please chose the following options using the digits listed." + "\nPress 1 - Enter New Record" + "\nPress 2 - Print to Screen" + "\nPress 3 - Quit");
						sc.nextLine();
						error = true;
					}
				}while(error == true);
				sc.nextLine();
			}
			if (option == 1){
				Student [idx1] = createRecord(); // creates two new records
				counter++;
				idx1++;
			}
			if (option == 2){
				if (counter > 0) {
					//different students to choose from to print
					System.out.println("Which student do you want to print? Choose from: 0 to " + counter);
					do {
						try {
							idx2 = sc.nextInt();
							error = false;
						} catch(InputMismatchException e){
							System.out.println("Please enter the student number you desire to print. Choose from: 0 to " + counter);
							sc.nextLine();
							error = true;
						}
					}while(error == true);
					sc.nextLine();
					//if the student information requested does not exist in the database
					while (idx2 < 0 || idx2 > counter) {
						System.out.println("The student does not exist in the database. Please enter the student number you desire to print. Choose from: 0 to " + counter);
						do {
							try {
								idx2 = sc.nextInt();
								error = false;
							} catch(InputMismatchException e){
								System.out.println("The student does not exist in the database. Please enter the student number you desire to print. Choose from: 0 to " + counter);
								sc.nextLine();
								error = true;
							}
						}while(error == true);
					}
					printRecord(Student [idx2]);
				}
				if (counter == 0) {
					//only one student to print
					System.out.println("The only student in the database.");
					printRecord(Student [0]);
				}
				if (counter == -1) {
					System.out.println("There are no information of any student in the database.");
				}
			}
			//quits the program
		}while (option != 3);
		System.out.println("GoodBye, See You Soon!");

	}

	/**
	 * This method will get the information required to set the fields in
	 * the record.
	 * @param r - the Student to get data for
	 */
	public static Student createRecord() {
		
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
			} catch(InputMismatchException e){
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
			} catch(InputMismatchException e){
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
			} catch(InputMismatchException e){
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
		System.out.println("Student Record: \nFirst Name: " + r.getFirstName() + "\nLast Name: " + r.getLastName() + "\nMiddle Initial: " +r.getMiddleInitial() + "\nEmail: " + r.getEmail() + "\nStreet Address: " + r.getStreetAddress() + "\nCity: " + r.getCity() + "\nPostal Code: " + r.getPostalCode() + "\nProvince: " + r.getProvince() + "\nStudent Number: " + r.getStudentNumber() + "\nGrade: " + r.getGradeStudent() + "\nPhone Number: " + r.getPhoneNumber());
	}
}
