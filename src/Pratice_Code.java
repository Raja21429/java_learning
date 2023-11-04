import java.util.Scanner;

public class Pratice_Code {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value: ");
		int n=s.nextInt();
		/*for(int i=n;n>0;i--)
		{                                                        
			if(i%10==2)
			{
				i=i+1;
				System.out.println(i);
				break;
			}
		}
		for (int i=n;n>0;i--)
		{
			if(i%10==0)
			{
				System.out.println(i);
				break;
			}
		}
		o.p
		Enter the Value: 
			54
			53
			50*/
		System.out.println("Even Number: ");
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				
				System.out.print(i);
			}
			System.out.print(" ");
		}
		System.out.println("Odd Number: ");
		for(int i=0;i<=n;i++) {
			if(i%2==1)
			{
				System.out.print(i);
			}
			System.out.print(" ");
		}
	}
		
	

}
