package algorithms.levels.easy.array.problem35;

public class SearchInsertPos
{
    public int searchInsert(int[] nums, int target)
    {
        if (nums.length == 0)
        {
            return 0;
        }
        int low = 0;
        int high = nums.length;
        int index = Integer.MAX_VALUE;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (mid >= nums.length)
            {
                index = mid;
                break;
            }
            if (nums[mid] < target)
            {
                low = mid + 1;
            }
            else if (nums[mid] > target)
            {
                high = mid - 1;
                index = mid;
            }
            else if (nums[mid] == target)
            {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args)
    {
        SearchInsertPos sPos = new SearchInsertPos();
        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 6;
        int res = sPos.searchInsert(nums, 0);
        int k = 1;
    }
}
