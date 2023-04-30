
public class Decimal_To_Binary {

	public static void Decimal_Num(int num)
	{
		int mynum=num;
		int pow=0;
		int binarynum=0;
		
		while(num>0)
		{
			int rem=num%2;    //calculation of reminder
			binarynum=binarynum+(rem*(int)Math.pow(10,pow));
			num=num/2;        //Quotient calculation
			pow++;
		}
		System.out.println("The Decimal of "+mynum+" is "+binarynum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Decimal_Num(5);
	}

}
