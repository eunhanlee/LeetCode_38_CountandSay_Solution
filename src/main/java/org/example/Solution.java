package org.example;

public class Solution {
    /**
     * Generates the "Count and Say" sequence up to the nth value.
     *
     * @param n The value up to which the sequence is generated.
     * @return The nth value of the "Count and Say" sequence.
     */
    public static String countAndSay(int n) {
        String str = "1";

        for (int i = 1; i < n; i++) {
            str = getCountAndSayByValue(str);
        }

        return str;
    }

    /**
     * Generates the next value in the "Count and Say" sequence based on the given input.
     *
     * @param str The input value for which the next sequence value is generated.
     * @return The next value in the "Count and Say" sequence.
     */
    private static String getCountAndSayByValue(String str) {
        StringBuilder sb = new StringBuilder();
        char prev = str.charAt(0);
        int counter = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == prev) {
                counter++;
            } else {
                sb.append(counter);
                sb.append(prev);
                prev = str.charAt(i);
                counter = 1;
            }
        }
        sb.append(counter);
        sb.append(prev);
        return sb.toString();
    }
}
