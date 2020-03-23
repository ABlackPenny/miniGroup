package comp1110.homework.J06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Permute {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // ref: sort a string in java - https://www.geeksforgeeks.org/sort-a-string-in-java-2-different-ways/
        char[] c1 = reader.readLine().toCharArray();
        char[] c2 = reader.readLine().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)) System.out.println("Yes");
        else System.out.println("No");
    }
}
