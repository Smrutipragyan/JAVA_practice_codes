import java.util.*;
public class Primes_In_Range {

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
		public static void PrimesInRange(int range)
		{
			for(int i=2;i<=range;i++)
			{
				if (Prime(i)==true)
				{
					System.out.println(i+" ");
				}
			}
			System.out.println( );
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range- ");
		int range=sc.nextInt();
		 PrimesInRange(20); 
	}

}
