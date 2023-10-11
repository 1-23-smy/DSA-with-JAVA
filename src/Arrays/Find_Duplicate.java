package Arrays;

import java.util.ArrayList;

public class Find_Duplicate {
    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        int i = 0;
        int j = i + 1;
        int res = 0;
        while (i < n-1) {
            if (arr.get(i) != arr.get(j)) {

            }

            else {
                res += arr.get(i);
            }
            i++;
            j++;

        }
        return res;
    }

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(2);
        arr.add(2);
        int n = arr.size();
        int a = findDuplicate(arr, n);
        System.out.println(a);

    }
}
