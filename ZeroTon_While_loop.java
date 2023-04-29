import java.util.Scanner;

public class ZeroTon_While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of times you want to print the number:");
		int num=sc.nextInt();
		int input=0;
		
		while(input <= num )
		{
			System.out.println(input);
			input++;
		}
	}

}
