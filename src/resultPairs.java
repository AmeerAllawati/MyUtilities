import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class resultPairs {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Integer> inputNumbersArrayList = new ArrayList<Integer>();
        inputNumbersArrayList.add(15);
        inputNumbersArrayList.add(0);
        inputNumbersArrayList.add(2);
        inputNumbersArrayList.add(5);
        inputNumbersArrayList.add(4);
        inputNumbersArrayList.add(8);
        inputNumbersArrayList.add(6);
        inputNumbersArrayList.add(3);
        inputNumbersArrayList.add(1);
        inputNumbersArrayList.add(30);
        inputNumbersArrayList.add(40);
        inputNumbersArrayList.add(20);
//        ArrayList<ArrayList<Integer>> combinationsArrayList = combination(inputNumbersArrayList, 5);
        HashMap<Integer, Integer> hashCombinations = combinationHashMap(inputNumbersArrayList, 6);
       
//        System.out.print("[ ");
//        for(int i = 0; i < combinationsArrayList.size(); ++i) {
//            System.out.print("{" + combinationsArrayList.get(i).get(0) + ", " + combinationsArrayList.get(i).get(1) + "} ");
//        }
//        System.out.print("]");
        
        System.out.print("[ ");
        for(int keyValue: hashCombinations.keySet()) {
            System.out.print("{" + keyValue + ", " + hashCombinations.get(keyValue) + "} ");
        }
        System.out.print("]");
    }
    
    public static ArrayList<ArrayList<Integer>> combination(ArrayList<Integer> numbers, int target) {
        ArrayList<ArrayList<Integer>> combinationsArrayList = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < numbers.size() - 1; ++i) {
            for(int j = i+1; j < numbers.size(); ++j) {
                if (numbers.get(i) + numbers.get(j) == target) {
                    ArrayList<Integer> tempArrayList = new ArrayList<Integer>();
                    tempArrayList.add(numbers.get(i));
                    tempArrayList.add(numbers.get(j));
                    
                    combinationsArrayList.add(tempArrayList);
                    numbers.remove(j);
                    numbers.remove(i);
                    j = i;
                }
            }
        }
        return combinationsArrayList;
    }
    
    public static HashMap<Integer, Integer> combinationHashMap(ArrayList<Integer> numbers, int target) {
        HashMap<Integer, Integer> hashCombinations = new HashMap<Integer, Integer>();
        
        int j = 0;
        for(int i = j+1; i < numbers.size(); ++i) {
            int searchedNum = target - numbers.get(j);
            
            if(numbers.get(i) == searchedNum) {
                hashCombinations.put(numbers.get(j), numbers.get(i));
                numbers.remove(i);
                ++j;
                i = j + 1;
            } else if( i == numbers.size()-1) {
                ++j;
                i = j + 1;
            }
        }
        
        return hashCombinations;
        
    }

}
