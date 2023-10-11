package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Element_appears_once {
    static int findElement(int arr[],int N){
        int count=1;

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<N-1;i++){
            map.put(arr[i],i);
        }
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() == 0) {
                return it.getKey();
            }

        }
return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,1};
        int N=arr.length;
   int res= findElement(arr,N);
        System.out.println(res);

    }
}
