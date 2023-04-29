import java.util.Scanner;

public class prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number here:");
		int n=sc.nextInt();
		
		if(n==2)
		{
			System.out.println(n+" is a prime number");
		}
		else {
		boolean isPrime =true;
		for(int i=2;i<=Math.sqrt(n);i++)  //it can go 2 to n-1
		{
			if(n%i==0)
			{
				isPrime=false;
			}
		}
		
		if(isPrime==true)
		{
			System.out.println(n+" is a prime number.");
		}
		else
		{
			System.out.println(n+" Is not a prime number.");
		}
	}
	}
}
