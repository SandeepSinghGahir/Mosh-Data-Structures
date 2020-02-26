package linear_data_structures;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpressionsStack {


    private List<Character> leftBrackets = Arrays.asList('{','(','<','[');
    private List<Character> rightBrackets = Arrays.asList('}',')','>',']');

    boolean checkIfBracketsAreBalanced(String expression){
       if(expression==null)
           throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();
        for(Character c : expression.toCharArray()){
            if(isLeftBracket(c))
                stack.push(c);

            if(isRightBracket(c)){
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(!checkIfMatched(top,c))
                  return false;

            }
        }
        return stack.empty();
    }

    private boolean isRightBracket(Character c) {
        return rightBrackets.contains(c);
    }

    private boolean isLeftBracket(Character c) {
        return leftBrackets.contains(c);
    }

    private boolean checkIfMatched(Character left, Character right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }

}
