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
        float [] arr6 = {6f,10f,10f,20f};
        assertEquals("[6 10 10 20] -> 46", 46f, ArrayMethods.wholeArraySum(arr6), 1e-6);
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

        boolean[] arr22 = {false, true, false, false};
        float[] arr12 = { 1f, 2f, 3f, 4f };
        assertEquals("[1 2 3 4] [false true false false] -> 2", 2f, ArrayMethods.sum(arr12,arr22), 1e-6);
        float [] arr13 = {-7.5f,3.2f};
        boolean[] arr23 = {false, false};
        assertEquals("[-7.5 3.2] [false false]-> 0", 0f, ArrayMethods.sum(arr13,arr23), 1e-6);
        float [] arr14= {};
        boolean[] arr24 = {true};
        assertEquals("[] [true]-> 0", 0f, ArrayMethods.sum(arr14,arr24), 1e-6);
        float [] arr15 = {5f};
        boolean[] arr25 = {true};
        assertEquals("[5] [true]-> 5", 5f, ArrayMethods.sum(arr15,arr25), 1e-6);
        float [] arr16 = {6f,10.5f,-5f};
        boolean[] arr26 = {true,true,true};
        assertEquals("[6 10.5 -5] [true true true true] -> 11.5", 11.5f, ArrayMethods.sum(arr16,arr26), 1e-6);

        boolean[] arr27 = {false, true, true, false};
        float[] arr17 = { 1f, 2f, 3f, 4f };
        assertEquals("[1 2 3 4] [false true true false] -> 2", 5f, ArrayMethods.sum(arr17,arr27,0,3), 1e-6);
        float [] arr18 = {-7.5f,3.2f};
        boolean[] arr28 = {false, true};
        assertEquals("[-7.5 3.2] [false true]-> 3.2", 3.2f, ArrayMethods.sum(arr18,arr28,0,2), 1e-6);
        float [] arr19= {2f,4f,6f,8f,10f};
        boolean[] arr29 = {true,false,true,false,true};
        assertEquals("[2 4 6 8 10] [true false true false true]-> 8", 8f, ArrayMethods.sum(arr19,arr29,0,4), 1e-6);
        float [] arr20 = {5f};
        boolean[] arr30 = {true};
        assertEquals("[5] [true]-> 0", 0f, ArrayMethods.sum(arr20,arr30,0,0), 1e-6);
        float [] arr21 = {6f,10.5f,-5f,2f};
        boolean[] arr31 = {false,false,false,false};
        assertEquals("[6 10.5 -5 2f] [false false false false] -> 0", 0f, ArrayMethods.sum(arr21,arr31,2,4), 1e-6);
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
        float [] arr5 = {-5f,0f,-4f,3f,10f};
        assertEquals("[-5 0 -4 3 10] -> -3", -3f, ArrayMethods.mean(arr5,0,3), 1e-6);
        float [] arr6 = {2f,4f,6f,8f};
        assertEquals("[2 4 6 8] -> 0", 0f, ArrayMethods.mean(arr6,3,3), 1e-6);

        float [] arr7 = {1f, -9999f, 3f, 2f};
        boolean [] arr8 = {true, false, true, true};
        assertEquals("[1.0, -9999.0, 3.0, 2.0], [true, false, true, true] -> 2", 2f, ArrayMethods.mean(arr7,arr8,0,4), 1e-6);
        float [] arr9 = {1f,2f,3f,4f};
        boolean [] arr10 = {false, true, true, true};
        assertEquals("[1 2 3 4], [false, true, true, true] -> 3.5", 3.5f, ArrayMethods.mean(arr9,arr10,2,4), 1e-6);
        float [] arr11 = {1f, -9999f, 3f, 2f};
        boolean [] arr12 = {true, false, true, true};
        assertEquals("[1.0, -9999.0, 3.0, 2.0], [true, false, true, true] -> 0", 0f, ArrayMethods.mean(arr11,arr12,0,0), 1e-6);
        
        float [] arr13 = {1f, -9999f, 3f, 2f};
        boolean [] arr14 = {true, false, true, true};
        assertEquals("[1.0, -9999.0, 3.0, 2.0], [true, false, true, true] -> 2", 2f, ArrayMethods.mean(arr13,arr14), 1e-6);
        float [] arr15 = {1f,2f,3f,4f};
        boolean [] arr16 = {false, true, true, true};
        assertEquals("[1 2 3 4], [false, true, true, true] -> 3", 3f, ArrayMethods.mean(arr15,arr16), 1e-6);
        float [] arr17 = {1f, -9999f, 3f, 2f};
        boolean [] arr18 = {false, false, false, false};
        assertEquals("[1.0, -9999.0, 3.0, 2.0], [true, false, true, true] -> 0", 0f, ArrayMethods.mean(arr17,arr18), 1e-6);
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
        assertEquals("[10 20 30] -> 10", 10f, ArrayMethods.min(arr4,0,2), 1e-6);
        float [] arr5 = {-5f, 0f, 5f, 10f};
        assertEquals("[-5 0 5 10] -> -5.0", -5f, ArrayMethods.min(arr5), 1e-6);
        float [] arr6 = {-5f,10f,5f,0f};
        assertEquals("[-5 10 5 0] -> Float.NaN", Float.NaN, ArrayMethods.min(arr6,2,2), 1e-6);

        /*float[] arr7 = { 1f, 2f, 3f, 4f };
        boolean[] arr13 = {false,false,false,true};
        assertEquals("[1 2 3 4] -> 3.0", 4f, ArrayMethods.min(arr7,arr13,2,4), 1e-6);
        float [] arr8 = {1f, 2f, 3f, 4f};
        boolean[] arr14 = {false,false,false,false};
        assertEquals("[1 2 3 4] -> 0.0", Float.NaN, ArrayMethods.min(arr8,arr14), 1e-6);
        float [] arr9 = {};
        boolean[] arr15 = {};
        assertEquals("[] -> Float.Nan", Float.NaN, ArrayMethods.min(arr9,arr15), 1e-6);
        float [] arr10 = {10f,20f,30f};
        boolean[] arr16 = {false,true,false};
        assertEquals("[10 20 30] -> 20.0", 20f, ArrayMethods.min(arr10,arr16), 1e-6);
        float [] arr11 = {-5f, 0f, 5f, 10f};
        boolean[] arr17 = {false,true,false,true};
        assertEquals("[-5 0 5 10] -> 0.0", 0f, ArrayMethods.min(arr11,arr17,0,2), 1e-6);
        float [] arr12 = {-5f,10f,5f,0f};
        boolean[] arr18 = {true,true,true,true};
        assertEquals("[-5 10 5 0] -> Float.NaN", Float.NaN, ArrayMethods.min(arr12,arr18,2,2), 1e-6);*/
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
        String[] arr2 = {"20200605","202201014","20210303"};
        assertArrayEquals("[20200605,202201014,20210303] -> [true false true]",new boolean[] {true, false, true},ArrayMethods.datesBetween(arr2,"20200600", "202103010"));
        String[] arr3 = {"201509025","20040716","20200914"};
        assertArrayEquals("[201509025,20040716,20200914] -> [false false false]",new boolean[] {false, false, false},ArrayMethods.datesBetween(arr3,"202309025", "202309025"));
    }

    @Test
    public void logicalAnd(){
        boolean[] arr1 = {false, true, true, false};
        boolean[] arr2 ={false, true, false, true};
        assertArrayEquals("[false, true, true, false], [false, true, false, true] -> [false, true, false, false]",new boolean[] {false, true, false, false},ArrayMethods.logicalAnd(arr1,arr2));
        boolean[] arr3 = {false, false, false, false};
        boolean[] arr4 ={false, true, false, true};
        assertArrayEquals("[false, false, false, false], [false, true, false, true] -> [false, false, false, false]",new boolean[] {false, false, false, false},ArrayMethods.logicalAnd(arr3,arr4));
        boolean[] arr5 = {true, true, true, true};
        boolean[] arr6 ={true, true, false, true};
        assertArrayEquals("[true, true, true, true], [true, true, false, true] -> [true, true, false, true]",new boolean[] {true, true, false, true},ArrayMethods.logicalAnd(arr5,arr6));

    }

    @Test
    public void count(){
        boolean[] arr1 = {false, true, true, false, true};
        assertEquals("[false, true, true, false, true] -> 3", 3f, ArrayMethods.count(arr1), 1e-6);
        boolean[] arr2 = {true, true, true, false, true};
        assertEquals("[true, true, true, false, true] -> 4", 4f, ArrayMethods.count(arr2), 1e-6);
        boolean[] arr3 = {false, false, false, false, false};
        assertEquals("[false, false, false, false, false] -> 0", 0f, ArrayMethods.count(arr3), 1e-6);
    }

    @Test
    public void findFirst(){
        boolean[] arr1 = {false, false, true, false, true};
        assertEquals("[false, false, true, false, true] -> 2", 2f, ArrayMethods.findFirst(arr1), 1e-6);
        boolean[] arr2 = {false, false, false};
        assertEquals("[false, false, false] -> -1", -1f, ArrayMethods.findFirst(arr2), 1e-6);
        boolean[] arr3 = {false, true, true};
        assertEquals("[false, true, true] -> 2", 1f, ArrayMethods.findFirst(arr3), 1e-6);
    }

    @Test
    public void findTest(){
        boolean[] arr1 = {false, true, true, false, true};
        assertArrayEquals(new int[] {1,2,4},ArrayMethods.find(arr1));
        boolean[] arr2 = {false, false, false, false, false};
        assertArrayEquals(new int[] {},ArrayMethods.find(arr2));
        boolean[] arr3 = {true, true, false, false, true};
        assertArrayEquals(new int[] {0,1,4},ArrayMethods.find(arr3));
    }

        
    public static void main(String[] args) {
       //testWholeArraySum();
    }    
}
