import java.util.Scanner;

public class LargestOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1:");
		int num1=sc.nextInt();
		System.out.println("enter num2");
		int num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("The largest among the 2 numbers is:"+num1);
		}
		else
		{
			System.out.println("The largest among the 2 numbers is:"+num2);
		}
	}

}
