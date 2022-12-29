import java.util.ArrayList;
import java.util.Spliterator;
import java.util.Stack;

public class ReverseMe {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //reverseString("Reverse me if you can");
        ArrayList<String> splittedStrings = stringSplitter("NoOfSeats", ' ');
        
        for(int i =splittedStrings.size()-1; i >= 0; --i) {
            System.out.print(splittedStrings.get(i));
        }
    }

    public static void reverseString(String inputString) {
        String[] splittedStrings = inputString.split(" ");

        for(int i = splittedStrings.length-1; i>=0; --i) {
            System.out.print(splittedStrings[i] + " ");
        }
    }

    public static void reverseStringStack(String inputString) {
        String[] splittedStrings = inputString.split(" ");

        Stack<String> stackedString = new Stack<String>();
        
        for(int i = 0; i<splittedStrings.length; ++i) {
            stackedString.add(splittedStrings[i]);
        }
        
        for(int i = 0; i < splittedStrings.length; ++i) {
            System.out.print(stackedString.pop() + " ");
        }
    }
    
    public static ArrayList<String> stringSplitter(String inputString, char seperation) {
        ArrayList<String> splittedStrings = new ArrayList<String>();
        
        int wordStartIdx = 0;
        for(int i = 0; i < inputString.length(); ++i) {
            if(Character.isUpperCase(inputString.charAt(i)) && i !=0) {
                String tempString = new String(inputString.substring(wordStartIdx, i));
                wordStartIdx = i;
                splittedStrings.add(tempString);
            }
        }
        splittedStrings.add(inputString.substring(wordStartIdx, inputString.length()));
        
        return splittedStrings;
        
    }

}
