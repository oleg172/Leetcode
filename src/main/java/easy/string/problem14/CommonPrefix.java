package easy.string.problem14;

import java.util.HashMap;
import java.util.Map;

public class CommonPrefix
{
    /*
    * Дан массив строк. Необходимо найти в них наибольший общий превикс
    * */
    public String longestCommonPrefix(String[] strs)
    {
        if (strs.length == 0)
        {
            return "";
        }
        Map<Integer, Character> map = new HashMap<>();
        boolean isTrue = true;
        int index = 0;
        while (isTrue)
        {
            for (int i = 0; i < strs.length; i++)
            {
                if (strs[i].length() == index)
                {
                    isTrue = false;
                    index--;
                    break;
                }
                if (i == 0)
                {
                    map.put(index, strs[i].charAt(index));
                }
                if (map.replace(index, strs[i].charAt(index)) != strs[i].charAt(index))
                {
                    isTrue = false;
                    index--;
                    break;
                }
            }
            index++;
        }
        String commonPrefix = "";
        for (int i = 0; i < index; i++)
        {
            commonPrefix += map.get(i);
        }
        return commonPrefix;
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static void main(String[] args)
    {
        CommonPrefix commonPrefix = new CommonPrefix();
        String[] strs = new String[3];
        strs[0] = "leets";
        strs[1] = "fro";
        strs[2] = "cat";
        commonPrefix.longestCommonPrefix2(strs);
        int k = 1;
    }
}
