import java.util.concurrent.Flow.Publisher;

public class recursionExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //System.out.println("Main return: " + factorialRec(5));
        //reverseString("Sultan", 6);
        //printIncreasingValue(4, 0);
        System.out.print(pelindrome("cbvffjlo", 8));
    }
    
    
    public static int power_rec(int base, int exp) {
        int t = power_rec(5, 3);
        return t;
    }
    
    public static int factorialRec(int number) {
        if(number == 0) {
            return 1;
        }
        
        return (number) * factorialRec(number-1);
    }
    
    public static int reverseString(String inputString, int length) {
        if(length == 1) {
            System.out.print(inputString.charAt(inputString.length()-1));
            return inputString.length()-1;
        }
        
        System.out.print(inputString.charAt(reverseString(inputString, length-1)-1));
        return inputString.length()-length;
    }
    
    public static int printIncreasingValue(int number, int initial) {
        if(initial == number-1) {
            System.out.print(initial + " ");
            System.out.print(number-1 + " ");
            return initial;
        }
        System.out.print(initial + " ");
        printIncreasingValue(number, initial+1);
        System.out.print(initial + " ");
//        System.out.print(printIncreasingValue(number, initial+1)-1 + " ");
//        System.out.print(printIncreasingValue(number, initial+1)-1 + " ");
        
        return initial;
    }
    
    public static boolean pelindrome(String inputString, int length) {
        if (length == inputString.length()/2) {
            return inputString.charAt(length) == inputString.charAt(inputString.length()-length);
        }
        
        return inputString.charAt(length-1) == inputString.charAt(inputString.length()-length) && pelindrome(inputString, length-1);
        
    }

}
