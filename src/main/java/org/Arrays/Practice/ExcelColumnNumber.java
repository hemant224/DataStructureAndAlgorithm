package org.Arrays.Practice;
/*

Given a column title as appears in an Excel sheet, return its corresponding column number.
 */
public class ExcelColumnNumber {
    public int titleToNumber(String A) {

        int result = 0;
        for (int i = 0; i < A.length(); i++)
        {
            result *= 26;
            result += A.charAt(i) - 'A' + 1;
        }
        return result;
    }
}
