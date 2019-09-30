package easy.string.problem13;

public class Roman
{

    /*
    * число в римской записи перевести в число
    * */

    public int romanToInt(String s)
    {
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
        {
            switch (s.charAt(i))
            {
                case 'I':
                {
                    if (i != s.length() - 1)
                    {
                        if (s.charAt(i + 1) != 'V' && s.charAt(i + 1) != 'X')
                        {
                            sum++;
                        } else
                        {
                            sum--;
                        }
                    } else
                    {
                        sum++;
                    }
                    break;
                }
                case 'V':
                {
                    sum += 5;
                    break;
                }
                case 'X':
                {
                    if (i != s.length() - 1)
                    {
                        if (s.charAt(i + 1) != 'L' && s.charAt(i + 1) != 'C')
                        {
                            sum += 10;
                        } else
                        {
                            sum -= 10;
                        }
                    } else
                    {
                        sum += 10;
                    }
                    break;
                }
                case 'L':
                {
                    sum += 50;
                    break;
                }
                case 'C':
                {
                    if (i != s.length() - 1)
                    {
                        if (s.charAt(i + 1) != 'D' && s.charAt(i + 1) != 'M')
                        {
                            sum += 100;
                        } else
                        {
                            sum -= 100;
                        }
                    } else
                    {
                        sum += 100;
                    }
                    break;
                }
                case 'D':
                {
                    sum += 500;
                    break;
                }
                case 'M':
                {
                    sum += 1000;
                    break;
                }
            }
        }
        return sum;
    }

    public int romanToInt2(String s)
    {
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (i != s.length() - 1)
            {
                if (toNumber(s.charAt(i)) >= toNumber(s.charAt(i + 1)))
                {
                    sum += toNumber(s.charAt(i));
                } else
                {
                    sum -= toNumber(s.charAt(i));
                }
            } else
            {
                sum += toNumber(s.charAt(i));
            }
        }
        return sum;
    }

    private int toNumber(char s)
    {
        switch (s)
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Roman roman = new Roman();
        roman.romanToInt2("III");
        int k = 1;
    }
}
