package com.problem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {3,3};
        int target = 6;

        int out[] = twoSum(arr, target);

        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }

    }
    public static int[] twoSum(int[] nums, int target) {
        int out[] = new int[2];
        HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(key) && (map.get(key) != i)) {
                out[0] = i;
                out[1] = map.get(key);
                break;
            }
        }

        return out;
    }

}
