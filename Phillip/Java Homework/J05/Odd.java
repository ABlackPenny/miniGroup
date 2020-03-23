package comp1110.homework.J05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (isOdd(n)) System.out.println(n+" is odd");
        else System.out.println(n+" is even");
    }
    public static boolean isOdd(int i) {
        return i % 2 != 0;
    }
}
