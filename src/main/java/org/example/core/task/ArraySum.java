package org.example.core.task;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

public class ArraySum {
    public int arraysum(int[] nums) {
        int summ = 0;
        for (int i = 0; i < nums.length; i++) {
            summ = summ + nums[i];
        }
        return summ;
    }
}

class ArraySumTest {
    private ArraySum arraySum = new ArraySum();

    @Test
    void test() {
        int[] array = {1, 1, 1};
        assertThat(arraySum.arraysum(array)).isEqualTo(3);
        System.out.println("hello");
    }

    @Test
    void test2() {
        int[] array = {1, 1, 1, 2, 3, 4, 6, 7, 7,};
        assertThat(arraySum.arraysum(array)).isEqualTo(32);
        System.out.println("hello");
        System.out.println(assertThat(true).isEqualTo(true));
    }//
}
