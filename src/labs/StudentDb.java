package labs;

import java.util.Arrays;

public class StudentDb {

	public static void main(String[] args) {
		
		Student std1 = new Student("Dennis", "23487567");
		Student std2 = new Student("Ronald", "02581144");
		Student std3 = new Student("Daniel", "11587885");
		
		std1.enroll("Math541");
		std1.enroll("Eng123");
		std1.enroll("Programming670");
		std1.enroll("Databases004");
		std1.payFees(600);
		System.out.println(std1.toString());
		
		std2.enroll("Math541");
		System.out.println(std2.toString());

	} 

}

class Student {
	
	private static int studentId = 0;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private double balance = 0;
	private String courses = "";
	private static final double costOfCourse = 800;
	
	//constructor
	public Student(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
		studentId++;
		setEmail();
		setUserId();
	
	}
	
	//set email
	private void setEmail(){
		email = name.toLowerCase() + "." + studentId + "@school.com";
		System.out.println("Your email: " + email);
	}
	
	// set userId
	private void setUserId(){
		int id = (int)(Math.random()*8000)+1000;
		userId = studentId + "" + id + ssn.substring(ssn.length()-4,ssn.length());
		System.out.println("Your User Id: " + userId);
	}
	
	// set phone , city and state
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	// enroll method
	public void enroll(String course){
		this.courses = this.courses + " " + course ;
		balance += costOfCourse;
	}
	
	// payment of fees
	public void payFees(double amount){
		System.out.println("Amount Paid: ¢" + amount);
		balance -= amount;
	}
	
	// check balance
	public void checkBalance(){
		System.out.println("BALANCE ¢" + balance);
	}
	
	// show courses
	public void showCourses(){
		System.out.println(courses);
	
	}

	@Override
	public String toString() {
		return "[NAME: " + name + " ]\n[" + "COURSES: " + courses  + "]\n" + "BALANCE: ¢" + balance ; 
	}
	
	
}