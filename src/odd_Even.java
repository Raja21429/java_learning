import java.util.Scanner;

public class odd_Even {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		/*System.out.println("Enter the number");
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}*/
		
//method-1	getting input and using for loop(Odd or even number
		                                     //show program
	/*	System.out.println("Enter the value");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
		  if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Even");
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
		System.out.println("Odd");
		
		o/p
		
		Enter the value
		10
		2
		4
		6
		8
		10
		Even
		1
		3
		5
		7
		9
		Odd      */

//method-2   getting input even number kum and getting input 
		                                   //odd number kum
	/*	System.out.println("Enter the value");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
		  if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Even");
		int n1=s.nextInt();
		for(int i=1;i<=n1;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
		System.out.println("Odd");
		
		
		/*o.p
		Enter the value
		20
		2
		4
		6
		8
		10
		12
		14
		16
		18
		20
		Even
		10
		1
		3
		5
		7
		9
		Odd*/
		
		
		 public static int maxofnos( int a, int b, int c) {
		   if(a>b && a>c ){
		      return a;
		   }
		   else if(b>a && b>c){
		       return b;
		   }
		   
		 }

		public static void main1(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println(maxofnos(a,b,c));
		
	

	}
	
	

}
