package com.problem;

//the link of  this problem
//        https://codeforces.com/contest/1480/problem/A

import java.util.Scanner;

public class YetAnotherStringGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCasesNum = in.nextInt();

        while (testCasesNum > 0) {
            String s = in.next();
            String sFinal = "";
            for (int i = 0; i <= s.length() - 1; i = i + 2) {
                if (s.charAt(i) == 'a') {
                    sFinal += 'b';
                }
                if (s.charAt(i) != 'a') {
                    sFinal += 'a';
                }
                if ((i + 1) < s.length() && s.charAt(i + 1) == 'z') {
                    sFinal += 'y';
                }
                if ((i + 1) < s.length() && s.charAt(i + 1) != 'z') {
                    sFinal += 'z';
                }
            }
            System.out.println(sFinal);
            testCasesNum--;
        }

    }
}

