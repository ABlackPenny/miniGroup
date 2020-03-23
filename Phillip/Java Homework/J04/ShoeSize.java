package comp1110.homework.J04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShoeSize {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double height = Double.parseDouble(reader.readLine());
        int shoeSize = (int) Math.round(height*5.0);
        System.out.println(shoeSize);
    }
}
