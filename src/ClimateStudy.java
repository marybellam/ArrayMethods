import java.io.*;
import java.util.Scanner;

public class ClimateStudy {
    /** The main method reads from a file and prints the contents. */
  public static void main(String[] args) {
    Scanner file = null;
    String[] files = {"YUMA_2023.txt","YUMA_2022.txt","YUMA_2021.txt","YUMA_2020.txt","YUMA_2019.txt","YUMA_2018.txt","YUMA_2017.txt","YUMA_2018.txt"};

    for(int i =0;i<=files.length-1;i++){
    try {
      file = new Scanner(new File(files[i]));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }
    while (file.hasNextLine()) {
      String line = file.nextLine();
      String[] fields = line.split("\\s+");
      String date = fields[1];
      float temperature = Float.valueOf(fields[8]);
      System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }
    
    file.close();
    }
  }
}
