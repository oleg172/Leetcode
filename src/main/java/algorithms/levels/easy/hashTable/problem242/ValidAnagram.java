package algorithms.levels.easy.hashTable.problem242;

import java.util.*;

public class ValidAnagram
{
    /*
    * на вход подаются две строки. Проверить что одна строка является анаграммой другой строки
    *
    * */

    public boolean isAnagram(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }

        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();
        Arrays.sort(arrayS);
        Arrays.sort(arrayT);
        return String.valueOf(arrayS).equals(String.valueOf(arrayT));
    }

    public static void main(String[] args)
    {
        ValidAnagram valid = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        valid.isAnagram(s, t);
        int k = 1;
    }
}
