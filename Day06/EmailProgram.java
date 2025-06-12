package Day06;
import java.util.HashMap;
import java.util.Map.Entry;
public class EmailProgram {

	public static void main(String[] args) {
		HashMap<String,Integer> studentMarks=new HashMap();
		studentMarks.put("john", 43);
		studentMarks.put("blessy", 80);
		studentMarks.put("rose", 43);
        int totalMarks=0;
        for(int marks:studentMarks.values()) {
        	totalMarks +=marks;
        }
        System.out.println("Student Total Marks:"+totalMarks);
            double average=totalMarks / studentMarks.size();
            System.out.println("Student Average Mark:"+average);
            for(Entry<String, Integer> entry : studentMarks.entrySet()) {
            	System.out.println(entry.getKey()+" "+entry.getValue());
            }
            
	}

}
