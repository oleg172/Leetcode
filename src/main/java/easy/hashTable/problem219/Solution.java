package easy.hashTable.problem219;

import java.util.HashMap;
import java.util.Map;

public class Solution
{

    /*
    * Дан массив целых чисел и целове число k. Найти два таких индекса i и j, что nums[i] = nums[j] и разность между
    * i и j будет равна k.
    * */
    public boolean containsNearbyDuplicate(int[] nums, int k)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            Integer ord = map.put(nums[i], i);
            if (ord != null && i - ord <= k)
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = new int[2];
        nums[0] = 99;
        nums[1] = 99;
        solution.containsNearbyDuplicate(nums, 2);
        int k = 1;
    }
}
