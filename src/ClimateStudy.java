import java.io.*;
import java.util.Scanner;

public class ClimateStudy {
    /** The main method reads from a file and prints the contents. */
  public static void main(String[] args) {
    String filename = (args.length > 0) ? args[0] : "YUMA_2023.txt";
    Scanner file = null;
    int numLines =0;
    int over30 =0;
    
    try {
      file = new Scanner(new File(filename));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }
    while (file.hasNextLine()) {
      numLines++;
      String line = file.nextLine();
      String[] fields = line.split("\\s+");
      String date = fields[1];
      float temperature = Float.valueOf(fields[8]);
      if(temperature > 30){
        over30++;
      }
      System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }

    float[] tempArray = new float[numLines];

    int i = 0;
    try {
        file = new Scanner(new File(filename));
    } catch (FileNotFoundException e) {
    System.err.println("Cannot locate file.");
    System.exit(-1);
    }
    while (file.hasNextLine()) {
        String line = file.nextLine();
        String[] fields = line.split("\\s+");
        String date = fields[1];
        float temperature = Float.valueOf(fields[8]);
        tempArray[i] = temperature;
        if(temperature > 30){
            over30++;
        }
        i++;
    }
    ArrayMethods.findFirst(ArrayMethods.isGreaterThan(tempArray,ArrayMethods.mean(tempArray)));

    file.close();

    


  }
  
}
