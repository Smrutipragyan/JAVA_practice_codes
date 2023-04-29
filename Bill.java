import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("The price of the notebook is:");
float notebook=sc.nextFloat();
System.out.println("The price of the pen is:");
float pen=sc.nextFloat();
System.out.println("The price of the pencil is:");
float pencil=sc.nextFloat();

float tot=notebook+pen+pencil;

System.out.println("The total bill amnt:"+tot);

double gst=(double)(tot*8)/100;
double bill=tot+gst;
System.out.println("The total bill after adding the gst is:"+bill);

	}

}
