package lab5;

import java.util.ArrayList;
import java.util.List;

public class ex4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3 };
        int[] arr2 = { 1, 2, 3, 5, 2, 5 };
        List<Integer> common = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j] && !common.contains(arr[i])) {
                    common.add(arr[i]);
                    break;
                }
            }
        }

        System.out.println("Common elements: " + common);
    }
}
