import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        System.out.println(isValid("[([]])"));
    }

    // {}({})

    // {([])}

    // {}()

    public static boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();


        if(s.charAt(0) != '{' && s.charAt(0) != '(' && s.charAt(0) != '[') {
            return false;
        }

        System.out.println("First state: " + brackets.toString());

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                brackets.add(s.charAt(i));
                System.out.println("Current State: " + brackets.toString());
                continue;
            }

            if(s.charAt(i) == '}') {
                if(!brackets.isEmpty()) {
                    if(brackets.peek() == '{') {
                        brackets.pop();
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
            else if(s.charAt(i) == ')') {
                if(!brackets.isEmpty()) {
                    if(brackets.peek() == '(') {
                        brackets.pop();
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
            else if(s.charAt(i) == ']') {
                if(!brackets.isEmpty()) {
                    if(brackets.peek() == '[') {
                        brackets.pop();
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
            System.out.println("Current state: " + brackets.toString());
        }


        return brackets.isEmpty();

    }
}
