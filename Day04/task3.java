package Day4;

import java.io.FileWriter;
import java.io.IOException;
public class Task3 {
	public static void main(String[] args) {
		try {
			FileWriter myWriter=new FileWriter("C:\\Users\\TEMP\\Desktop\\WD\\Demo.txt");
			myWriter.write("KG COLLEGE OF ARTS AND SCIENCE");
			myWriter.close();
			System.out.println("Successfully");
		} catch (Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}

	}

}
