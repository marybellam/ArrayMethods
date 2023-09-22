import org.junit.*;
import static org.junit.Assert.*;

public class ArrayMethodsTest {

    @Test
    public void testWholeArraySum() {
        float[] arr1 = { 1f, 2f, 3f, 4f };
        assertEquals("[1 2 3 4] -> 10", 10f, ArrayMethods.wholeArraySum(arr1), 1e-6);
        float [] arr2 = {-7.5f,3.2f};
        assertEquals("[-7.5 3.2] -> -4.3", -4.3f, ArrayMethods.wholeArraySum(arr2), 1e-6);
        float [] arr3 = {};
        assertEquals("[] -> 0", 0f, ArrayMethods.wholeArraySum(arr3), 1e-6);
        float [] arr4 = {5f};
        assertEquals("[5] -> 5", 5f, ArrayMethods.wholeArraySum(arr4), 1e-6);
        float [] arr5 = {6f,10f,-5f};
        assertEquals("[6 10 -5] -> 11", 11f, ArrayMethods.wholeArraySum(arr5), 1e-6);
        }

    @Test
    public void sum() {
        float[] arr1 = { 1f, 2f, 3f, 4f };
        assertEquals("[1 2 3 4] -> 5", 5f, ArrayMethods.sum(arr1,1,3), 1e-6);
        float [] arr2 = {1f, 2f, 3f, 4f};
        assertEquals("[1 2 3 4] -> 10", 10f, ArrayMethods.sum(arr2,0,4), 1e-6);
        float [] arr3 = {1f, 2f, 3f, 4f};
        assertEquals("[1 2 3 4] -> 0", 0f, ArrayMethods.sum(arr3,2,2), 1e-6);
        float [] arr4 = {2f,3f,1f,4f};
        assertEquals("[2 3 1 4] -> 5", 5f, ArrayMethods.sum(arr4,0,2), 1e-6);
        float [] arr5 = {2f,4f,6f,8f};
        assertEquals("[2 4 6 8] -> 8", 8f, ArrayMethods.sum(arr5,3,4), 1e-6);
        float [] arr6 = {1f,2f};
        assertEquals("[1 2] -> ", 1f, ArrayMethods.sum(arr6,0,1), 1e-6);

        float[] arr7 = { 1f, 2f, 3f, 4f };
        assertEquals("[1 2 3 4] -> 10", 10f, ArrayMethods.sum(arr7), 1e-6);
        float [] arr8 = {-7.5f,3.2f};
        assertEquals("[-7.5 3.2] -> -4.3", -4.3f, ArrayMethods.sum(arr8), 1e-6);
        float [] arr9 = {};
        assertEquals("[] -> 0", 0f, ArrayMethods.sum(arr9), 1e-6);
        float [] arr10 = {5f};
        assertEquals("[5] -> 5", 5f, ArrayMethods.sum(arr10), 1e-6);
        float [] arr11 = {6f,10f,-5f};
        assertEquals("[6 10 -5] -> 11", 11f, ArrayMethods.sum(arr11), 1e-6);
        }

    @Test
    public void mean(){
        float[] arr1 = { 1f, 2f, 3f, 4f };
        assertEquals("[1 2 3 4] -> 3.5", 3.5f, ArrayMethods.mean(arr1,2,4), 1e-6);
        float [] arr2 = {1f, 2f, 3f, 4f};
        assertEquals("[1 2 3 4] -> 2.5", 2.5f, ArrayMethods.mean(arr2), 1e-6);
        float [] arr3 = {};
        assertEquals("[] -> 0", 0f, ArrayMethods.mean(arr3), 1e-6);
        float [] arr4 = {3f};
        assertEquals("[3] -> 3", 3f, ArrayMethods.mean(arr4), 1e-6);
        float [] arr5 = {-5f,0f,2f,3f,10f};
        assertEquals("[-5 0 2 3 10] -> 2", 2f, ArrayMethods.mean(arr5), 1e-6);
        float [] arr6 = {2f,4f,6f,8f};
        assertEquals("[2 4 6 8] -> 5", 5f, ArrayMethods.mean(arr6), 1e-6);
        float [] arr7 = {1f, -9999f, 3f, 2f};
        boolean [] arr8 = {true, false, true, true};
        assertEquals("[1.0, -9999.0, 3.0, 2.0], [true, false, true, true] -> 2", 2f, ArrayMethods.mean(arr7,arr8,0,4), 1e-6);
        float [] arr9 = {1f,2f,3f,4f};
        boolean [] arr10 = {false, true, true, true};
        assertEquals("[1 2 3 4], [false, true, true, true] -> 3", 3f, ArrayMethods.mean(arr9,arr10,0,4), 1e-6);
        float [] arr11 = {1f, -9999f, 3f, 2f};
        boolean [] arr12 = {true, false, true, true};
        assertEquals("[1.0, -9999.0, 3.0, 2.0], [true, false, true, true] -> 0", 0f, ArrayMethods.mean(arr11,arr12,0,0), 1e-6);
        }

    @Test
    public void min(){
        float[] arr1 = { 1f, 2f, 3f, 4f };
        assertEquals("[1 2 3 4] -> 2.0", 2f, ArrayMethods.min(arr1,1,4), 1e-6);
        float [] arr2 = {1f, 2f, 3f, 4f};
        assertEquals("[1 2 3 4] -> 1.0", 1f, ArrayMethods.min(arr2), 1e-6);
        float [] arr3 = {};
        assertEquals("[] -> Float.Nan", Float.NaN, ArrayMethods.min(arr3), 1e-6);
        float [] arr4 = {10f,20f,30f};
        assertEquals("[10 20 30] -> 10.0", 10f, ArrayMethods.min(arr4), 1e-6);
        float [] arr5 = {-5f, 0f, 5f, 10f};
        assertEquals("[-5 0 5 10] -> -5.0", -5f, ArrayMethods.min(arr5), 1e-6);
        float [] arr6 = {-5f,10f,5f,0f};
        assertEquals("[-5 10 5 0] -> Float.NaN", Float.NaN, ArrayMethods.min(arr6,2,2), 1e-6); //Should this return float nan? or the actual value
        }
    
    @Test
    public void max(){
        float[] arr1 = { 1f, 2f, 3f, 4f };
        assertEquals("[1 2 3 4] -> 4.0", 4f, ArrayMethods.max(arr1,1,4), 1e-6);
        float [] arr2 = {1f, 3f,2f};
        assertEquals("[1 3 2] -> 3.0", 3f, ArrayMethods.max(arr2), 1e-6);
        float [] arr3 = {1f,3f,2f};
        assertEquals("[1 3 2] -> Float.NaN", Float.NaN, ArrayMethods.max(arr3,0,0), 1e-6);
        float [] arr4 = {};
        assertEquals("[] -> Float.NaN", Float.NaN, ArrayMethods.max(arr4), 1e-6);
        float [] arr5 = {-5f, 0f, 5f, 10f};
        assertEquals("[-5 0 5 10] -> 10", 10f, ArrayMethods.max(arr5), 1e-6);
        float [] arr6 = {10f, 20f, 30f};
        assertEquals("[10 20 30] -> 20f", 20f, ArrayMethods.max(arr6,0,2), 1e-6);
        }

    @Test
    public void isEqualTo(){
        float[] arr1 = {1f,2f,3f,2f};
        assertArrayEquals("[1 2 3 2] -> [false, true, false, true]",new boolean[] {false,true,false,true},ArrayMethods.isEqualTo(arr1,2f));
        float[] arr2 = {1.0f, -9999.0f, 3.0f, 2.0f};
        assertArrayEquals("[1.0, -9999.0, 3.0, 2.0] -> [false, true, false, false]",new boolean[] {false,true,false,false},ArrayMethods.isEqualTo(arr2,-9999f));
        float[] arr3 = {3f, 3.0f, 3f};
        assertArrayEquals("[3.0, 3.0, 3.0] -> [true, true, true]",new boolean[] {true,true,true},ArrayMethods.isEqualTo(arr3,3));
        float[] arr4 = {10f,20f,30f,40,50f};
        assertArrayEquals("[10.0 20.0 30.0 40.0 50.0] -> [false, false, false, false, false]",new boolean[] {false,false,false,false,false},ArrayMethods.isEqualTo(arr4,100f));
    }

    @Test
    public void logicalNot(){
        boolean[] arr1 = {false, true, false, false};
        assertArrayEquals("[false true false false] -> [true, false, true, true]",new boolean[] {true, false, true, true},ArrayMethods.logicalNot(arr1));
        boolean[] arr2 = {true, false,true,false};
        assertArrayEquals("[true false true false] -> [false, true, false, true]",new boolean[] {false, true, false, true},ArrayMethods.logicalNot(arr2));
        boolean[] arr3 = {true, true, true, true, true};
        assertArrayEquals("[true true true true true] -> [false, false, false, false, false]",new boolean[] {false, false, false, false, false},ArrayMethods.logicalNot(arr3));
        boolean[] arr4 = {false, false, false};
        assertArrayEquals("[false false false] -> [true, true, true]",new boolean[] {true, true, true},ArrayMethods.logicalNot(arr4));
    }

    @Test
    public void isGreaterThan(){
        float[] arr1 = {1f,2f,3f,2.5f};
        assertArrayEquals("[1.0, 2.0, 3.0, 2.5] -> [false, false, true, false]",new boolean[] {false, false, true, false},ArrayMethods.isGreaterThan(arr1,2.5f));
        float[] arr2 = {2f,4f,8f,10f};
        assertArrayEquals("[2 4 8 10] -> [true, true, true, true]",new boolean[] {true, true, true, true},ArrayMethods.isGreaterThan(arr2,1f));
        float[] arr3 = {1f,1f,4f,4f};
        assertArrayEquals("[1 1 4 4] -> [false, false, false, false]",new boolean[] {false, false, false, false},ArrayMethods.isGreaterThan(arr3,5f));
        float[] arr4 = {10f,2f,8f,3f};
        assertArrayEquals("[10 2 8 3] -> [true, false, true,false]",new boolean[] {true, false, true,false},ArrayMethods.isGreaterThan(arr4,5f));
    }

    @Test
    public void datesBetween(){
        String[] arr1 = {"20230101","20230214","20230704"};
        assertArrayEquals("[20230101,20230214,20230704] -> [false true false]",new boolean[] {false, true, false},ArrayMethods.datesBetween(arr1,"20230201", "20230601"));
    }

    @Test
    public void logicalAnd(){
        boolean[] arr1 = {false, true, true, false};
        boolean[] arr2 ={false, true, false, true};
        assertArrayEquals("[false, true, true, false], [false, true, false, true] -> [false, true, false, false]",new boolean[] {false, true, false, false},ArrayMethods.logicalAnd(arr1,arr2));
    }

    @Test
    public void count(){
        boolean[] arr1 = {false, true, true, false, true};
        assertEquals("[false, true, true, false, true] -> 3", 3f, ArrayMethods.count(arr1), 1e-6);
    }

    @Test
    public void findFirst(){
        boolean[] arr1 = {false, false, true, false, true};
        assertEquals("[false, false, true, false, true] -> 2", 2f, ArrayMethods.findFirst(arr1), 1e-6);
        boolean[] arr2 = {false, false, false};
        assertEquals("[false, false, false] -> -1", -1f, ArrayMethods.findFirst(arr2), 1e-6);
    }

    @Test
    public void findTest(){
        boolean[] arr1 = {false, true, true, false, true};
        assertArrayEquals(new int[] {1,2,4},ArrayMethods.find(arr1));
    }

        
    public static void main(String[] args) {
       //testWholeArraySum();
    }    
}
