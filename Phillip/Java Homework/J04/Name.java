package comp1110.homework.J04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Name {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        name = name.toUpperCase();
        System.out.println(name);
        System.out.println(name.length());
    }
}
