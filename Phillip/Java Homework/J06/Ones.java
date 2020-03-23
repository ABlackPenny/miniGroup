package comp1110.homework.J06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ones {
    public static void main(String[] args) throws IOException {
        int numOf1s = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        while (n > 0) {
            if (n%2 == 1) numOf1s += 1;
            n /= 2;
        }
        System.out.println(numOf1s);
    }
}
