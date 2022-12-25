import java.util.HashMap;
import java.util.Iterator;

public class oddEven {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        HashMap<String, Integer[]> evenOddMap = getOddEven(new int[] {2, 3, 7, 6, 9, 4, 5, 7});
        
        for(String keyString: evenOddMap.keySet()) {
            System.out.print("'" + keyString + "'" + ":");
            for(int j = 0; j < evenOddMap.get(keyString).length; ++j) {
                System.out.print(" " + evenOddMap.get(keyString)[j] + " ");
            }
            
        }
    }
    
    public static HashMap<String, Integer[]> getOddEven(int[] intArray) {
        Integer[] evenNums = new Integer[0];
        Integer[] oddNums = new Integer[0];
        
        for(int i = 0; i < intArray.length; ++i) {
            if (intArray[i] % 2 == 0) {
                evenNums = new Integer[evenNums.length+1];
                evenNums[evenNums.length-1] = intArray[i];
            } else {
                oddNums = new Integer[oddNums.length+1];
                oddNums[oddNums.length-1] = intArray[i];
            }
        }
        
        HashMap<String, Integer[]> evenOddMap = new HashMap<String, Integer[]>();
        evenOddMap.put("Even", evenNums);
        evenOddMap.put("Odd", oddNums);
        
        return evenOddMap;
    }
    
    

}
