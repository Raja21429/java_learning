
public class Pratice {

	public static void main(String[] args) {
		//int[] arr={9,10,12,22,49,58,78,100};
	/*	int[] arr={2,1,5,3,6};
		int i,j;
		for(i=0;i<arr.length;i++)
		
			System.out.println(arr[i]);
			for(j=i+1;j<arr.length;j++)
			
			System.out.println(arr[j]);
			
			if(arr[i]>arr[j])
			{
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				System.out.println(temp);
			}
	
		System.out.println(arr[i]);*/
		
		int[] a= {2,5,1,7,3,8,4,9,5};
		int val=8;
		int i=0;
		recursive(a,val,i,i+1);
		

	}

	private static void recursive(int[] a, int val, int i, int j) {
		if(a.length==i) {
			return;
		}
		else {
			System.out.println(a[i]);
			recursive(a,i+1);
		}
		
	}

}
