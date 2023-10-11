package Strings;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValidParenthesis(String exp) {
        Stack<Character> St = new Stack<Character>();
        char ch[] = exp.toCharArray();
        for (int i = 0; i < exp.length(); i++) {
            char cha = ch[i];
            if (cha == '(' || cha == '{' || cha == '[') {
                St.push(cha);
            }

            else{
                if(!St.isEmpty()){
                    char top=St.peek();
                    if((cha==')' && top=='(') ||(cha=='}' && top=='{') || (cha==']' && top=='['))
                   {
                    St.pop();

                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;

                }
            }

        }
        if(St.empty()){
            return true;

        }
        return  false;
    }




    public static void main(String[] args) {
        String exp="{([])}";
        boolean res=isValidParenthesis(exp);
        System.out.println(res);
    }
        }

