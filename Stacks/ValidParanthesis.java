import java.util.Stack;

public class ValidParanthesis{
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i<s.length()) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if(st.isEmpty()) {
                    return false;
                }
                char top = st.peek();
                if((top == '(' && ch == ')') 
                    || (top == '{' && ch == '}')
                    || (top == '[' && ch == ']')) {
                        st.pop();
                } else {
                    return false;
                }
            }

            i++;
        }
        if(!st.isEmpty()) {
            return false;
        }
        return true;
    }
}