import java.util.Scanner;

public class Donot_Print_Multipleof_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 
		
		do {
			System.out.println("enter the number-");
			int num=sc.nextInt();
			if(num%10==0) {
				continue;
			}
			System.out.println("The number was:"+num);
		}while(true);

	}

}
