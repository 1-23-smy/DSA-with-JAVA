package Stack;

import java.util.Stack;

public class Reverse_Stack {
    static String reverseString(String s,int n){
        Stack<Character>st=new Stack<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<n;i++){
            st.push(ch[i]);
        }
        String ans="";
        while(!st.isEmpty()){
            char top=st.peek();
            ans = ans + top;
            st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "Soumya";
        int n =s.length();
        String res=reverseString(s,n);
        System.out.println(res);
    }
}