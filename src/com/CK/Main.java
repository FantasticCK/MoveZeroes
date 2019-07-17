package com.CK;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{0,1};
        Solution solution = new Solution();
        solution.moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) return;
        int left = 0, right;
        for (right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }
        while (left != 0 && left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }
}