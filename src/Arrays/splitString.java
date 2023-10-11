package Arrays;

public class splitString {
    public static Boolean splitstring(String str){
        String s1a=str.substring(0,(str.length()/2));
        s1a=s1a.toLowerCase();
        char array1[]=s1a.toCharArray();
        String s1b=str.substring(0,(str.length()/2));
        s1b=s1b.toLowerCase();
        char array2[]=s1b.toCharArray();
        int vowela=0;
        int vowelb=0;
        char arr[]={'a','e','i','o','u'};
        for(int i=0;i<array1.length;i++){

            for(int j=0;j<arr.length;j++){
                if(array1[i]==arr[j])
                {
                    vowela++;
                }
            }
        }
        for(int i=0;i<array2.length;i++){

            for(int j=0;j<arr.length;j++){
                if(array2[i]==arr[j])
                {
                    vowelb++;
                }
            }
        }
        if(vowela==vowelb)
            return true;
        return false;
    }
    public static void main(String[] args) {
        String str="Aa";

        Boolean s=splitstring(str);
        System.out.println(s);
    }
}
