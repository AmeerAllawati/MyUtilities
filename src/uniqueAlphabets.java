import java.util.ArrayList;

public class uniqueAlphabets {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Character> inputAlphabets = new ArrayList<Character>();
        inputAlphabets.add('c');
        inputAlphabets.add('a');
        inputAlphabets.add('c');
        inputAlphabets.add('t');
        inputAlphabets.add('r');
        inputAlphabets.add('a');
        inputAlphabets.add('t');
        inputAlphabets.add('z');
        
        ArrayList<Character> uniqueAlphabetsArrayList = unique(inputAlphabets);
        
        for(int i = 0; i < uniqueAlphabetsArrayList.size(); ++i) {
            System.out.print(uniqueAlphabetsArrayList.get(i) + " ");
        }
    }
    
    public static ArrayList<Character> unique(ArrayList<Character> inputAlphabets) {
        ArrayList<Character> uniqueAlphabets = new ArrayList<Character>();
        boolean present = false;
        
        uniqueAlphabets.add(inputAlphabets.get(0));
        for(int i = 0; i < inputAlphabets.size(); ++i) {
            for(int j = 0; j < uniqueAlphabets.size(); ++j) {
                if (inputAlphabets.get(i) == uniqueAlphabets.get(j)) {
                    present = true;
                    break;
                    
                } else {
                    present = false;
                }
            }
            if (!present) {
                uniqueAlphabets.add(inputAlphabets.get(i));
            }
        }
        
        return uniqueAlphabets;
    }

}
