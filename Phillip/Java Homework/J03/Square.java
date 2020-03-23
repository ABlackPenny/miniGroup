package comp1110.homework.J03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int side = Integer.parseInt(reader.readLine());
        int area = (int) Math.pow(side, 2);
        System.out.println(area);
    }
}
