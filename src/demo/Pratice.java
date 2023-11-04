package demo;

public class Pratice {
	public void cat()
	{
		int n=12325;
		int rem,rev=0,temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("Polindrome");
		}
		else
		{
			System.out.println("Not polindrome");
		}
	}

}
