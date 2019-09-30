package easy.hashTable.problem204;

import java.util.HashSet;
import java.util.Set;

public class CountPrimes
{
    /*
    * посчитайте количество простых чисел меньше заданого n
    * */
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        // Loop's ending condition is i * i < n instead of i < sqrt(n)
        // to avoid repeatedly calling an expensive function sqrt().
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        CountPrimes countPrimes = new CountPrimes();
        countPrimes.countPrimes(10);
        int k = 1;
    }
}
