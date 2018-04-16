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

	/**
	 * The entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		int option = 0;
		int idx1 = 0; //index of student to input information
		int idx2 = 0; //Print index of student
		Student [] Student= new Student [100];
		do {
			System.out.println("Press 1 - Enter New Record" + "\nPress 2 - Print to Screen" + "\nPress 3 - Quit");
			option = 0;
			option = sc.nextInt();
			sc.nextLine(); 
			//checks if any of the three options are inputed, reads again to obtain a command
			while(option != 1 && option != 2 && option != 3) {
				option = sc.nextInt();
			}
			if (option == 1){
				Student [idx1] = createRecord(); // creates two new records

			}
			else if (option == 2){
				System.out.println("Which student do you want to print?");
				idx2 = sc.nextInt();
				printRecord(Student [idx2]);
			}
			idx1++;
		}while (option != 3);
		System.out.println("GoodBye, See You Soon!");

	}

	/**
	 * This method will get the information required to set the fields in
	 * the record.
	 * @param r - the Student to get data for
	 */
	public static Student createRecord() {
		Student r = new Student();	
		System.out.println("Please enter the student's first name:");
		r.setFirstName(sc.nextLine());
		System.out.println("Please enter the student's last name:");
		r.setLastName(sc.nextLine());
		System.out.println("Please enter the student's middle initial:");
		r.setMiddleInitial(sc.nextLine());
		System.out.println("Please enter the student's email:");
		r.setEmail(sc.nextLine());
		System.out.println("Please enter the student's street address:");
		r.setStreetAddress(sc.nextLine());
		System.out.println("Please enter the student's city:");
		r.setCity(sc.nextLine());
		System.out.println("Please enter the student's postal code:");
		r.setPostalCode(sc.nextLine());
		System.out.println("Please enter the student's province:");
		r.setProvince(sc.nextLine());
		System.out.println("Please enter the student's phone number:");
		try {
		r.setPhoneNumber(sc.nextInt());
		} catch(InputMismatchException e){
		System.out.println("The value entered has to be digits. Please enter the student's phone number:");
		sc.nextLine();
		r.setPhoneNumber(sc.nextInt());
		}
		System.out.println("Please enter the student's student number:");
		try {
		r.setStudentNumber(sc.nextInt());
		} catch(InputMismatchException e){
			System.out.println("The value entered has to be digits. Please enter the student's student number:");
			sc.nextLine();
			r.setStudentNumber(sc.nextInt());
		}
		System.out.println("Please enter the student's grade:");
		try {
			r.setGradeStudent(sc.nextInt());
		} catch(InputMismatchException e){
			System.out.println("The value entered has to be digits. Please enter the student's grade:");
			sc.nextLine();
			r.setGradeStudent(sc.nextInt());
		}

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
