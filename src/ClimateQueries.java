import java.io.*;
import java.util.Scanner;
/**
 * The main method reads from a file and prints the contents.
 */
public class ClimateQueries {
    public static void main(String [] args){
        //Reads the file to find the amount of lines in the file
        int numLines = 0;
        String filename = (args.length > 0) ? args[0] : "YUMA_2023.txt";
        Scanner file = null;

        try {
            file = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.err.println("Cannot locate file.");
            System.exit(-1);
        }
        while (file.hasNextLine()) {
            numLines +=1;
            String line = file.nextLine();
            String[] fields = line.split("\\s+");
            String date = fields[1];
            float temperature = Float.valueOf(fields[8]);
            System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
        }
        //Initializing arrays
        float[] tempArray = new float[numLines];
        String[] dateArray = new String[numLines];
        int i = 0;

        //Reads the file and adds information into arrays
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
            dateArray[i] = date;
            float temperature = Float.valueOf(fields[8]);
            tempArray[i] = temperature;
            i++;
        }
    file.close();
 
    //Gets rid of missing data and finds the Annual mean temperature,Minimum average daily temperature, Maximum average daily temperature,Mean temperature in January, andMean temperature in July:
    boolean equalToArray[] = ArrayMethods.isEqualTo(tempArray,-9999.0f);
    boolean inverseEqualToArray[] = ArrayMethods.logicalNot(equalToArray);
    float finalMean = ArrayMethods.mean(tempArray,inverseEqualToArray);
    float averageMin = ArrayMethods.min(tempArray,inverseEqualToArray);
    float averageMax = ArrayMethods.max(tempArray,inverseEqualToArray);
    boolean datesInBetween[] =ArrayMethods.datesBetween(dateArray, "20230101", "20230131");    
    boolean combineJanArrays[] =ArrayMethods.logicalAnd(datesInBetween,inverseEqualToArray);
    boolean datesInBetween2[] =ArrayMethods.datesBetween(dateArray, "20230701", "20230731");    
    boolean combineJulyArrays[] =ArrayMethods.logicalAnd(datesInBetween2,inverseEqualToArray);
    float finalMeanJan = ArrayMethods.mean(tempArray,combineJanArrays);
    float finalMeanJuly = ArrayMethods.mean(tempArray,combineJulyArrays);

    //Prints out the information
    System.out.println("Source file: "+ filename);
    System.out.println("Annual mean temperature: " + finalMean +" degrees Celsius");
    System.out.println("Minimum average daily temperature: " + averageMin +" degrees Celsius");
    System.out.println("Maximum average daily temperature: " + averageMax +" degrees Celsius");
    System.out.println("Mean temperature in January: " + finalMeanJan +" degrees Celsius");
    System.out.println("Mean temperature in July: " + finalMeanJuly +" degrees Celsius");

    }
}