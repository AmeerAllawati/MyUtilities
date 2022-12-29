import java.nio.channels.NonReadableChannelException;
import java.util.HashSet;
import java.util.Iterator;

public class SetsUtilities {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    public static void removeDuplicates() {
        String[] inputArrayStrings = new String[] {"Mr A", "Mr B", "Mr A", "Mr C", "Mr A", "Mr D", "Mr B", "Mr C"};
        HashSet<String> uniqueNames = new HashSet<String>();
        
        for(int i = 0; i < inputArrayStrings.length; ++i) {
            uniqueNames.add(inputArrayStrings[i]);
        }
        
    }

    public static void giveIntersection() {
        String[] inputArrayStrings1 = new String[] {"Mr A", "Mr B", "Mr C", "Mr Y", "Mr E"};
        String[] inputArrayStrings2 = new String[] {"Mr X", "Mr Z", "Mr B", "Mr A", "Mr Y", "Mr S", "Mr T"};
        HashSet<String> commonNames1 = new HashSet<String>();
        HashSet<String> commonNames2 = new HashSet<String>();
        
        for(int i = 0; i < inputArrayStrings1.length; ++i) {
            commonNames1.add(inputArrayStrings1[i]);
        }
        for(int i = 0; i < inputArrayStrings2.length; ++i) {
            commonNames2.add(inputArrayStrings2[i]);
        }
        
        commonNames1.retainAll(commonNames2);
        
    }
}
