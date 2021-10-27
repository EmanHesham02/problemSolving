package com.problem;

//link : https://codeforces.com/contest/1481/problem/A

import java.util.HashMap;
import java.util.Scanner;

public class SpaceNavigation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCasesNum = in.nextInt();

        boolean px = false;
        boolean py = false;

        for (int i = 0; i < testCasesNum; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            String s = in.next();
            HashMap<Character, Integer> charCountMap = countChar(s);

            if (x == 0) px = true;
            if (y == 0) py = true;
            if (x > 0) {
                if (charCountMap.containsKey('R') && charCountMap.get('R') >= x)
                    px = true;
            }
            if (x < 0) {
                if (charCountMap.containsKey('L') && charCountMap.get('L') >= Math.abs(x))
                    px = true;
            }
            if (y > 0) {
                if (charCountMap.containsKey('U') && charCountMap.get('U') >= y)
                    py = true;
            }
            if (y < 0) {
                if (charCountMap.containsKey('D') && charCountMap.get('D') >= Math.abs(y))
                    py = true;
            }

            if (px && py)
                System.out.println("YES");

            else System.out.println("No");

            px = false;
            py = false;
        }
    }

    public static HashMap<Character, Integer> countChar(String s) {
        HashMap<Character, Integer> charCountMap
                = new HashMap<Character, Integer>();
        char[] strArray = s.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        return charCountMap;

    }

}
