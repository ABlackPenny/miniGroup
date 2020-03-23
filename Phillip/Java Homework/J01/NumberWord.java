package comp1110.homework.J01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberWord {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        System.out.println(n+", "+s);
    }
}
