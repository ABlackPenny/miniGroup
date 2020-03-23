package comp1110.homework.J06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Even {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= n; i++) if (i%2 == 0) System.out.println(i);
    }
}
