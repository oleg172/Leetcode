package easy.array.problem1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];
            if (map.containsKey(complement))
            {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args)
    {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 3;
        int[] res = twoSum.twoSum(nums, 6);
        int k = 1;
    }
}
