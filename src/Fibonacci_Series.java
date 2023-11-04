import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
	//	System.out.println("Enter the Value: ");
		int num1=0;
		int num2=1;
		int sum;
		for(int i=1;i<=6;i++)
		{
			sum=num1+num2;
			System.out.println(sum);
			num1=num2;
			num2=sum;
			
		}
	}
}
	
	/*Explainaton     ->pakkathula pakkathula addition panni varathu 
	                  0 1 1 2 3 5 8
(step1)
    sum=num1+num2  ->0+1=1
    num1=num2      ->1
    num2=sum       ->1
(step2)
    sum=num1+num2  ->1+1=2
    num1=num2      ->1
    num2=sum       ->2       1 2
(step3)
    sum=num1+num2  ->1+2=3
    num1=num2      ->2
    num2=sum       ->3       1 2 3
(step4)
    sum=num1+num2  ->2+3=5
    num1=num2      ->3
    num2=sum       ->5       1 2 3 5
(step5)
    sum=num1+num2  ->3+5=8
    num1=num2      ->5
    num2=sum       ->8       1 2 3 5 8    */

