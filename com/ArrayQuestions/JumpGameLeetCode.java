import java.util.Arrays;
import java.util.Scanner;

import javax.swing.GroupLayout;

public class JumpGameLeetCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean finalResult = canJumpRecursive(a, 0);
        System.out.println(finalResult);

        int[] memoize = new int[a.length];
        Arrays.fill(memoize, -1);
        boolean anotherResult = canJumpRecursiveMemoize(a, 0, memoize);
        System.out.println(anotherResult);

        boolean greedyResult = canJumpGreedySolution(a);
        System.out.println(greedyResult);

        boolean anotherGreedyResult = canJumpAnotherGreedySol(a);
        System.out.println(anotherGreedyResult);

    }

    // another greedy method
    private static boolean canJumpAnotherGreedySol(int nums[]) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (reachable < i) {
                return false;
            }
            reachable = Math.max(reachable, i + nums[i]);
        }

        return true;
    }

    // greedy solution
    public static boolean canJumpGreedySolution(int nums[]) {
        int goal = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        if (goal == 0) {
            return true;
        } else {
            return false;
        }
    }

    // recursive solution of jump game
    private static boolean canJumpRecursive(int nums[], int i) {
        if (i >= nums.length - 1) {
            return true;
        }

        if (nums[i] == 0) {
            return false;
        }

        boolean result = false;
        for (int j = 1; j <= nums[i]; j++) {
            result = result | canJumpRecursive(nums, i + j);
            if (result) {
                return result;
            }
        }

        return result;
    }

    // recursive memoize solution
    private static boolean canJumpRecursiveMemoize(int nums[], int i, int[] memoize) {
        if (i >= nums.length - 1) {
            return true;
        }

        if (nums[i] == 0) {
            return false;
        }

        if (memoize[i] != -1) {
            return memoize[i] == 1;
        }

        boolean result = false;
        for (int j = 1; j <= nums[i]; j++) {
            result = result | canJumpRecursive(nums, i + j);
            if (result) {
                memoize[i] = 1;
                return result;
            }
        }

        memoize[i] = result ? 1 : 0;
        return result;
    }

}
