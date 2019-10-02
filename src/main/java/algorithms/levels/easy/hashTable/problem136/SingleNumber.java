package algorithms.levels.easy.hashTable.problem136;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber
{
    /*дан массив целых чисел. Каждый элемент в данном массиве появляется дважды, кроме одного.
    Найдите этот один элемент*/

    public int singleNumber(int[] nums)
    {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (set.contains(nums[i]))
            {
                set.remove(nums[i]);
            }
            else set.add(nums[i]);
        }
        return set.iterator().next();
    }
}
