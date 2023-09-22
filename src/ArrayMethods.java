
public class ArrayMethods{
    public static float wholeArraySum(float[] arr) {
        float total = 0f;
        for (int i =0;i<arr.length;i++){
                total += arr[i];
            }
            return total;
        }

    public static float sum(float[] arr, int lo, int hi){
            float total =0f;
            for(int i = lo;i<=hi-1;i++){
                total += arr[i];
            }
            return total;
        }

    public static float sum(float[] arr){
        float total =0f;
        for(int i = 0;i<=arr.length-1;i++){
            total += arr[i];
        }
        return total;
    }

    public static float sum(float[] arr,boolean[] ind){
        float total =0f;
        for(int i = 0;i<=arr.length-1;i++){
            if(ind[i] == true){
                total += arr[i];
            }
        }
        return total;
    }

    public static float sum(float[] arr,boolean[] ind,int lo,int hi){
        float total =0f;
        for(int i = lo;i<=hi-1;i++){
            if(ind[i] == true){
            total += arr[i];
            }
        }
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
            return 0f;
        }else{
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
            return 0f;
        }else{
            return total/num;
        }
    }

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

    /*public static float min(float[] arr, boolean[] arr2){
        float min ;
        int count =0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr2[i]==true){
                count++;
            }
        }
        if(count == 0){
            return Float.NaN;
        }
        
        if( arr.length == 0){
            return Float.NaN;
        }else{
            min = arr[0];
        }
        
        for(int i =0; i<=arr.length-1;i++){
            if(arr2[i]==true && arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print(min);
        return min;
    }

    public static float min(float[] arr, boolean[] arr2, int lo, int hi){
        float min;
        int count =0;
        if( hi == lo){
            return Float.NaN;
        }
        for(int i=lo;i<=hi-1;i++){
            if(arr2[i]==true){
                count++;
            }
        }
        if(count == 0){
            return Float.NaN;
        }
        if(arr.length == 0){
            min = Float.NaN;
        }else{
            min = arr[lo];
        }
        for(int i = lo; i<=hi-1;i++){
            if(arr2[i] == true){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        }
        System.out.print(min);
        return min;
    } */

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
        return logicalAndArray;
    }

    public static int count(boolean[] arr){
        int num =0;
        for(int i =0; i<=arr.length-1;i++){
            if(arr[i] == true){
                num +=1;
            }
        }
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
        return findArray;
    }


    public static void main(String[] arg){
        float [] arr8 = {1f, 2f, 3f, 4f};
        boolean[] arr14 = {false,false,false,false};
       // min(arr8,arr14,2,4);
    }
}