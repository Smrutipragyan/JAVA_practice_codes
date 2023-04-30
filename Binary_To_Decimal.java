import java.math.*;
public class Binary_To_Decimal {

	public static void Binary_Num(int BinaryNum)
	{
		int Mynum=BinaryNum;
		int Decimal=0;
		int pow=0;
		
		while(BinaryNum>0)
		{
			int LD=BinaryNum%10;
			Decimal=  (Decimal+(LD*(int)Math.pow(2,pow)));
			BinaryNum=BinaryNum/10;
			pow++;
			
		}
		
		System.out.println("The deciaml of my Binary num " +Mynum+" is "+Decimal);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Binary_Num(101); 
		  
	}

}
