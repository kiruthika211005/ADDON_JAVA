package Day6;

import java.util.HashSet;

public class Task2 {

	public static void main(String[] args) {
		HashSet<String>email=new HashSet();
		email.add("Yogapriya@gmail.com");
		email.add("Hello@gmail.com");
		for(String data:email) {
			System.out.println(data);
		}

	}

}
