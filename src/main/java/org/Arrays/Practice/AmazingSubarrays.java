package org.Arrays.Practice;

/*
You are given a string S, and you have to find all the amazing substrings of S.

Amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
 */

public class AmazingSubarrays {

    public int amazingSubarrays(String A) {
        String vow = "aeiouAEIOU";
        int count = 0;
        int s = A.length();
        for(int i=0; i<A.length(); i++){
            if(vow.indexOf(A.charAt(i)) >= 0){
                count += s-i;
            }
        }
        return count % 10003;
    }
}

