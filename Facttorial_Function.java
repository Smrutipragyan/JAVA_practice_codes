import java.util.Scanner;

public class Facttorial_Function {
	
	public static int Factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++)
		{
		  fact=fact*i;
		}
		 
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number -");
		int num=sc.nextInt();
		 
		System.out.println("The factorial of the number is:"+ Factorial(num));
	}

}
