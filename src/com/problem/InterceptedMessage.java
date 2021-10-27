package com.problem;
//link : https://codeforces.com/contest/950/problem/B

import java.util.Scanner;

public class InterceptedMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }
        int sum1 = arr1[0];
        int sum2 = arr2[0];
        int i = 0;
        int j = 0;
        while (true) {
            if (sum1 == sum2) {
                count++;
            }
            while (sum1 < sum2) {
                i = i + 1;
                sum1 += arr1[i];
                if (sum1 == sum2) {
                    count++;
                }
            }
            while (sum1 > sum2) {
                j = j + 1;
                sum2 += arr2[j];
                if (sum1 == sum2) {
                    count++;
                }
            }
            if (i == n - 1 && j == m - 1) {
                System.out.println(count);
                break;
            }
            if (i < n - 1 && j < m - 1 && sum1 == sum2) {
                i = i + 1;
                j = j + 1;
                sum1 = arr1[i];
                sum2 = arr2[j];

            }

        }
    }

}
