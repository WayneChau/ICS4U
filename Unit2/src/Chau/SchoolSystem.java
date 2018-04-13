package Chau;

import java.util.Scanner;

/**
 * SchoolSystem.java
 * Method are created so that creates a record, allows the user to enter a data, and then returns a reference to that record.
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
		System.out.println("Press 1 - Enter New Record" + "\nPress 2 - Print to Screen" + "\nPress 3 - Quit");
		String option = sc.nextLine();
		while(!option.equals("1")||!option.equals("2")||!option.equals("3")) {
			option = sc.nextLine();
			if (option.equals("1")){
				Student r1 = createRecord();	// creates two new records
			}
			else if (option.equals("2")){
				printRecord(r1);
			}
			else if (option.equals("3")){
				
			}

		}


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
		r.setPhoneNumber(sc.nextLine());
		System.out.println("Please enter the student's student number:");
		r.setStudentNumber(sc.nextInt());
		System.out.println("Please enter the student's grade:");
		try {
			r.setGradeStudent(sc.nextInt());
		}
		catch(java.util.InputMismatchException r1){
			System.out.println("The value entered has to be digits. Please enter the student's grade:");
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
