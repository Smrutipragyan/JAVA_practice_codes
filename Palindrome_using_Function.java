import java.util.Scanner;
public class Palindrome_using_Function {
public static void pallindrome(int num)
	{
		int reverse=0;
		int new_num=num;
		
		while(new_num!=0) {
		 int remainder=new_num%10;
		 reverse=reverse*10+remainder;
		 new_num=new_num/10;
		}
		if(num==reverse)
		{
			System.out.println("The number is pallindromic.");
		}
		else {
			System.out.println("The number is not pallindromic.");
		}
	}
	 public static void main(String[] args) {
		 
		pallindrome(999);
	}
}
