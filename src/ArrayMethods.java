import java.util.*;

public class ArrayMethods{
    public static float wholeArraySum(float[] arr) {
        float total = 0f;
        for (int i =0;i<arr.length;i++){
                total += arr[i];
            }
            System.out.print(total);
            return total;
        }

    public static float sum(float[] arr, int lo, int hi){
            float total =0f;
            for(int i = lo;i<=hi-1;i++){
                total += arr[i];
            }
            System.out.print(total);
            return total;
        }

    public static float sum(float[] arr){
        float total =0f;
        for(int i = 0;i<=arr.length-1;i++){
            total += arr[i];
        }
        System.out.print(total);
        return total;
    }

    public static float mean(float[] arr, int lo, int hi){
        float total =0f;
        float num =0;
        for(int i = lo;i<=hi-1;i++){
            total += arr[i];
            num+=1;
        }
        if(num == 0){
            System.out.print(0.0);
            return 0f;
        }else{
            System.out.print(total/num);
            return total/num;
        }

    }

    public static float mean(float[] arr){
        float total =0f;
        float num =0;
        for(int i = 0;i<=arr.length-1;i++){
            total += arr[i];
            num+=1;
        }
        if(num == 0){
            System.out.print(0.0);
            return 0f;
        }else{
            System.out.print(total/num);
            return total/num;
        }
    }

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
            System.out.print(min);

        }
        System.out.print(min);
        return min;
    }

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
        System.out.print(min);
        return min;
    }

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
        System.out.print(max);
        return max;
    }

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
        System.out.print(max);
        return max;
    }

    public static boolean[] isEqualTo(float[] arr, float num){
        boolean[] equalArray = new boolean[arr.length];
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i] == num){
                equalArray[i] = true;
            }else{
                equalArray[i] = false;
            }
        }
        System.out.print(equalArray);
        return equalArray;
    }

    public static boolean[] logicalNot(boolean arr[]){
        boolean[] logicArray = new boolean[arr.length];
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i] == true){
                logicArray[i] = false;
            }else{
                logicArray[i] = true;
            }
        }
        System.out.print(logicArray);
        return logicArray;
    }

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
            System.out.print(total/num);
            return total/num;
        }

    }

    public static boolean[] isGreaterThan(float arr[], float num){
        boolean[] greaterArray = new boolean[arr.length];
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i] > num){
                greaterArray[i] = true;
            }else{
                greaterArray[i] = false;
            }
        }
        System.out.print(greaterArray);
        return greaterArray;
    }

    public static boolean[] datesBetween(String arr[], String lo,String hi){
        boolean[] betweenArray = new boolean[arr.length];
        float[] betweenArrayFloat = new float[arr.length];
        
        int newLo = Integer.parseInt(lo);
        int newHi = Integer.parseInt(hi);
        for(int i = 0; i<=arr.length-1;i++){
            betweenArrayFloat[i] = Float.parseFloat(arr[i]);
        }

        for(int i = 0; i<=betweenArrayFloat.length-1;i++){
            if(betweenArrayFloat[i]>newLo && betweenArrayFloat[i]<newHi){
                betweenArray[i] = true;
            }else{
                betweenArray[i] = false;
            }
        }
        System.out.print(betweenArray);
        return betweenArray;
    }

    public static boolean[] logicalAnd(boolean[] arr, boolean[] arr2){
        boolean[] logicalAndArray = new boolean[arr.length];
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i] == false || arr2[i] == false){
                logicalAndArray[i] = false;
            }else{
                logicalAndArray[i] = true;
            }
        }
        System.out.print(logicalAndArray[1]);
        return logicalAndArray;
    }

    public static float count(boolean[] arr){
        float num =0;
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i] == true){
                num +=1;
            }
        }
        System.out.print(num);
        return num;
    }

    public static float findFirst(boolean[] arr){
        float num =-1;
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i] == true){
                num =i;
                break;
            }
        }
        System.out.print(num);
        return num;
    }

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
        System.out.print(findArray);
        for(int o =0;o<=findArray.length-1;o++){
            System.out.println(findArray[o]);
        }
        return findArray;
    }


    public static void main(String[] arg){
        boolean[] arr1 = {false, true, true, false, true};
        find(arr1);
    }
}