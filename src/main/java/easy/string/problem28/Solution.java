package easy.string.problem28;

public class Solution
{

    /*
    * Даны две строки. найти индекс первого появления строки 'needle' в строке 'haystack'.
    * Если оно не появляется то вернуть -1. Если строка 'needle' пуста, то вернуть 0
    * */

    public int strStr(String haystack, String needle)
    {
        if (needle.isEmpty())
        {
            return 0;
        }
        int index = 0;
        int indexOf = haystack.length();
        for (int i = 0; i < haystack.length(); i++)
        {
            if ((index == 0) && (haystack.length() - i) < needle.length())
            {
                return -1;
            }
            if (haystack.charAt(i) == needle.charAt(index))
            {
                if (i < indexOf)
                {
                    indexOf = i;
                }
                if (index == needle.length() - 1)
                {
                    return indexOf;
                }
                index++;
            } else
            {
                index = 0;
                if (indexOf != haystack.length())
                {
                    i = indexOf;
                }
                indexOf = haystack.length();
            }
        }
        return -1;
    }

    public int strStr2(String haystack, String needle)
    {
        int l1 = haystack.length();
        int l2 = needle.length();
        if (l1 < l2)
        {
            return -1;
        } else if (l2 == 0)
        {
            return 0;
        }
        for (int i = 0; i <= l1 - l2; i++)
        {
            if (haystack.substring(i, i + l2).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        solution.strStr("mississippi", "pi");
        int k = 1;
    }
}
