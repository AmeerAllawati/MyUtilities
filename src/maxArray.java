import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.io.*;
import java.util.Scanner;

import javax.naming.AuthenticationException;

public class maxArray {

    static ArrayList<Integer> numberList = new ArrayList<Integer>();
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        char lastChar = '0';
        String numString;
        ArrayList<Integer> numList = new ArrayList<Integer>();
        
        
        
        System.out.println("Enter the list of numbers you want to create with spaces between them");
        
        numString = s.nextLine();
        String[] tempStrings = numString.split(" ");
        
        for (int i = 0; i<tempStrings.length; ++i) {
            numList.add(Integer.parseInt(tempStrings[i]));
        }
        
        System.out.println("The maximum number is: " + findMax(numList));
        
        System.out.println("The first maximum number is: " + intfindTwoMax(numList)[0]);
        System.out.println("The second maximum number is: " + intfindTwoMax(numList)[1]);
        
       
        
    }
    
    public static int[] intfindTwoMax(ArrayList<Integer> numList) {
        int firstMaxNum = -1;
        int secondMaxNum = -1;
        
        for(int i = 0; i < numList.size() - 1; ++i) {
            if (firstMaxNum < numList.get(i+1)) {
                secondMaxNum = firstMaxNum;
                firstMaxNum = numList.get(i+1);
            } else if (secondMaxNum < numList.get(i+1) && firstMaxNum > numList.get(i+1)) {
                secondMaxNum = numList.get(i+1);
            }
           
        }
        
        int[] twoMax = new int[] {firstMaxNum, secondMaxNum};
 
        return twoMax;
    }
    
    public static int findMax(ArrayList<Integer> numList) {
        int maxNum = 0;
        
        maxNum = numList.get(0);
        for(int i = 0; i < numList.size() - 1; ++i) {
            if (maxNum < numList.get(i+1)) {
                maxNum = numList.get(i+1);
            }
           
        }
        return maxNum;
        
    }

}
