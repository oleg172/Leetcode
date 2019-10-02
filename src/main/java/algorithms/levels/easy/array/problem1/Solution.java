package algorithms.levels.easy.array.problem1;

import java.util.HashMap;
import java.util.Map;


/**
 * Проблема №1:
 * Дан массив, состоящий из целых чисел. Необходимо вернуть индексы двух чисел из массива,
 * сумма которых равна передоваемому числу.
 * Гарантируется что в массиве будет только одно такое решение.
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
