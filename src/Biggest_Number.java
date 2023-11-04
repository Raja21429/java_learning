import java.lanBiggest_Numberg.Object;
import java.util.Scanner;

public class Biggest_Number extends Object {
     
	//getting to input biggest program
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		/*int num1;
		int num2;
		int num3;
		System.out.println("Enter the Value");
		num1=s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println("A is biggest number");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("B is biggest number");
		}
		else
		{
			System.out.println("C is biggest number");
		}*/
		
		
		//give the input biggest program
		
		int a=100,b=20;
		if(a>b)
		{
			System.out.println("Biggest");
		}
		else if(a>=b)
		{
			System.out.println("The A number is same"+a);
			System.out.println("The B number is same" +b);		
		}
		else {
			System.out.println("lowest");
		}
		
		
	}

}
