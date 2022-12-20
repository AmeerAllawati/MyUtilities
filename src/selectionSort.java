import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class selectionSort {

    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] numArray = {50, 12, 6, 10, 1001, 6, 87, 24};
//        int temp = 0;
//        
//        print_arr(numArray);
//        
//        
//        for(int i =0; i < numArray.length; ++i) {
//            int[] max = findMax(numArray, i);
//            temp = numArray[i];
//            numArray[i] = numArray[max[1]];
//            numArray[max[1]] = temp;
//        }
//        
//        
//        print_arr(numArray);
        
        HashMap<Integer, Integer> newMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < numArray.length; ++i) {
            if (newMap.containsKey(numArray[i])) {
                newMap.put(numArray[i], newMap.get(numArray[i])+1);
                
            } else {
                newMap.put(numArray[i], 1);
            }
        }
        
        for(int keyInt: newMap.keySet()) {
            System.out.println(keyInt + " repeated " + newMap.get(keyInt) + " times.");
        }

    }
    
    public static void print_arr(int[] numArray) {
        for(int i =0; i < numArray.length; ++i) {
            System.out.print(numArray[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] findMax(int[] numList, int start) {
        int maxNum = numList[start];
        int maxIdx = start;
        
        for(int i = start; i < numList.length - 1; ++i) {
            if (maxNum < numList[i+1]) {
                maxNum = numList[i+1];
                maxIdx = i+1;
            }
           
        }
        
        int[] max = {maxNum, maxIdx};
        return max;
        
    }
    

}
