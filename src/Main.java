
import java.util.Scanner;

class Student {
	String Name, Grade;
	int Roll_No;
	float Percentage;
	Scanner input = new Scanner(System.in);

	// Getting Input From User
	public void GetData() {
		System.out.println("Enter Student Name :");
		Name = input.next();

		System.out.println("Enter Student Roll No :");
		Roll_No = input.nextInt();

		 System.out.println("Enter Student Percentage ");
		Percentage = input.nextFloat();
	}
	
	//Calculating Grade Based on percentage
	public void CalculateGrade() {

		if (Percentage >= 75 && Percentage <= 99) {
			Grade = "A";
		}
		else if (Percentage < 75 && Percentage >= 50) {
			Grade = "B";
		}
		else if (Percentage < 50 && Percentage >= 35) {
			Grade = "C";
		}
		else if (Percentage > 99) {
			System.out.println("Enter valid Percentage ");
			GetData();
		} else {
			Grade = "Fail";
		}

	}

	// Displaying the data
	public void ShowData() {
		System.out.println("Student Name " + Name);
		System.out.println("Student Roll Number " + Roll_No);
		System.out.println("Student Percentage " + Percentage);
		System.out.println("Student Grade " + Grade);
		System.out.println("--------------------------");
	}
}

public class Main {

	public static void main(String[] args) {
		
		//Student 1
		Student s1 = new Student();
		s1.GetData();
		s1.CalculateGrade();
		s1.ShowData();
		
		//Student 1
		Student s2 = new Student();
		s2.GetData();
		s2.CalculateGrade();
		s2.ShowData();

		//Student 1
		Student s3 = new Student();
		s3.GetData();
		s3.CalculateGrade();
		s3.ShowData();
	}

}
