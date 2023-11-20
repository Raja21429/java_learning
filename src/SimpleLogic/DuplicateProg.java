package SimpleLogic;

import java.util.Scanner;

public class DuplicateProg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value");
		String name=s.next();
		char[] arr=name.toCharArray();
		//for(int i=0;i<name.length();i++) {
		//	arr[i]=s.nextLine();
		
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
				
			}
		}

	}

}
