
public class Sum_of_digits {

	private static void Sum_of_Digits(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int ld=num%10;
			sum=sum+ld;
			num/=10;
		}
		 System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum_of_Digits(666);
		 
	}

}
