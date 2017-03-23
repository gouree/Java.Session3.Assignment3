import java.util.*;
public class Student {
	
	public static void main(String args[])
	{
		
		StudentDetails s1=new StudentDetails();
		StudentDetails s2=new StudentDetails();
		StudentDetails s3=new StudentDetails();
		
	
		s1.accept_details();
		s2.accept_details();
		s3.accept_details();
		
		System.out.println("Thank you!");
	}
}	
	class StudentDetails
	{
		int id, marks;
		String name, grade;
		Scanner input= new Scanner(System.in);
		
		public StudentDetails()
		{
			System.out.println("Object created ");
		}
		
		
		void accept_details()
		{
			
			System.out.println("Enter Student name :");
			name= input.next();
			
			System.out.println("Enter Student id :");
			id= input.nextInt();
			
			System.out.println("Enter Student marks :");
			marks= input.nextInt();
			
			this.calculate_grade();
		}
		
		void calculate_grade()
		{
			if(marks >70)
				grade="Distinction";
			else if(marks >60)
				grade="First class";
			else if ( marks > 40)
				grade="Second class";
			else
				grade="Fail";
			
			this.display_details();
		}
		
		void display_details()
		{
			System.out.println("Student details");
			System.out.println("   Name --> "+name+"Id --> "+id+"  marks --> "+marks+"  grade --> "+grade);
			
		}
	
	}


