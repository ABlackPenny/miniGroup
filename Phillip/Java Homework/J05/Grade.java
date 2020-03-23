package comp1110.homework.J05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grade {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int grade = Integer.parseInt(reader.readLine());
        if (grade < 0 || grade > 100) System.out.println("Bad mark");
        else if (grade <= 49) System.out.println("N");
        else if (grade <= 59) System.out.println("P");
        else if (grade <= 69) System.out.println("C");
        else if (grade <= 79) System.out.println("D");
        else System.out.println("HD");
    }
}
