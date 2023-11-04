import java.util.Scanner;

public class reverse_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int rem,rev=0;
		int n=s.nextInt();
		while(n>0)
		{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		System.out.print(rev);
		
		s.close();
		
	/*	Explaination
		
		n=6789     ->(step1)
		rem=n%10
		rem=6789%10  ->rem=9  6789%10=9
		rev=0+9=9
		n=6789/10=678  ->intha answera vachu than namma next same formula la execute panna porom
		
		n=678      ->(step2)
		rem=678%10=8
		rev=0+8=8
		n=678/10=67
		
		n=67       ->(step3)
        rem=67%10=7
        rev=0+7=7
        n=67/10=6
        
        n=6        ->(step4)
        rem=6%10=6                 so rem=6%10=0.6 ->remaider la 0.6 vantha 6 than namma eudkanum
        rev=0+6=6
        n=6/10=0    */
	}

}
