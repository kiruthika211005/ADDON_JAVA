package Day02;



public class ExampleString {



	public static void main(String[] args) {

		String s1="hello";

		String s2=new String("Hello");

		//re-initialization or re-assigning

		String s3=s1;

		System.out.println(s1.equals((s2)));

		System.out.println(s1.equals((s3)));

        System.err.println(s1.charAt(1));

	}



}

