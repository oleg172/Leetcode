package algorithms.levels.easy.array.problem53;

public class MaximumSubarray
{
    /*найти максимальный по сумме элементов подмассив в массиве
    * Пример: дан массив [-2,1,-3,4,-1,2,1,-5,4], результат [4,-1,2,1] (максимальная сумма равна 6)*/

    public int maxSubArray(int[] nums)
    {
        int maxSoFar=nums[0], maxEndingHere=nums[0];
        for (int i=1;i<nums.length;++i){
            maxEndingHere= Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args)
    {
        MaximumSubarray maxSubarray = new MaximumSubarray();
        int[] nums = new int[9];
        nums[0] = -2;
        nums[1] = 1;
        nums[2] = -3;
        nums[3] = 4;
        nums[4] = -1;
        nums[5] = 2;
        nums[6] = 1;
        nums[7] = -5;
        nums[8] = 4;
        int res = maxSubarray.maxSubArray(nums);
        int k = 1;
    }
}
