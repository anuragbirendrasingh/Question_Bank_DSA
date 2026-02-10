package Leet_02.Contsets;

import java.util.*;

public class MergeAdjacentEqualElement_Leet3834_10FEB {
    public static void main(String[] args) {
        int[] arr = { 1, 3,3, 2, 3 };
        merge(arr);
    }

    public static void merge(int[] arr) {
        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ll.add(arr[i]);
        }
        // System.out.println(ll);

        boolean listChanged = true;
        while (listChanged) {
            listChanged = false;
            for (int i = 0; i < ll.size() - 1; i++) {

                if (ll.get(i).equals(ll.get(i + 1))) {
                    int sum = ll.get(i) + ll.get(i + 1);

                    ll.set(i, sum);
                    ll.remove(i + 1);
                    listChanged = true;
                    break;
                }

            }

        }

        System.out.println(ll);

    }
}
