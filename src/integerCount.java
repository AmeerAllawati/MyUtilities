import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class integerCount {
    
    static ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(1, 5, 4, 1, 6 , 5, 6, 4, 7, 1, 1, 1));
    static ArrayList<Integer> repition = new ArrayList<Integer>();
    static HashMap<Integer, Integer> numAndRep = new HashMap<Integer>();

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        for (int i = 0; i<numList.size(); ++i) {
            int currentNumRepition = 1;
            for (int j = i+1; j<numList.size(); ++j) {
                if (numList.get(i) == numList.get(j)) {
                    currentNumRepition++;
                    numList.remove(j);
                    --j;
                }
            }
            repition.add(currentNumRepition);
        }
        
        for (int i = 0; i<numList.size(); ++i) {
            System.out.println(numList.get(i) + ": " + repition.get(i));
            
        }
    }

}
