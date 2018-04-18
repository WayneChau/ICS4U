package Chau;

/**
 * Student.java
 * Gathers information
 * April 13th, 2018
 * @author WayneChau
 */
public class Student {

		private String firstName, lastName, middleInitial, email, streetAddress, city, postalCode, province;
		private int studentNumber, gradeStudent;
		private long phoneNumber;
		
		/**
		 * Initialize the fields of an object
		 * @param firstName - first name the first name to set
		 * @param lastName - last name the last name to set
		 * @param middleInitial - middle initial the middle initial to set
		 * @param email - email the email to set
		 * @param streetAddress - street address the street address to set
		 * @param city - city the city to set
		 * @param postalCode - postal code the postal code to set
		 * @param province - province the province to set
		 * @param studentNumber - student number the student number to set
		 * @param gradeStudent - grade the grade to set
		 * @param phoneNumber - phone number the phone number to set
		 */
		public Student (String firstName, String lastName, String middleInitial, String email, String streetAddress, String city, String postalCode, String province, int studentNumber, int gradeStudent, long phoneNumber) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.middleInitial = middleInitial;
			this.email = email;
			this.streetAddress = streetAddress;
			this.city = city;
			this.postalCode = postalCode;
			this.province = province;
			this.studentNumber = studentNumber;
			this.gradeStudent = gradeStudent;
			this.phoneNumber = phoneNumber;
		}
		
		/**
		 * Returns the first name of this Student
		 * @return the first name 
		 */
		public String getFirstName() {
			return firstName;
		}
		/**
		 * Sets the first name of the song for this Student
		 * @param first name the first name to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		/**
		 * Returns the last name of this Student
		 * @return the last name 
		 */
		public String getLastName() {
			return lastName;
		}
		/**
		 * Sets the last name of the song for this Student
		 * @param last name the last name to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		/**
		 * Returns the middle initial of this Student
		 * @return the middle initial
		 */
		public String getMiddleInitial() {
			return middleInitial;
		}
		/**
		 * Sets the middle initial of the song for this Student
		 * @param middle initial the middle initial to set
		 */
		public void setMiddleInitial(String middleInitial) {
			this.middleInitial = middleInitial;
		}
		
		/**
		 * Returns the email of this Student
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}
		/**
		 * Sets the email of the song for this Student
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}
		
		/**
		 * Returns the street address of this Student
		 * @return the street address 
		 */
		public String getStreetAddress() {
			return streetAddress;
		}
		/**
		 * Sets the street address of the song for this Student
		 * @param street address the street address to set
		 */
		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}
		
		/**
		 * Returns the city of this Student
		 * @return the city 
		 */
		public String getCity() {
			return city;
		}
		/**
		 * Sets the city of the song for this Student
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}
		
		/**
		 * Returns the postal code of this Student
		 * @return the postal code 
		 */
		public String getPostalCode() {
			return postalCode;
		}
		/**
		 * Sets the postal code of the song for this Student
		 * @param postal code the postal code to set
		 */
		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}
		
		/**
		 * Returns the province of this Student
		 * @return the province 
		 */
		public String getProvince() {
			return province;
		}
		/**
		 * Sets the province of the song for this Student
		 * @param province the province to set
		 */
		public void setProvince(String province) {
			this.province = province;
		}
		
		/**
		 * Returns the student number of this Student
		 * @return the student number 
		 */
		public int getStudentNumber() {
			return studentNumber;
		}
		/**
		 * Sets the student number of the song for this Student
		 * @param student number the student number to set
		 */
		public void setStudentNumber(int studentNumber) {
			this.studentNumber = studentNumber;
		}
		
		/**
		 * Returns the grade of this Student
		 * @return the grade
		 */
		public int getGradeStudent() {
			return gradeStudent;
		}
		/**
		 * Sets the grade of the song for this Student
		 * @param grade the grade to set
		 */
		public void setGradeStudent(int gradeStudent) {
			this.gradeStudent = gradeStudent;
		}
		
		/**
		 * Returns the phone number of this Student
		 * @return the phone number 
		 */
		public long getPhoneNumber() {
			return phoneNumber;
		}
		/**
		 * Sets the phone number of the song for this Student
		 * @param phone number the phone number to set
		 */
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

	

}
