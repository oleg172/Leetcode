package easy.hashTable.problem217;

import java.util.*;

public class Solution
{
    /*
    * дан массив целых чисел. Функция должна вернуть true если любое значение в массиве появляется дважды, иначе false
    * */

    public boolean containsDuplicate(int[] nums)
    {
        if (nums.length < 2)
        {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (!set.add(nums[i]))
            {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums)
    {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] == nums[i - 1])
            {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = new int[0];
        solution.containsDuplicate(nums);
    }
}
