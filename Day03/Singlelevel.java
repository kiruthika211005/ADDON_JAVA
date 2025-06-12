package Day03;



public class Singlelevel {

      void Message() {

    	  System.out.println("sending....");

      }

}

 class subclass extends Singlelevel{

	 void View() {

		 System.out.println("received....");

	 }

 }

 class Main{

	 public static void main(String[] args) {

		 subclass s1=new subclass();

		 s1.Message();

		 s1.View();

	 }

 }

