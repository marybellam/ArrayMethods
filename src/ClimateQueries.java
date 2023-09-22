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

    System.out.println("Source file: "+ filename);
    System.out.print("Annual mean temperature: ");
    ArrayMethods.mean(tempArray);
    System.out.println(" degrees Celsius");
    System.out.print("Minimum average daily temperature: ");
    ArrayMethods.min(tempArray);
    System.out.println(" degrees Celsius");
    System.out.print("Maximum average daily temperature: ");
    ArrayMethods.max(tempArray);
    System.out.println(" degrees Celsius");
    //get indexes for dates to find the temperature within that month???
    System.out.print("Mean temperature in January: ");
    ArrayMethods.mean(tempArray,0,31);
    System.out.println(" degrees Celsius");
    System.out.print("Mean temperature in July: ");
    ArrayMethods.mean(tempArray,181,212);
    System.out.println(" degrees Celsius");

    
    }
}