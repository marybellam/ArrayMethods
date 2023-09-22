import java.io.*;
import java.util.Scanner;

public class ClimateQueries {
    public static void main(String [] args){
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
        float[] tempArray = new float[numLines];
        String[] dateArray = new String[numLines];
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
            dateArray[i] = date;
            float temperature = Float.valueOf(fields[8]);
            tempArray[i] = temperature;
            i++;
        }
    file.close();
    //isequalto-band number
    //use logical not
    //mean method
    //method inside method

    boolean equalToArray[] = ArrayMethods.isEqualTo(tempArray,-9999.0f);
    boolean correctEqualToArray[] = ArrayMethods.logicalNot(equalToArray);
    float finalMean = ArrayMethods.mean(tempArray,correctEqualToArray);
    int finalNum = ArrayMethods.count(correctEqualToArray);
    float[] finalArray = new float[finalNum];
    int lineTrack =0;
    for(i=0;i<=correctEqualToArray.length-1;i++){
        if(correctEqualToArray[i] == true){
            finalArray[lineTrack] = tempArray[i];
            lineTrack++;
        }
    }
    
    //wants us to fix min and max to work with indices
    float averageMin = ArrayMethods.min(finalArray);
    float averageMax = ArrayMethods.max(finalArray);

    boolean datesInBetween[] =ArrayMethods.datesBetween(dateArray, "20230101", "20230131");
    boolean compare[] = ArrayMethods.logicalAnd(datesInBetween,correctEqualToArray);
    for(int j=0;j<=finalArray.length;j++){
        if(compare[j] == true){
            
        }
    }


    System.out.println("Source file: "+ filename);
    System.out.println("Annual mean temperature: " + finalMean +" degrees Celsius");
    System.out.println("Minimum average daily temperature: " + averageMin +" degrees Celsius");
    System.out.println("Maximum average daily temperature: " + averageMax +" degrees Celsius");
    System.out.println("Mean temperature in January: " + averageMax +" degrees Celsius");
    System.out.println("Mean temperature in July: " + averageMax +" degrees Celsius");


   /** 
    //get indexes for dates to find the temperature within that month???
    ArrayMethods.mean(tempArray,0,31);
    ArrayMethods.mean(tempArray,181,212);
/* */


    }
}