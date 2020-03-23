package comp1110.homework.J07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MenuManyInputs {
    public static int findRange(int[] array) {
        return array[array.length-1] - array[0];
    }

    public static int getMax(int[] array) {
        return array[array.length-1];
    }

    public static int getSecondHighest(int[] array) {
        int rtn = 0;
        for (int i = array.length-1; i>=0; i--) {
            if (array[i] != array[array.length-1]) {
                rtn = array[i];
                break;
            }
        }
        return rtn;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter: ");
        System.out.println("1 to find range of the scores");
        System.out.println("2 to find the maximum score");
        System.out.println("3 to find the second highest score");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> menu = new ArrayList<>();
        int choice = Integer.parseInt(reader.readLine());
        String price;
        // read from console the menu price: https://www.techiedelight.com/read-multi-line-input-console-java/
        // Q: what's the diff between str1 == str2 and str1.equals(str2)
        while (!(price = reader.readLine()).equals("")) {
            menu.add(Integer.parseInt(price));
        }
        Collections.sort(menu);
        // convert ArrayList to array: https://www.techiedelight.com/convert-list-integer-array-int/
        if (choice == 1) System.out.println(findRange(menu.stream().mapToInt(i->i).toArray()));
        if (choice == 2) System.out.println(getMax(menu.stream().mapToInt(i->i).toArray()));
        if (choice == 3) {
            if (menu.size() < 2 || menu.get(menu.size() - 1).equals(menu.get(0))) System.out.println("Invalid Option Selected");
            else System.out.println(getSecondHighest(menu.stream().mapToInt(i->i).toArray()));

        }
    }
}
