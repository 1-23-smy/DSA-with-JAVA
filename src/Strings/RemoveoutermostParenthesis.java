package Strings;

import java.util.ArrayList;

public class RemoveoutermostParenthesis {
    public static String removeOuterParentheses(String s){
    char ch[]=s.toCharArray();
        ArrayList<String> newArr=new ArrayList<>();
    for(int i=0;i<ch.length-1;i++){
        if(s.charAt(i) == '(' && s.charAt(i+1)==')'){
            newArr.add(String.valueOf(s.charAt(i)));
            newArr.add(String.valueOf(s.charAt(i+1)));
//            newArr.add();
        }
    }
        System.out.println(newArr);

    return "sertert";
    }
    public static void main(String[] args) {
        String s ="(()())(())";
        removeOuterParentheses(s);
//        System.out.println(res);



    }
}
