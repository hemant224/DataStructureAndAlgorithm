package org.Stacks.practice;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @author hemant
 *
 * Given an array A, find the nearest smaller element G[i] for every element A[i] in the array such that the element has an index smaller than i.
 *
 * More formally,
 *
 * G[i] for an element A[i] = an element A[j] such that
 *
 * j is maximum possible AND
 *
 * j < i AND
 *
 * A[j] < A[i]
 *
 * Elements for which no smaller element exist, consider next smaller element as -1.
 */
public class NearestSmallestElement {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A){
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> stack1=new Stack<>();

        for (Integer integer : A) {
            while (!stack1.isEmpty() && stack1.peek() >= integer) {
                stack1.pop();
            }
            if (!stack1.isEmpty()) {
                res.add(stack1.peek());
            } else {
                res.add(-1);
            }
            stack1.add(integer);


        }
        return res;
    }

}
