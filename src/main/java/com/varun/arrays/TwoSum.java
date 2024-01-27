package com.varun.arrays;

import java.util.HashMap;

/**
 * sum of two indexes should match 10
 * so we need to iterate compare 1 element with all other elements in an array.
 * instead of that we will remove from target and finds that value in a map
 *
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {4,7,9,1,3,6};
        int target = 10;
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i=0; i< arr.length; i++) {
            int sno  = target - arr[i];
            if (map.containsKey(sno)) {
                ans[0] = map.get(sno);
                ans[1] = i;
                break;
            }
            map.put(arr[i], i);
        }

        System.out.println(ans[0] + "  " + ans[1]);


    }
}
