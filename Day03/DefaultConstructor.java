package Day03;



//public class DefaultConstructor 

	  //{

	// DefaultConstructor(){

//		System.out.println("Default Constructor"); 

//	 }

//	public static void main(String[] args) {

///	   // to create a object

  //     //classname reference varaible=new classname();

		

//		 DefaultConstructor ref=new  DefaultConstructor();	

//	}



//

//}

public class DefaultConstructor{

	String language;

	String name;

	int year;

	//parameterized constructor

	DefaultConstructor(String name, int year, String lang){

		this.name=name;

		this.year=year; 

		this.language=lang;

	//	System.out.println("User defined Contructor "+name+" "+year+ " "+lang);

	}

	void display() {

		System.out.println("User defined Contructor "+name+" "+year+ " "+language);

	}

	//copy constructor

	DefaultConstructor(DefaultConstructor copy){

		this.name=copy.name;

		this.year=copy.year; 

		this.language=copy.language;

	}

	

	public static void main(String[]args) {

		 // to create a object

		//classname reference varaible=new classname();

		DefaultConstructor ref1=new DefaultConstructor("java",1995,"programming");

		ref1.display();

		//reference to another object

		System.out.println("copy constructor");

		DefaultConstructor ref2=new DefaultConstructor(ref1);

		ref2.display();

	}

	

}

