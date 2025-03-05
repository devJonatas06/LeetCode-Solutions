package LeetCode28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static int strStr(String haystack, String needle) {
        Pattern pattern = Pattern.compile(Pattern.quote(needle));
        Matcher matcher = pattern.matcher(haystack);

        if (matcher.find()) {
            return matcher.start();
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));  // Saída: 0
        System.out.println(strStr("leetcode", "leeto")); // Saída: -1
    }
}