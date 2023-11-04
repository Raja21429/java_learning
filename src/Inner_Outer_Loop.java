import java.util.Scanner;

public class Inner_Outer_Loop {

	public static void main(String[] args) {
		int count=0;
		for(int i=0;i>0;i+=0) {
		
		count++;
		System.out.println(count);
		}
		//Scanner s=new Scanner(System.in);
		//left increment triangle
		/*for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println(" ");
		}*/
		
		//left decrement triangle
		/*int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
				
			}
			System.out.println(" ");
		}*/
		
		//left decrement triangle
	/*	for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.print("@");
			System.out.println();
		}*/
	
		//right decrement triangle
		/*for (int i=1;i<=5;i++)
		{
			for(int space=5;space>i;space--)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/

	}

}
