package MaxAndMinEleInArray;

public class Solution {

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 56, 1000, 167 };

        int[] res = solution(arr);

        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    static int[] solution(int arr[]) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }

        return new int[] { max, min };
    }
}