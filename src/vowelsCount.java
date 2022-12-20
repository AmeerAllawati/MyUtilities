import java.io.*;
import java.util.HashMap;
import java.util.Scanner;


public class vowelsCount {

    static String sentenceString;
    static HashMap<String, Integer> counter = new HashMap<String, Integer>();
    static int vowelCounter;
    static int aCounter;
    static int eCounter;
    static int iCounter;
    static int oCounter;
    static int uCounter;
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        counter.put("vowelCounter", 0);
        counter.put("aCounter", 0);
        counter.put("eCounter", 0);
        counter.put("iCounter", 0);
        counter.put("oCounter", 0);
        counter.put("uCounter", 0);
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please enter your string: ");
        sentenceString = s.nextLine();
        
        for (int i = 0 ; i < sentenceString.length(); ++i) {
            if (sentenceString.charAt(i) == 'a' ) {
                counter.put("vowelCounter", counter.get("vowelCounter") + 1);
                counter.put("aCounter", counter.get("aCounter") + 1);
            } else if (sentenceString.charAt(i) == 'e') {
                counter.put("vowelCounter", counter.get("vowelCounter") + 1);
                counter.put("eCounter", counter.get("eCounter") + 1);
            } else if (sentenceString.charAt(i) == 'i') {
                counter.put("vowelCounter", counter.get("vowelCounter") + 1);
                counter.put("iCounter", counter.get("iCounter") + 1);
            } else if (sentenceString.charAt(i) == 'o') {
                counter.put("vowelCounter", counter.get("vowelCounter") + 1);
                counter.put("oCounter", counter.get("oCounter") + 1);
            } else if (sentenceString.charAt(i) == 'u') {
                counter.put("vowelCounter", counter.get("vowelCounter") + 1);
                counter.put("uCounter", counter.get("uCounter") + 1);
            }
        }
        
        for (String keys: counter.keySet()) {
            System.out.println("There are " + counter.get(keys) + " " + keys);
        }
//        System.out.println("There are " + vowelCounter + " vowels");
//        System.out.println("a is present " + aCounter + " times");
//        System.out.println("e is present " + eCounter + " times");
//        System.out.println("i is present " + iCounter + " times");
//        System.out.println("o is present " + oCounter + " times");
//        System.out.println("u is present " + uCounter + " times");
    }

}

