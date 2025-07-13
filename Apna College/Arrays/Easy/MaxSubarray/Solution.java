// package Apna College.Arrays.Easy.MaxSubarray;

public class Solution {
    public static void main(String[] args) {
        // int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] nums = { 5, 4, -1, 7, 8 };
        // int[] nums = { 1 };

        int res = maxSubArrAy(nums);

        System.out.println(res);
    }

    static int maxSubArrAy(int arr[]) {
        int max = arr[0];

        // Brute Force
        // for (int i = 0; i < arr.length; i++) {
        // int curr = 0;
        // for (int j = i; j < arr.length; j++) {
        // curr += arr[j];

        // max = Math.max(max, curr);

        // if (curr < 0)
        // curr = 0;
        // }
        // }

        // Optimised Solution
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum > max) {
                max = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return max;
    }
}
