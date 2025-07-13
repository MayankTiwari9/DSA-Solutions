// package ReverseAnArray;

public class Solution {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2, 6, 5 };
        // int arr[] = { 4, 5, 2 };
        // int arr[] = {1};

        int res[] = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    static int[] reverseArray(int arr[]) {
        int n = arr.length;

        // Brute force
        // int temp[] = new int[n];

        // for (int i = 0; i < n; i++) {
        //     temp[n - 1 - i] = arr[i];
        // }

        // return temp;

        // Optimised

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        return arr;
    }
}
