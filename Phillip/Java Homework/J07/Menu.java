package comp1110.homework.J07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
    public static int findRange(int[] array) {
        return array[array.length - 1] - array[0];
    }

    public static int getMax(int[] array) {
        return array[array.length - 1];
    }

    public static int getSecondHighest(int[] array) {
        int rtn = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != array[array.length - 1]) {
                rtn = array[i];
                break;
            }
        }
        return rtn;
    }

    public static void main(String[] args) {
        System.out.println("Please enter: ");
        System.out.println("1 to find range of the scores");
        System.out.println("2 to find the maximum score");
        System.out.println("3 to find the second highest score");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice > 3 || choice < 1) System.out.println("Invalid Option Selected");
        int numOfItems = scanner.nextInt();
        int[] array = new int[numOfItems];
        for (int i = 0; i < numOfItems; i++) {
            array[i] = scanner.nextInt();
        }
        if (choice == 1) System.out.println(findRange(array));
        if (choice == 2) System.out.println(getMax(array));
        if (choice == 3) System.out.println(getSecondHighest(array));
    }
}
