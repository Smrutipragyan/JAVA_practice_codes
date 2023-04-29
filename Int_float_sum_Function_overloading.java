
public class Int_float_sum_Function_overloading {

	public static int Sum(int a,int b)
	{
		return a+b;
	}
	public static float Sum(float a,float b)
	{
		return (a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Sum(2,8));
		System.out.println(Sum(2.5f,8.4f));
		

	}

}
