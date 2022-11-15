import java.util.Arrays;
import java.util.Scanner;

public class MinNumOFJumpTOReachEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int minJump = recursive(nums, 0);
        System.out.println(minJump);

        int memoize[] = new int[nums.length];
        Arrays.fill(memoize, -1);
        int minJumpMem = recursiveMemoize(nums, 0, memoize);
        System.out.println(minJump);

        int minJumpDpTopDown = dpTopDown(nums);
        System.out.println(minJumpDpTopDown);

        int optimizedResult = minJumps(nums);
        System.out.println(optimizedResult);

    }

    public static int recursive(int nums[], int i) {
        if (i >= nums.length - 1) {
            return 0;
        }

        if (nums[i] == 0) {
            return 10000;
        }

        int jump = Integer.MAX_VALUE;
        for (int j = 1; j <= nums[i]; j++) {
            jump = Math.min(jump, 1 + recursive(nums, i + j));
        }

        return jump;
    }

    public static int recursiveMemoize(int nums[], int i, int memoize[]) {
        if (i >= nums.length - 1) {
            return 0;
        }

        if (nums[i] == 0) {
            return 10000;
        }

        if (memoize[i] != -1) {
            return memoize[i];
        }

        int jump = Integer.MAX_VALUE;
        for (int j = 1; j <= nums[i]; j++) {
            jump = Math.min(jump, 1 + recursive(nums, i + j));
        }

        memoize[i] = jump;
        return memoize[i];
    }

    public static int dpTopDown(int nums[]) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return Math.min(nums[0], 1);
        }

        int dp[] = new int[n];
        Arrays.fill(dp, 7000);
        // initialize
        dp[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 1; j <= nums[i]; j++) {
                if (i + j < n)
                    dp[i] = Math.min(dp[i], 1 + dp[i + j]);
            }
        }

        return dp[0];

    }

    // best solution - T.c - O(n) S.C. - O(1)

    // In this solution we are using ladder and stairs
    public static int minJumps(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }

        int ladder = nums[0];
        int stairs = nums[0];
        int jump = 1;
        for (int i = 1; i < nums.length; i++) {
            if (i == nums.length - 1) {
                return jump;
            }
            if (i + nums[i] > ladder) {
                ladder = i + nums[i];
            }
            stairs--;
            if (stairs == 0) {
                jump++;
                stairs = ladder - i;
            }
        }

        return jump;
    }
}
