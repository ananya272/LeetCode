import java.util.Stack;
public class DecodeString{
    public String decodeString(String s) {
        Stack<Integer> integerstack = new Stack<>();
        Stack<Character> stringstack = new Stack<>();
        String temp = "", result = "";
        for (int i = 0; i < s.length(); i++){
        int count = 0;
        if (Character.isDigit(s.charAt(i))){
        while (Character.isDigit(s.charAt(i))){
        count = count * 10 + s.charAt(i) - '0';
        i++;
        }
        i--;
        integerstack.push(count);
        }
        else if (s.charAt(i) == ']'){
        temp = "";
        count = 0;
        if (!integerstack.isEmpty()){
        count = integerstack.peek();
        integerstack.pop();
        }
        while (!stringstack.isEmpty() && stringstack.peek()!='[' ){
            temp = stringstack.peek() + temp;
stringstack.pop();
}
if (!stringstack.empty() && stringstack.peek() == '[')
stringstack.pop();
for (int j = 0; j < count; j++)
result = result + temp;
for (int j = 0; j < result.length(); j++)
stringstack.push(result.charAt(j));
result = "";
}
else if (s.charAt(i) == '['){
if (Character.isDigit(s.charAt(i-1)))
stringstack.push(s.charAt(i));
else{
stringstack.push(s.charAt(i));
integerstack.push(1);
}
}
else
stringstack.push(s.charAt(i));
}
while (!stringstack.isEmpty()){
result = stringstack.peek() + result;
stringstack.pop();
}
return result;
    }
}