package algorithms.levels.medium.array.problem15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Проблема №15:
 * Дан массив из целых чисел.
 * Найти в данном массиве уникальные тройки чисел a,b,c что a + b + c = 0
 */
public class Solution {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> lists = new ArrayList<>();
        int n = nums.length;
        if (n < 3) {
            return lists;
        }
        Map<List<Integer>, Integer> map = new HashMap<>();
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            int start = i + 1;
            int end = n - 1;
            if (nums[end] < 0) {
                break;
            }
            while (start < end) {
                int result = nums[i] + nums[start] + nums[end];
                if (result > 0) {
                    end--;
                } else if (result < 0) {
                    start++;
                } else {
                    List<Integer> res = Arrays.asList(nums[i], nums[start], nums[end]);
                    if (!map.containsKey(res)) {
                        lists.add(res);
                        map.put(res, i);
                    }
                    start = upperBound(nums, start, end, 0 - nums[i] - nums[end]);
                }
            }
        }
        return lists;
    }

    //Двоичный (бинарный) поиск элемента в массиве
    private static int upperBound(int[] array, int low, int high, int value) {
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (value >= array[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
