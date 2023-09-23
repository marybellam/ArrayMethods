import java.io.*;
import java.util.Scanner;

public class ClimateStudy {
    /** The main method reads from a file and prints the contents. */
  public static void main(String[] args) throws FileNotFoundException {
    int numLines =0;
    File fileOne = new File("YUMA_2023.txt");
    Scanner read = new Scanner(fileOne);
    while (read.hasNextLine()) {
      numLines +=1;
      String line = read.nextLine();
      String[] fields = line.split("\\s+");
      String date = fields[1];
      float temperature = Float.valueOf(fields[8]);
      System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }

    float[] tempArray = new float[numLines];
    String[] dateArray = new String[numLines];
    int i = 0;

    read = new Scanner(fileOne);
    while (read.hasNextLine()) {
      String line = read.nextLine();
      String[] fields = line.split("\\s+");
      String date = fields[1];
      dateArray[i] = date;
      float temperature = Float.valueOf(fields[8]);
      tempArray[i] = temperature;
      i++;
    }
    
    boolean equalToArray[] = ArrayMethods.isEqualTo(tempArray,-9999.0f);
    boolean correctEqualToArray[] = ArrayMethods.logicalNot(equalToArray);
    float finalMean = ArrayMethods.mean(tempArray,correctEqualToArray);
    int firstAbove = ArrayMethods.findFirst(ArrayMethods.isGreaterThan(tempArray,finalMean));
    int over30 = ArrayMethods.count(ArrayMethods.isGreaterThan(tempArray,30));
    System.out.println("Days over 30: "+over30);
    System.out.println("First day above mean:" + dateArray[firstAbove]);

    File fileTwo = new File("YUMA_2022.txt");
    read = new Scanner(fileTwo);
    while(read.hasNextLine()){
      String data = read.nextLine();
      System.out.println(data);
    }
  }
}
