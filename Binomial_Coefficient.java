import java.util.Scanner;

public class Binomial_Coefficient {

	public static int Factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++)
		{
		  fact=fact*i;
		}
		 
		return fact;
	}
	public static int BinoCoeff(int n,int r)
	{
		int fact_n=Factorial(n);
		int fact_r=Factorial(r);
		int fact_nmr=Factorial(n-r);
		
		int BinoCoeff=fact_n/(fact_r*fact_nmr);
		return BinoCoeff;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n - ");
		 int n=sc.nextInt();
		 System.out.println("Enter the value of r - ");
		 int r=sc.nextInt();
		 
		System.out.println(BinoCoeff(n,r));
		 
		 
	}

}
