package comp1110.homework.J01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Greet {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
////        System.out.print("Hi, "+name+"!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("Hi "+name+"!");
    }
}
