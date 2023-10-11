package Strings;

import java.util.Arrays;

public class anagram {
    static boolean checkAnagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<s1.length();i++){

            if(c1[i]==c2[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="abc";
        String s2="cba";
        boolean res=checkAnagram(s1,s2);
        System.out.println(res);
    }
}
