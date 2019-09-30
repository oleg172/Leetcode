package easy.array.problem26;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates
{
    /*
    * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
    * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
    * */

    public int removeDuplicates(int[] nums)
    {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++)
        {
            if (nums[j] != nums[i])
            {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args)
    {
        //[-3,-1,0,0,0,3,3]
        RemoveDuplicates rDuplicates = new RemoveDuplicates();
        int[] nums = new int[7];
        nums[0] = -3;
        nums[1] = -1;
        nums[2] = 0;
        nums[3] = 0;
        nums[4] = 0;
        nums[5] = 3;
        nums[6] = 3;
        int res = rDuplicates.removeDuplicates(nums);
        int k = 1;
    }
}
