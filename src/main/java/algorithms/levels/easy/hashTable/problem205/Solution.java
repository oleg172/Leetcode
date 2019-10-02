package algorithms.levels.easy.hashTable.problem205;

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    /*
    * даны две строки. Определить являются ли они изоморфными. Две строки изоморфны, если все символы одной строки
    * могут заменить на символы другой строки, сохранив при этом порядок символов
    * Пример:
    *  "egg", "add", return true.
    *  "foo", "bar", return false.
    *  "paper", "title", return true.
    * */

    public boolean isIsomorphic(String s, String t)
    {
        if (s == null || t == null)
        {
            return false;
        }
        if (s.length() != t.length())
        {
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
        {
            int indexS = mapS.getOrDefault(s.charAt(i), -1);
            int indexT = mapT.getOrDefault(t.charAt(i), -1);

            if (indexS != indexT)
            {
                return false;
            }

            mapS.put(s.charAt(i), i);
            mapT.put(t.charAt(i), i);
        }

        return true;
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        solution.isIsomorphic("paper", "title");
        int k = 1;
    }

}
