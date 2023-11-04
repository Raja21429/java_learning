import java.util.Scanner;

public class Sum_of_digit {
    //Sum of first N natural number
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
	int n=s.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++)
	{                     
		sum=sum+i;
		//System.out.println(sum);	loop ku ulla print panna epdi execute akuthu nu        
	}                              // pathukalam.actual la namma loop pratis mudiyavum
	System.out.println(sum);       // than kudukanum.
	 //sum=15 is answer   
	
	/*o.p    ->1+2+3+4+5=15
		
		 sum=0+1=1      i++->sum=6+4=10   
    i++->sum=1+2=3    i++->sum1=10+5=15  ->sum=15 is answer 
    i++->sum=3+3=6
	

	//Sum of Digit
		
		System.out.println("Enter the value");
		int n=s.nextInt();
		int sum=0,rem;         
		while(n!=0)                    
			{                         
			rem=n%10;                  
			sum=sum+rem;
			n=n/10;    
			
			}        
		System.out.print(sum); 
		    
	                                    
	                      
    //Explaination      ->1*2*3=6                               
          
         /*   n=123  ->(n!=0) ->(123!=0)
                  rem=123%10=3
                  sum=0+3=3
                  n=123/10=12
             
            n=12    ->(n!=0) ->(12!=0)
                   rem=12%10=2
                   sum=3+2=5
                   n=12/10=1
             n=1     ->(n!=0)  ->(1!=0)
                    rem=1%10=1
                    modula 0 varatham epayume 1 than varuma
                    sum=5+1=6
            */
	}
}