import java.util.Scanner;

public class Reverse_store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

		int num=654321;
		int rev=0;
		while(num>0)
		{
			int ld=num%10;
			rev=rev*10+ld;
			num=num/10;;
			 
		}
		System.out.println(rev);
	}

}
