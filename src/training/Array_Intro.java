package training;

public class Array_Intro {

	public static void main(String[] args) {
		int[] arr= {1,12,23,34,8};
		
		Sorting sort = new Sorting();
		sort.bublesort1();
		//int j;
    /*  for (int i=0;i<arr.length;i++)
		{
		System.out.println(i+": "+arr[i]);
			for (int j=i+1;j<arr.length;j++)
			{
				System.out.println("new j : "+arr[j]+" "+j);
				
				
				if(arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					System.out.println(temp);
				}
			}
			System.out.println(arr[i]);
		}*/
		
		for(int i=0;i<arr.length-1;i++)
		{
		if(arr[i]>arr[i+1])
		{
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			i=-1;
			}
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
		}
	
	}

}
