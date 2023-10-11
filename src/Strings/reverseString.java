package Strings;


import java.util.ArrayList;
import java.util.Stack;

public class reverseString {
    static void reversestring(char[] ch){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<ch.length;i++){
            st.push(ch[i]);
        }
        ArrayList<Character>list=new ArrayList<>();
        while(!st.isEmpty()){
            char top=st.peek();
            list.add(top);
            st.pop();
        }
        for(char c:list){
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        String s="Soumya";
        char ch[]=s.toCharArray();
        reversestring(ch);
        for(char c:ch){
            System.out.println(c);
        }
    }
}
