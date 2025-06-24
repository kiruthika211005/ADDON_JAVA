package Day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainTask {
    public static void main(String[] args) {
        String inputFilePath = "student.txt"; 
        String outputFilePath = "result.txt";  
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\TEMP\\Desktop\\WD\\student.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\TEMP\\Desktop\\WD\\result.txt"));
            String line;
            int totalMarks = 0;
            int studentCount = 0;
while ((line = reader.readLine()) != null) {
                String[] parts = line.split(","); 
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    int marks = Integer.parseInt(parts[1].trim());
                    totalMarks += marks;
                    studentCount++;
                    writer.write(name + ": " + marks);
                    writer.newLine();
                }
            }
            double averageMarks = studentCount > 0 ? (double) totalMarks / studentCount : 0;
            writer.write("Total Marks: " + totalMarks);
            writer.newLine();
            writer.write("Average Marks: " + averageMarks);
            writer.newLine();
            reader.close();
            writer.close();
            System.out.println("Results written to " + ("C:\\Users\\TEMP\\Desktop\\WD\\result.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error:marks should needs to be int type");
        }
    }
}
