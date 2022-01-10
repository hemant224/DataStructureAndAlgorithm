package org.BitManipulation.Practice;
/*
Given two integers A and B, find a number X such that A xor X is minimum possible, and the number of set bits in X equals B.



Problem Constraints

0 <= A <= 109
0 <= B <= 30
 */
public class SmallestXor {
    public static int findSmallestXor(int A , int B){
        int x = 0;
        for (int i = 30; i >= 0; i--) {
            if (B == 0)
                return x;
            if (((1 << i) & A) > 0) {
                x |= (1 << i);
                B--;
            }
        }

        for (int i = 0; i <= 30; i++) {
            if (B == 0)
                return x;
            if (((1 << i) & x) == 0) {
                x |= (1 << i);
                B--;
            }
        }
        return x;
    }
}
