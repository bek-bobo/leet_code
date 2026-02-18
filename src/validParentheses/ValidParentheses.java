package validParentheses;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([)]";
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {


            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            else {
                // stack bo‘sh bo‘lsa — yopish mumkin emas
                if (stack.isEmpty()) System.out.println("NO");

                char top = stack.pop();

                // mos kelishini tekshiramiz
                if (c == ')' && top != '(') System.out.println("NO");
                if (c == '}' && top != '{') System.out.println("NO");
                if (c == ']' && top != '[') System.out.println("NO");
            }
        }

        // oxirida hammasi yopilgan bo‘lishi kerak
        System.out.println(stack.isEmpty());



    }
}
