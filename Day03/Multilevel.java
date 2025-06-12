package Day03;

//super class

 class superclass{

	 void method1() {

		 System.out.println("superclass");

	 }

 }

 //subclass1

 class subclass1 extends superclass{

	 void method2() {

		 System.out.println("subclass1");

	 }

 }

 //subclass2

 class subclass2 extends subclass1{

	 void method3() {

		 System.out.println("subclass2");

	 }

 }

public class Multilevel {

   public static void main(String[] args) {

	   subclass2 c2=new subclass2();

	   c2.method1();

	   c2.method2();

	   c2.method3();

	   

   }

}

