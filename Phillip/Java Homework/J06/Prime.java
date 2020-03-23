package comp1110.homework.J06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i: primes(n)) if (i != 0) System.out.println(i);
    }

    // ref: https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
    // using sieve of eratosthenes to find all the prime numbers
    public static int[] primes(int n) {
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i < n+1; i++) isPrime[i] = true;
        int[] rtn = new int[n+1];

        for (int i = 2; i < n+1; i++) {
            if (isPrime[i]) for (int p = i *2; p < n+1; p += i) isPrime[p] = false;
        }
        for (int i = 2; i < n+1; i++) {
            if (isPrime[i]) rtn[i] = i;
        }
        return rtn;
    }
}
