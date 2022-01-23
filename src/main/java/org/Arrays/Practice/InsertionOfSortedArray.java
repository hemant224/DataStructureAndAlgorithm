package org.Arrays.Practice;

import java.util.*;
/**
 * Given two integer array A and B of size N and M respectively. Your task is to find all the common elements in both the array.
 */
public class InsertionOfSortedArray {
    public int[] intersect(final int[] A, final int[] B) {
        if(A == null || B == null || A.length==0  || B.length==0)
            return new int[0];
        // step1: Put elements in nums1 into the map
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:A)
            if(map.containsKey(num))
                map.put(num,map.get(num)+1);
            else
                map.put(num,1);
// step 2: iterate the nums2 and get the result
        List<Integer> result = new ArrayList<>();

        for (int num : B) {
            if (map.containsKey(num) && map.get(num) > 0)
            {   result.add(num);
                int freq = map.get(num);
                freq--;
                map.put(num, freq);
            }
        }

        return listToArray(result);
    }

    private int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
