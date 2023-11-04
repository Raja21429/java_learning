import java.util.Scanner;

public class Amstrong_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
	   int rem,sum=0,temp=n;
	  String str1=String.valueOf(n);
	   int len=str1.length();
	   while(n!=0) {
		   rem=n%10;
		   sum=(int)(sum+Math.pow(rem, len));
		   n=n/10;
	   }
	   System.out.println(sum);
	  // System.out.println(n);
	   if(sum==temp)
	   {
		   System.out.println("Amstrong Number");
	   }
	   else
	   {
		   System.out.println("Not Amstrong Number");
	   }
	   

	}

}
