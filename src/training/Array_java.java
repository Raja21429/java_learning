package training;
import java.util.Scanner;

public class Array_java {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value: ");
		int n=s.nextInt();
		while(n>0) {
			if(n%10==1)
			{
				n=n+1;
				System.out.println(n);
				
			}
		
			if(n%10==0)
			{
				System.out.println(n);
				
			}
			n--;
		}
		
		

	}

}
