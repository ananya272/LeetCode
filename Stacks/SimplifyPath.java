import java.util.Stack;

public class SimplifyPath {
    static String simplify(String A){
        Stack<String> st = new Stack<String>();
        String res = "";
        res += "/";
        int len_A = A.length();
        for (int i = 0; i < len_A; i++){
        String dir = "";
        while (i < len_A && A.charAt(i) == '/')
        i++;
        while (i < len_A && A.charAt(i) != '/'){
        dir += A.charAt(i);
        i++;
        }
        if (dir.equals("..") == true){
        if (!st.empty())
        st.pop();
        }
        else if (dir.equals(".") == true)
        continue;
        else if (dir.length() != 0)
        st.push(dir);
        }
        Stack<String> st1 = new Stack<String>();
        while (!st.empty()){
        st1.push(st.pop());
        }
        while (!st1.empty()){
        if (st1.size() != 1)
        res += (st1.pop() + "/");
        else
        res += st1.pop();
        }
        return res;
}
}
