package com.krishna.prep.day06;

import java.util.Arrays;

public class RunningSumof1dArray {


    public static int[] runningSum(int[] nums) {
        int temp = 0;
        int[] numbers = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numbers[i] = temp + nums[i];
            temp = numbers[i];
        }
    return numbers;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));

    }
}
