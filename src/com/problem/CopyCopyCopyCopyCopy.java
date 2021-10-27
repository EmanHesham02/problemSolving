package com.problem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//link : https://codeforces.com/contest/1325/problem/B

public class CopyCopyCopyCopyCopy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            Set<Integer> s = new HashSet();
            for (int j = 0; j < n; j++) {
                s.add(in.nextInt());
            }
            System.out.println(s.size());
        }


    }
}
