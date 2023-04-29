
public class Character_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=8;
		char ch='A';
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
