package Day4;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter num:");
			int a=s.nextInt();
			int num=a/0;
			System.out.println("Number:"+num);
	
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
