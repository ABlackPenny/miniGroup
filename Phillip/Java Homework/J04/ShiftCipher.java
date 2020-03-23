package comp1110.homework.J04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShiftCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int shift = Integer.parseInt(reader.readLine()) % 26;
        StringBuilder sShifted = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                sShifted.append(Character.toString('a' + (s.charAt(i) - 'a' + shift) % 26));
            } else if ('A'<=s.charAt(i) && s.charAt(i)<='Z') {
                sShifted.append(Character.toString('A' + (s.charAt(i) - 'A' + shift) % 26));
            } else {
                sShifted.append(s.charAt(i));
            }
        }
        System.out.println(sShifted);
    }
}
