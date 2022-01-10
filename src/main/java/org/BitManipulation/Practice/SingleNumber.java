package org.BitManipulation.Practice;
/*
Given an array of integers, every element appears thrice except for one which occurs once.

Find that element which does not appear thrice.

 */
public class SingleNumber {
    public int singleNumberAppearingThrice(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int num : nums) {
                if ((num >> i & 1) == 1) {
                    count++;
                }
            }
            result |= (count % 3) << i;
        }
        return result;
    }
}
