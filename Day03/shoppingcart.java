package Day03;



public class shoppingcart {



	void add_to_card(String category, int price) {

		System.out.println("your category: "+category);

		System.out.println("item price : "+price);

	}

	void add_to_card(String category, int price, int quantity) {

		int total= price*quantity;

		System.out.println(total);

	}

	

	public static void main(String[] args) {

	    shoppingcart in=new shoppingcart();

	    in.add_to_card("maxi",250);

	    in.add_to_card("maxi",250,2);

	}



}

