package Day6;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

	public static void main(String[] args) {
		HashMap<String, Integer> studm=new HashMap();
		studm.put("Rakshana", 45);
		studm.put("Reshma", 55);
		studm.put("Nithyashree", 75);
		int tot=0;
		for(int m:studm.values()) {
			tot+=m;	
		}
		System.out.println("Total marks:"+tot);
		double avg=tot/studm.size();
		System.out.println("Average:"+avg);
		for(Map.Entry<String, Integer> entry:studm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
