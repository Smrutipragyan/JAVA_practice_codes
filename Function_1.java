import java.util.Scanner;

public class Function_1 {
	
	public static int printSum(int a,int b) {
		 
		int sum=a+b;
		return sum;
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first num-");
		int a=sc.nextInt();
		System.out.println("Enter the second num-");
		int b=sc.nextInt();
		 
		 int sum=printSum(a,b);
		 System.out.println("The sum of the two numbers = "+ sum);
		
	}

}
