package Day04;



abstract class student{

	abstract void m1();

	

}

class display extends student{

	void m1(){

		System.out.println("hi...");

	}

	

}

public class program {



	public static void main(String[] args) {

	//student s1=new student();

		display d=new display();

		d.m1();

	}



}