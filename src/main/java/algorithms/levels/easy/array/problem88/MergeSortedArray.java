package algorithms.levels.easy.array.problem88;

public class MergeSortedArray
{
    /*даны два массива nums1 и nums2. Объединить nums2 в nums1 как один отсортированный массив */

    //заполняем с последнего элемента
    public void merge2(int[] nums1, int m, int[] nums2, int n)
    {
        if (n != 0)
        {
            if (m == 0)
            {
                for (int i = 0; i < n; i++)
                {
                    nums1[i] = nums2[i];
                }


            } else
            {
                int mm = m - 1;
                int nn = n - 1;
                for (int i = n + m - 1; i >= 0; i--)
                {
                    int loc = Math.max(nums1[mm], nums2[nn]);
                    nums1[i] = loc;
                    if (loc == nums1[mm])
                    {
                        mm--;
                    } else
                    {
                        nn--;
                    }
                    //когда-то одн индекс стал нулевым
                    if (nn == -1 || mm == -1)
                    {
                        break;
                    }
                }
                //остался хвостик в одной из массивов
                if (nn != -1)
                {
                    for (int i = nn; i >= 0; i--)
                    {
                        nums1[i] = nums2[i];
                    }
                }


            }
        }
    }

    //мой вариант
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        if (m == 0)
        {
            for (int i = 0; i < nums1.length; i++)
            {
                nums1[i] = nums2[i];
            }
            return;
        }

        int count = 0;
        for (int i = 0; i < nums2.length; i++)
        {
            int pos = searchInsert(nums1, m + count, nums2[i]);
            for (int j = nums1.length - 1; j > pos; j--)
            {
                nums1[j] = nums1[j - 1];
            }
            nums1[pos] = nums2[i];
            count++;
        }
    }

    public int searchInsert(int[] nums, int h, int target)
    {
        if (nums.length == 0)
        {
            return 0;
        }
        int low = 0;
        int high = h;
        int index = Integer.MAX_VALUE;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (mid >= h)
            {
                index = mid;
                break;
            }

            if (nums[mid] < target)
            {
                low = mid + 1;
            } else if (nums[mid] > target)
            {
                high = mid - 1;
                index = mid;
            } else if (nums[mid] == target)
            {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args)
    {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = new int[4];
        nums1[0] = -1;
        nums1[1] = 2;
        nums1[2] = 0;
        nums1[3] = 0;
        int[] nums2 = new int[2];
        nums2[0] = 1;
        nums2[1] = 2;
        mergeSortedArray.merge2(nums1, 2, nums2, 2);
        int k = 1;
    }


}
