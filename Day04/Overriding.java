package Day04;



class laptop{

	void os() {

		System.out.println("Windows 10");

	}

}

class Update extends laptop{

	void os() {

		System.out.println("Windows 11");

	}

}

public class Overriding {



	public static void main(String[] args) {

	 Update u=new Update();

	 u.os();

	}



}

