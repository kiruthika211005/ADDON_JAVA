package Day03;



public class laptop {

	String model;

	int size;

	laptop(String model ,int size ){

		this.model=model;

		this.size=size;

	}

	void display() {

		System.out.println("laptop "+model +" "+size);

	}

	laptop(laptop copy){

		this.model=copy.model;

		this.size=copy.size;

	}

	public static void main(String[] args) {

	 laptop l1=new laptop("apple", 34);

	 l1.display();

	 System.out.println("copy constructor");

		laptop l2=new laptop(l1);

		l2.display();

	}



}

