package com.problem;

import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfShop = in.nextInt();
        int[] priceInShop = new int[numOfShop];
        for (int i = 0; i < numOfShop; i++) {
            priceInShop[i] = in.nextInt();
        }
        Arrays.sort(priceInShop);
        int numOfDays = in.nextInt();

        for (int i = 0; i < numOfDays; i++) {
            int priceInDay = in.nextInt();
            int outPut = binarySearch(priceInDay, priceInShop);
            System.out.println(outPut);
        }
    }

    private static int binarySearch(int priceInDay, int[] priceInShop) {
        int start = 0;
        int end = priceInShop.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (priceInDay >= priceInShop[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;

    }

}


