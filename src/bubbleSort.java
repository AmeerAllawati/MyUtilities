import java.lang.ref.SoftReference;
import java.util.Iterator;

public class bubbleSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] inputArray = new int[] {1, 2, 3, 4, 5};
        
        int[] sortedArray = sort(inputArray);
        
        for(int i = 0; i < inputArray.length; ++i) {
            System.out.print(sortedArray[i] + " ");
        }
        

    }
    
    public static int[] sort(int[] inputArray) {

        int[] sortedArray = inputArray.clone();
        for(int i = 0; i < sortedArray.length; ++i) {
            for (int j = 0; j < sortedArray.length - 1; ++j) {
                if(sortedArray[j] < sortedArray[j+1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                }
            }
        }
        
        return sortedArray;
    }

}
