import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = summ(nums, target);
        return ans;
    }

    public int[] summ(int[] nums, int tg) {
        int[] a = {-1, -1};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];

                if (sum == tg) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        // Example usage:
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = in.nextInt();

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices of the two numbers: " + result[0] + " " + result[1]);
    }
}
