import java.util.Scanner;

public class PrimeNumber_Using_Function {

//	public static boolean Prime(int num)
//	{
//		for(int i=2;i<=num-1;i++)
//		{
//			if(num%i==0)
//			{
//			  return false;
//			}
//		}
//		return true;
//	}
	
	//OPTIMIZED CODE 
	
	public static boolean Prime(int num)
	{
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
			  return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number here: ");
		int num=sc.nextInt();
		System.out.println(Prime(num));
	}

}
