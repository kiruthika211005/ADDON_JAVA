package Day06;
import java.util.ArrayList;
class ArrayListprogram {

	public static void main(String[] args) {
		ArrayList<Object> arr=new ArrayList<Object>();
        arr.add("blessy");
	    arr.add("P");
	    arr.add("conputer Science");
	    arr.add("3 year");
	    arr.add("0, kiruthi");
	    arr.add(2);
	    arr.add("4, kgcas");
	    System.out.println(arr.get(1));
	    
	    for(Object data:arr) {
	       System.out.println(data);
	    }
	}

}
