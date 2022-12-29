import java.util.Stack;

public class scopeCheck {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(isCorrectExtendedScope("{ int x= (int)(0+1); int[] arr=new arr[10];;; }"));
    }

    public static boolean isCorrectCurley(String inputString) {
        Stack<Character> charactersStack = new Stack<Character>();

        for(int i = 0; i < inputString.length(); ++i) {
            if(inputString.charAt(i) == '{') {
                charactersStack.add(inputString.charAt(i));
            } else if (inputString.charAt(i) == '}') {
                if (charactersStack.empty()) {
                    return false;
                } else {
                    charactersStack.pop();
                }
                
            }
        }

        return (charactersStack.empty());

    }
    
    public static boolean isCorrectExtendedScope(String inputString) {
        Stack<Character> charactersStack = new Stack<Character>();
        
        for(int i = 0; i < inputString.length(); ++i) {
            if (inputString.charAt(i) == '{' || inputString.charAt(i) == '[' || inputString.charAt(i) == '(') {
                charactersStack.add(inputString.charAt(i));
            } else if (inputString.charAt(i) == '}' || inputString.charAt(i) == ']' || inputString.charAt(i) == ')') {
                if((inputString.charAt(i) == '}' && charactersStack.peek() == '{') ||
                        (inputString.charAt(i) == ']' && charactersStack.peek() == '[') ||
                        (inputString.charAt(i) == ')' && charactersStack.peek() == '(')) {
                    charactersStack.pop();
                }
            }
        }
        
        return (charactersStack.empty());
    }
}
