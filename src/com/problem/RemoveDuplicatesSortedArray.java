package com.problem;


public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        System.out.print(removeDuplicates(arr));
    }

    static int removeDuplicates(int nums[]) {
        if (nums.length == 0 || nums.length == 1)
            return nums.length;

        int[] temp = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] != nums[i + 1])
                temp[j++] = nums[i];
        temp[j++] = nums[nums.length - 1];
        for (int i = 0; i < j; i++)
            nums[i] = temp[i];

        return j;
    }
}

