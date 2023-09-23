import java.io.*;
import java.util.Scanner;

public class ClimateStudy {
    /** The main method reads from a file and prints the contents. */
  public static void main(String[] args) throws FileNotFoundException {
    //int numLines =0;
    File fileOne = new File("YUMA_2023.txt");
    Scanner read = new Scanner(fileOne);
    while (read.hasNextLine()) {
      //numLines +=1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }
    System.out.println("hello");
    read.close();

    /* 
    int numLinesTwo =0;
    File fileTwo = new File("YUMA_2022.txt");
    read = new Scanner(fileTwo);
    while (read.hasNextLine()) {
      numLinesTwo +=1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }

    float[] tempArrayTwo = new float[numLinesTwo];
    String[] dateArrayTwo = new String[numLinesTwo];
    int indexTwo = 0;

    read = new Scanner(fileTwo);
    while (read.hasNextLine()) {
      String line = read.nextLine();
      String[] fields = line.split("\\s+");
      String date = fields[1];
      dateArrayTwo[indexTwo] = date;
      float temperature = Float.valueOf(fields[8]);
      tempArrayTwo[indexTwo] = temperature;
      indexTwo++;
    }
    
    boolean equalToArrayTwo[] = ArrayMethods.isEqualTo(tempArrayTwo,-9999.0f);
    boolean correctEqualToArrayTwo[] = ArrayMethods.logicalNot(equalToArrayTwo);
    float finalMeanTwo = ArrayMethods.mean(tempArrayTwo,correctEqualToArrayTwo);
    int firstAboveTwo = ArrayMethods.findFirst(ArrayMethods.isGreaterThan(tempArrayTwo,finalMeanTwo));
    int over30Two = ArrayMethods.count(ArrayMethods.isGreaterThan(tempArrayTwo,30));
    System.out.println("Days over 30: "+over30Two);
    System.out.println("First day above mean:" + dateArrayTwo[firstAboveTwo]);
    //FILE THREE
    int numLinesThree =0;
    File fileThree = new File("YUMA_2021.txt");
    read = new Scanner(fileThree);
    while (read.hasNextLine()) {
      numLinesThree +=1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }

    float[] tempArrayThree = new float[numLinesThree];
    String[] dateArrayThree = new String[numLinesThree];
    int indexThree = 0;

    read = new Scanner(fileThree);
    while (read.hasNextLine()) {
      String line = read.nextLine();
      String[] fields = line.split("\\s+");
      String date = fields[1];
      dateArrayThree[indexThree] = date;
      float temperature = Float.valueOf(fields[8]);
      tempArrayThree[indexThree] = temperature;
      indexThree++;
    }
    
    boolean equalToArrayThree[] = ArrayMethods.isEqualTo(tempArrayThree,-9999.0f);
    boolean correctEqualToArrayThree[] = ArrayMethods.logicalNot(equalToArrayThree);
    float finalMeanThree = ArrayMethods.mean(tempArrayThree,correctEqualToArrayThree);
    int firstAboveThree = ArrayMethods.findFirst(ArrayMethods.isGreaterThan(tempArrayThree,finalMeanThree));
    int over30Three = ArrayMethods.count(ArrayMethods.isGreaterThan(tempArrayThree,30));
    System.out.println("Days over 30: "+over30Three);
    System.out.println("First day above mean:" + dateArrayThree[firstAboveThree]);

    //FILE Four
    int numLinesFour =0;
    File fileFour = new File("YUMA_2020.txt");
    read = new Scanner(fileFour);
    while (read.hasNextLine()) {
      numLinesFour +=1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }

    float[] tempArrayFour = new float[numLinesFour];
    String[] dateArrayFour = new String[numLinesFour];
    int indexFour = 0;

    read = new Scanner(fileFour);
    while (read.hasNextLine()) {
      String line = read.nextLine();
      String[] fields = line.split("\\s+");
      String date = fields[1];
      dateArrayFour[indexFour] = date;
      float temperature = Float.valueOf(fields[8]);
      tempArrayFour[indexFour] = temperature;
      indexFour++;
    }
    
    boolean equalToArrayFour[] = ArrayMethods.isEqualTo(tempArrayFour,-9999.0f);
    boolean correctEqualToArrayFour[] = ArrayMethods.logicalNot(equalToArrayFour);
    float finalMeanFour = ArrayMethods.mean(tempArrayFour,correctEqualToArrayFour);
    int firstAboveFour = ArrayMethods.findFirst(ArrayMethods.isGreaterThan(tempArrayFour,finalMeanFour));
    int over30Four = ArrayMethods.count(ArrayMethods.isGreaterThan(tempArrayFour,30));
    System.out.println("Days over 30: "+over30Four);
    System.out.println("First day above mean:" + dateArrayFour[firstAboveFour]);

    //NEW FILE
    int numLinesFive =0;
    File fileFive = new File("YUMA_2019.txt");
    read = new Scanner(fileFive);
    while (read.hasNextLine()) {
      numLinesFive +=1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }

    float[] tempArrayFive = new float[numLinesFive];
    String[] dateArrayFive = new String[numLinesFive];
    int indexFive = 0;

    read = new Scanner(fileFive);
    while (read.hasNextLine()) {
      String line = read.nextLine();
      String[] fields = line.split("\\s+");
      String date = fields[1];
      dateArrayFive[indexFive] = date;
      float temperature = Float.valueOf(fields[8]);
      tempArrayFive[indexFive] = temperature;
      indexFive++;
    }
    
    boolean equalToArrayFive[] = ArrayMethods.isEqualTo(tempArrayFive,-9999.0f);
    boolean correctEqualToArrayFive[] = ArrayMethods.logicalNot(equalToArrayFive);
    float finalMeanFive = ArrayMethods.mean(tempArrayFive,correctEqualToArrayFive);
    int firstAboveFive = ArrayMethods.findFirst(ArrayMethods.isGreaterThan(tempArrayFive,finalMeanFive));
    int over30Five = ArrayMethods.count(ArrayMethods.isGreaterThan(tempArrayFive,30));
    System.out.println("Days over 30: "+over30Five);
    System.out.println("First day above mean:" + dateArrayFive[firstAboveFive]);
    
    //FILE SIX
    int numLinesSix =0;
    File fileSix = new File("YUMA_2018.txt");
    read = new Scanner(fileSix);
    while (read.hasNextLine()) {
      numLinesSix +=1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }

    float[] tempArraySix = new float[numLinesSix];
    String[] dateArraySix = new String[numLinesSix];
    int indexSix = 0;

    read = new Scanner(fileSix);
    while (read.hasNextLine()) {
      String line = read.nextLine();
      String[] fields = line.split("\\s+");
      String date = fields[1];
      dateArraySix[indexSix] = date;
      float temperature = Float.valueOf(fields[8]);
      tempArraySix[indexSix] = temperature;
      indexSix++;
    }
    
    boolean equalToArraySix[] = ArrayMethods.isEqualTo(tempArraySix,-9999.0f);
    boolean correctEqualToArraySix[] = ArrayMethods.logicalNot(equalToArraySix);
    float finalMeanSix = ArrayMethods.mean(tempArraySix,correctEqualToArraySix);
    int firstAboveSix = ArrayMethods.findFirst(ArrayMethods.isGreaterThan(tempArraySix,finalMeanSix));
    int over30Six = ArrayMethods.count(ArrayMethods.isGreaterThan(tempArraySix,30));
    System.out.println("Days over 30: "+over30Six);
    System.out.println("First day above mean:" + dateArraySix[firstAboveSix]);
    //file seven
    int numLinesSeven =0;
    File fileSeven = new File("YUMA_2017.txt");
    read = new Scanner(fileSeven);
    while (read.hasNextLine()) {
      numLinesSeven +=1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }

    float[] tempArraySeven = new float[numLinesSeven];
    String[] dateArraySeven = new String[numLinesSeven];
    int indexSeven = 0;

    read = new Scanner(fileSeven);
    while (read.hasNextLine()) {
      String line = read.nextLine();
      String[] fields = line.split("\\s+");
      String date = fields[1];
      dateArraySeven[indexSeven] = date;
      float temperature = Float.valueOf(fields[8]);
      tempArraySeven[indexSeven] = temperature;
      indexSeven++;
    }
    
    boolean equalToArraySeven[] = ArrayMethods.isEqualTo(tempArraySeven,-9999.0f);
    boolean correctEqualToArraySeven[] = ArrayMethods.logicalNot(equalToArraySeven);
    float finalMeanSeven = ArrayMethods.mean(tempArrayFive,correctEqualToArraySeven);
    int firstAboveSeven = ArrayMethods.findFirst(ArrayMethods.isGreaterThan(tempArraySeven,finalMeanSeven));
    int over30Seven = ArrayMethods.count(ArrayMethods.isGreaterThan(tempArraySeven,30));
    System.out.println("Days over 30: "+over30Seven);
    System.out.println("First day above mean:" + dateArraySeven[firstAboveSeven]);
    
    //file 8
    int numLinesEight =0;
    File fileEight = new File("YUMA_2016.txt");
    read = new Scanner(fileEight);
    while (read.hasNextLine()) {
      numLinesEight +=1;
      //System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }

    float[] tempArrayEight = new float[numLinesEight];
    String[] dateArrayEight = new String[numLinesEight];
    int indexEight = 0;

    read = new Scanner(fileEight);
    while (read.hasNextLine()) {
      String line = read.nextLine();
      String[] fields = line.split("\\s+");
      String date = fields[1];
      dateArrayEight[indexEight] = date;
      float temperature = Float.valueOf(fields[8]);
      tempArrayEight[indexEight] = temperature;
      indexEight++;
    }
    
    boolean equalToArrayEight[] = ArrayMethods.isEqualTo(tempArrayEight,-9999.0f);
    boolean correctEqualToArrayEight[] = ArrayMethods.logicalNot(equalToArrayEight);
    float finalMeanEight = ArrayMethods.mean(tempArrayEight,correctEqualToArrayEight);
    int firstAboveEight = ArrayMethods.findFirst(ArrayMethods.isGreaterThan(tempArrayEight,finalMeanEight));
    int over30Eight = ArrayMethods.count(ArrayMethods.isGreaterThan(tempArrayEight,30));
    System.out.println("Days over 30: "+over30Eight);
    System.out.println("First day above mean:" + dateArrayEight[firstAboveEight]);
     */
  }
}
