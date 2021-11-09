package com.problem;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str = {"a"};
        System.out.println(longestCommonPrefix(str));

    }

    public static String longestCommonPrefix(String[] strs) {
        String s = "";
        boolean flag = false;
        int j;
        if (strs.length == 1) {
            return strs[0];
        }
        for (int i = strs[0].length(); i >= 0; i--) {
            s = strs[0].substring(0, i);
            for (j = 1; j < strs.length; j++) {
                if (strs[j].startsWith(s)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }

            }
            if (flag && j == strs.length)
                break;
        }
        return s;

    }

}
