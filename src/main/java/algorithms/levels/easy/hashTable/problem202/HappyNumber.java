package algorithms.levels.easy.hashTable.problem202;

import java.util.HashSet;

public class HappyNumber
{
    /*
    * чилсо является счастливым, если: оно начинается с любого положительного числа, замена числа суммой квадратов его цифр(и так продалжаем в цикле) пока число не равно 1.
    * Пример: 19 - счастливое число:
    *       12 + 92 = 82
            82 + 22 = 68
            62 + 82 = 100
            12 + 02 + 02 = 1*/

    public boolean isHappy(int n)
    {
        if (n < 0)
        {
            return false;
        }
        int res = n;
        HashSet<Integer> set = new HashSet<>();
        while (set.add(n))
        {
            int sum = 0;
            while (n > 0)
            {
                sum += Math.pow(n % 10, 2);
                n = n / 10;
            }
            n = sum;
            if (n == 1)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        HappyNumber happyNumber = new HappyNumber();
        happyNumber.isHappy(19);
        int k = 1;
    }
}
