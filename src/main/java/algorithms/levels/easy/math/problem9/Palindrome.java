package algorithms.levels.easy.math.problem9;


public class Palindrome
{
    /*
    * Определяет является ли число палиндромом
    * 121 - палиндром (121 == 121)
    * -121 - не палиндром (-121 != 121-)
    * 10 - не палиндром (10 != 01)
    * */

    public boolean isPalindrome(int x)
    {
        if (x < 0)
        {
            return false;
        }
        int length = (int) (Math.log10(x) + 1) - 1;
        while (x != 0)
        {
            int first = (int) (x / Math.pow(10, length));
            int last = x % 10;
            if (first != last)
            {
                return false;
            }
            x = (int) (x % Math.pow(10, length));
            x = x / 10;
            length -= 2;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome(-10);
        int k = 1;
    }
}
