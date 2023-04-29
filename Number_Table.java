import java.util.Scanner;

public class Number_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbere:");
		int num=sc.nextInt();
		System.out.println("Table of the number "+num+" is : ");
		for(int i=1;i<=10;i++)
		{
			 
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}

}
