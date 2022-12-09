package studendInsert;

import java.util.Scanner;

import NumberProgram.student;

public class studentMainOfClass 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		student[] str=new student[size];
		/// inserting the student details 
		for(int i=0; i<=str.length-1; i++)
		{
			System.out.println("Enter the student"+(i+1)+"details");
			System.out.println();
			System.out.println("Enter the Student name");
			String name=sc.nextLine();
			System.out.println();
			System.out.println("Enter the Student marks");
			double marks=sc.nextDouble();
		      str[i]=new student(name,marks);
			System.out.println("student"+(i+1)+"details inserted");
		}
		System.out.println("Details are");
		for(int i=0; i<=str.length-1;i++)
		{
			System.out.println(str[i]);
		}
		
	}

}
