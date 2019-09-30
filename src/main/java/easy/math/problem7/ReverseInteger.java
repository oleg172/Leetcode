package easy.math.problem7;

public class ReverseInteger
{

    /*
    * дано число x. Нужно перевернуть его
    * */

    public int reverse(int x)
    {
        long res = 0;
        while (x != 0)
        {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        int test = (int) res;
        return test == res ? test : 0;
    }

    public static void main(String[] args)
    {
        ReverseInteger reverseInteger = new ReverseInteger();
        reverseInteger.reverse(-1563847412);
    }
}
