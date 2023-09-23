/***
 * Class of all the Methods used which have to do with comparison, or mathmatical functions
 */
public class ArrayMethods{
    
    /**
     * Takes an input array and adds all of the elements
     * @param arr - array being input with values which are added together
     * @return total - total sum of the elements in the array
     */
    public static float wholeArraySum(float[] arr) {
        float total = 0f;
        for (int i =0;i<arr.length;i++){
                total += arr[i];
            }
            return total;
        }

    /**
     * Takes an input array and adds all of the elements within the range given by lo and hi
     * @param arr array being input with values which are added together
     * @param lo the lowest value for range
     * @param hi the highest value for range
     * @return total - total sum of the elements in the array within the range
     */
    public static float sum(float[] arr, int lo, int hi){
            float total =0f;
            for(int i = lo;i<=hi-1;i++){
                total += arr[i];
            }
            return total;
        }
    /**
     * Adds all of the elemts in the array
     * @param arr array being input with values which are added together
     * @return total - total sum of the elements in the array
     */
    public static float sum(float[] arr){
        float total =0f;
        for(int i = 0;i<=arr.length-1;i++){
            total += arr[i];
        }
        return total;
    }
    /**
     * Takes an array, and sums up values that which correlate to true in the ind array
     * @param arr - array being input with values which are added together
     * @param ind - an array of boolean elements
     * @return total - total sum of the elements
     */
    public static float sum(float[] arr,boolean[] ind){
        float total =0f;
        for(int i = 0;i<=arr.length-1;i++){
            if(ind[i] == true){
                total += arr[i];
            }
        }
        return total;
    }
    /**
     * Sums up the numbers in an array within a given range and dependant on indicator variables
     * @param arr an array with floats
     * @param ind an array of boolean elements
     * @param lo the lowest value for range
     * @param hi - the highest value for range
     * @return total - total sum of the elements
     */
    public static float sum(float[] arr,boolean[] ind,int lo,int hi){
        float total =0f;
        for(int i = lo;i<=hi-1;i++){
            if(ind[i] == true){
            total += arr[i];
            }
        }
        return total;
    }
    /**
     * Finds the mean of a given array within a certain range
     * @param arr a float array
     * @param lo the lowest value in the range
     * @param hi the highest value for range
     * @return the mean of the given array
     */
    public static float mean(float[] arr, int lo, int hi){
        float total =0f;
        float num =0;
        for(int i = lo;i<=hi-1;i++){
            total += arr[i];
            num+=1;
        }
        if(num == 0){
            return 0f;
        }else{
            return total/num;
        }

    }
    /**
     * Finds the mean of a given array
     * @param arr array with floats
     * @return mean of a given array
     */
    public static float mean(float[] arr){
        float total =0f;
        float num =0;
        for(int i = 0;i<=arr.length-1;i++){
            total += arr[i];
            num+=1;
        }
        if(num == 0){
            return 0f;
        }else{
            return total/num;
        }
    }
    /**
     * Fidns the mean of a given array dependant on indicator variables
     * @param arr float array with values
     * @param arr2 boolean array with indicator variables
     * @return the mean of the array 
     */
    public static float mean(float[] arr, boolean[] arr2){
        float total =0f;
        float num =0;
        for(int i = 0;i<=arr.length-1;i++){
            if(arr2[i] == true){
                total += arr[i];
                num+=1;
            }
        }
        if(num == 0){
            return 0f;
        }else{
            return total/num;
        }
    }

    /**
     * Finds the mean of an array within a given range and using indicator variables
     * @param arr float array with values
     * @param arr2 boolean array with indicator variables
     * @param lothe lowest value in the range
     * @param hi the highest value for range
     * @return mean of a given array
     */
    public static float mean(float[] arr, boolean[] arr2, int lo, int hi){
        float total =0f;
        float num =0;
        for(int i = lo;i<=hi-1;i++){
            if(arr2[i] == true){
                total += arr[i];
                num+=1;
            }
        }
        if(num == 0){
            System.out.print(0.0);
            return 0f;
        }else{
            return total/num;
        }

    }

    /**
     * Finds the minimum value in an array within a given range
     * @param arr float array with numerical values
     * @param lo the lowest value in the range
     * @param hi the highest value for range
     * @return minimum value in the array
     */
    public static float min(float[] arr, int lo, int hi){
        float min ;
        if( hi == lo){
            return Float.NaN;
        }
        if(arr.length == 0){
            min = Float.NaN;
        }else{
            min = arr[lo];
        }
        for(int i = lo; i<=hi-1;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    /**
     * Finds the minimum value of a given array
     * @param arr - array with numercal values
     * @return the minimum value
     */
    public static float min(float[] arr){
        float min;
        if(arr.length == 0 ){
            min = Float.NaN;
        }else{
            min = arr[0];
        }
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    /**
     * Finds the minimum value of an array and uses indicator variables
     * @param arr float array with numerical values
     * @param arr2 boolean array with indicator variables
     * @return the minimum value in array
     */
    public static float min(float[] arr, boolean[] arr2){
        float min ;
        float count =0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr2[i]==true){
                count++;
            }
        }

        if(count == 0){
            System.out.println("Float.NaN");
            return Float.NaN;
        }
        
        if( arr.length == 0){
            return Float.NaN;
        }else{
            min = 100000000;
        }

        for(int i =0; i<=arr.length-1;i++){
            if(arr2[i] ==true){
                if(min>arr[i]){
                    min = arr[i];
                }
            }
        }
        return min; 
    }
    /**
     * Finds the min number in an array between a given range of numbers and indicator variables
     * @param arr float array with numerical values
     * @param arr2 - boolean array with indicator variables
     * @param lo the lowest value in the range
     * @param hi the highest value for range
     * @return min value within an array
     */
    public static float min(float[] arr, boolean[] arr2,int lo,int hi){
        float min ;
        float count =0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr2[i]==true){
                count++;
            }
        }
         if( hi == lo){
            return Float.NaN;
        }
        if(count == 0){
            return Float.NaN;
        }
        if(arr.length == 0){
            return Float.NaN;
        }else{
            min = 100000000;
        }
        System.out.println(min);
        for(int i =lo; i<=hi-1;i++){
            if(arr2[i] ==true){
                if(min>arr[i]){
                    min = arr[i];
                }
            }
        }
        System.out.print(min);
        return min;
    }
    /**
     * Finds the maximum value in an awway within a given range
     * @param arr float array with numerical values
     * @param lo the lowest value in the range
     * @param hi the highest value for range
     * @return the maximum value
     */
    public static float max(float[] arr, int lo, int hi){
        float max;
        if( hi == lo){
            return Float.NaN;
        }
        if(arr.length == 0){
            max = Float.NaN;
        }else{
            max = arr[lo];
        }

        for(int i = lo; i<=hi-1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    /**
     * Finds the max value in an array
     * @param arr float array with numerical values
     * @return the maximum value
     */
    public static float max(float[] arr){
        float max = 0;
        if(arr.length == 0){
            max = Float.NaN;
        }else{
            max = arr[0];
        }
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    /**
     * Finds the max value in an array with indicator vaiables
     * @param arr float array with numerical values
     * @param arr2 boolean array with indicator variables
     * @return the max value
     */
    public static float max(float[] arr,boolean[] arr2){
        float max ;
        float count =0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr2[i]==true){
                count++;
            }
        }
        
        if(count == 0){
            System.out.println("Float.NaN");
            return Float.NaN;
        }
        
        if( arr.length == 0){
            return Float.NaN;
        }else{
            max = 0;
        }

        for(int i =0; i<=arr.length-1;i++){
            if(arr2[i] ==true){
                if(max<arr[i]){
                    max = arr[i];
                }
            }
        }
        return max; 
    }
    /**
     * Finds the max value in an array betwwen a given range while using indicator variables
     * @param arr float array with numerical values
     * @param arr2 boolean array with indicator variables
     * @param lo the lowest value in the range
     * @param hi the highest value for range
     * @return the max value
     */
    public static float max(float[] arr, boolean[] arr2,int lo,int hi){
        float max ;
        float count =0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr2[i]==true){
                count++;
            }
        }
         if( hi == lo){
            return Float.NaN;
        }
        if(count == 0){
            return Float.NaN;
        }
        if(arr.length == 0){
            return Float.NaN;
        }else{
            max = 0;
        }
        System.out.println(max);
        for(int i =lo; i<=hi-1;i++){
            if(arr2[i] ==true){
                if(max<arr[i]){
                    max = arr[i];
                }
            }
        }
        System.out.print(max);
        return max;
    }
    /**
     * Finds if elements in an array are equal to a given number
     * @param arr float array with numerical values
     * @param num the number being compared to
     * @return a boolean array where true meanas it is the same value and false is that they are not the same value
     */
    public static boolean[] isEqualTo(float[] arr, float num){
        boolean[] equalArray = new boolean[arr.length];
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i] == num){
                equalArray[i] = true;
            }else{
                equalArray[i] = false;
            }
        }
        return equalArray;
    }
    /**
     * Takes a boolean array and returns an inverse of that array
     * @param arr boolean array 
     * @return boolean array that is the opposite of arr
     */
    public static boolean[] logicalNot(boolean arr[]){
        boolean[] logicArray = new boolean[arr.length];
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i] == true){
                logicArray[i] = false;
            }else{
                logicArray[i] = true;
            }
        }
        return logicArray;
    }

    /**
     * Finds if elements in an array are greater than a given number
     * @param arr float array with numerical values
     * @param num the given number
     * @return a boolean array, true when the element is greater than the num and false otherwise
     */
    public static boolean[] isGreaterThan(float arr[], float num){
        boolean[] greaterArray = new boolean[arr.length];
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i] > num){
                greaterArray[i] = true;
            }else{
                greaterArray[i] = false;
            }
        }
        return greaterArray;
    }
    /**
     * Finds whether elements in a string array are in between two given dates
     * @param arr a string array which has dates
     * @param lo the lowest value in the range
     * @param hi the highest value in the range
     * @return a boolean array, where true is that the string element goes between the lo and hi element and false otherwise
     */
    public static boolean[] datesBetween(String arr[], String lo,String hi){
        boolean[] betweenArray = new boolean[arr.length];
        float[] betweenArrayFloat = new float[arr.length];
        
        int newLo = Integer.parseInt(lo);
        int newHi = Integer.parseInt(hi);
        for(int i = 0; i<=arr.length-1;i++){
            betweenArrayFloat[i] = Float.parseFloat(arr[i]);
        }

        for(int i = 0; i<=betweenArrayFloat.length-1;i++){
            if(betweenArrayFloat[i]>=newLo && betweenArrayFloat[i]<=newHi){
                betweenArray[i] = true;
            }else{
                betweenArray[i] = false;
            }
        }
        return betweenArray;
    }
    /**
     * Gets an array which has a false element if either of the elements inputed have a false element at that index, otherwise has true at that index
     * @param arr a boolean array
     * @param arr2 a boolean array
     * @return a boolean array which has a true element if both arrays have true in that index, otherwise has a false element
     */
    public static boolean[] logicalAnd(boolean[] arr, boolean[] arr2){
        boolean[] logicalAndArray = new boolean[arr.length];
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i] == false || arr2[i] == false){
                logicalAndArray[i] = false;
            }else{
                logicalAndArray[i] = true;
            }
        }
        return logicalAndArray;
    }
    /**
     * Counts the amount of true elements in a boolean array
     * @param arr a boolean array
     * @return the amount of true elements in a boolean array
     */
    public static int count(boolean[] arr){
        int num =0;
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i] == true){
                num +=1;
            }
        }
        return num;
    }
    /**
     * Finds the first index of a true element in a boolean array
     * @param arr a boolean array
     * @return the first index of a true element
     */
    public static int findFirst(boolean[] arr){
        int num =-1;
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i] == true){
                num =i;
                break;
            }
        }
        return num;
    }
    /**
     * Finds all of the indexes of the true elements in a boolean array
     * @param arr - a boolean array
     * @return an array with the indexs of the true elements in the boolean array
     */
    public static int[] find(boolean[] arr){
        int num =0;
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i] == true){
                num +=1;
            }
        }
        int[] findArray = new int[num];
        int j=0;
        for(int l =0; l<=arr.length-1;l++){
            if(arr[l] == true){
                findArray[j] = l;
                j++;

            }
        }
        return findArray;
    }


    public static void main(String[] arg){
        float [] arr8 = {1f, 2f, 3f, 4f};
        boolean[] arr14 = {false,false,true,true};
        min(arr8,arr14,0,4);

    }
}