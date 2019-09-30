package easy.string.problem58;

public class LastWord
{

    /*
    * Дана строка. Найти длину последнего слова
    * */
    public int lengthOfLastWord(String s)
    {
        if (!s.contains(" "))
        {
            return s.length();
        }
        boolean isWord = false;
        int pos = 0;
        for (int i = s.length() - 1; i >= 0; i--)
        {
            if (s.charAt(i) != ' ' && !isWord)
            {
                isWord = true;
                pos = i;
            }
            if (s.charAt(i) == ' ' && isWord)
            {
                return pos - i;
            }
            if (i==0 && isWord)
            {
                return pos + 1;
            }
        }

        return 0;
    }

    public int lengthOfLastWord2(String s) {
        int len = 0, tail = s.length() - 1;
        while (tail >= 0 && s.charAt(tail) == ' ') tail--;
        while (tail >= 0 && s.charAt(tail) != ' ') {
            len++;
            tail--;
        }
        return len;
    }

    public static void main(String[] args)
    {
        LastWord lastWord = new LastWord();
        lastWord.lengthOfLastWord(" a ");
    }
}
