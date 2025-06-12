package Day06;
import java.util.HashSet;
public class StudentEmail {
	
	public static void main(String[] args) {
		HashSet<String> stuemail=new HashSet();
		stuemail.add("blessy@gmail.com");
		stuemail.add("kiruthi@gmail.com");
		for(String data:stuemail) {
			System.out.println(data);
		}
	}

}
