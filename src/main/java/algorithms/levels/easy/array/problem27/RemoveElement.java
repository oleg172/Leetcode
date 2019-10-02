package algorithms.levels.easy.array.problem27;

public class RemoveElement
{
    public int removeElement(int[] nums, int val)
    {
        int i = 0;
        for (int j = 0; j < nums.length; j++)
        {
            if (nums[j] != val)
            {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public int removeElement2(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args)
    {
        //[-3,-1,0,0,0,3,3]
        RemoveElement rElem = new RemoveElement();
        int[] nums = new int[4];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 3;
        int res = rElem.removeElement2(nums, 3);
        int k = 1;
    }
}
