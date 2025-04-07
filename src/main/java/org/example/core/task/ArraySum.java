package org.example.core.task;

public class ArraySum {
    public int arraysum(int[] nums) {
        int summ = 0;
        for (int i = 0; i < nums.length; i++) {
            summ = summ + nums[i];
        }
        return summ;
    }
}
