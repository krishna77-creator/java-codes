package com.krishna.prep.day06;

public class MaxConsecutiveOnes {

    public static int maxCount(int[] nums) {
        int current = 1;
        int best = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1) {
                current = current + 1;
                if (current > best) {
                    best = current;
                }
            } else {
                current = 0;
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println("Max Consecutive number is:- " + maxCount(nums));
    }
}