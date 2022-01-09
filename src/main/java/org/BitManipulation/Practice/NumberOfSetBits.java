package org.BitManipulation.Practice;

/*
Write a function that takes an integer and returns the number of 1 bits it has.
 */
public class NumberOfSetBits {
    public int numSetBits(int A){
        int count = 0;
        while(A > 0){
            count += A & 1;
            A = A >> 1;
        }
        return count;
    }
}
