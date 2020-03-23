package comp1110.homework.O02;

import java.util.Scanner;

public enum Element {
    H(1,1, 1), He(2, 18, 1), Li(3, 1, 2), Be(4, 2, 2), B(5, 13, 2);

    private int[] facts = new int[3];

    Element(int weight, int group, int period) {
        facts[0] = weight;
        facts[1] = group;
        facts[2] = period;
    }

    public int[] getFacts() {return facts;}

    public String toString() {return "Element weight: " + getFacts()[0] + ", group: " + getFacts()[1] + ", and period: "+ getFacts()[2];}

    public static void main(String[] args) {
        System.out.println("Please input an element(e.g. H, Be...): ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(Element.valueOf(scanner.nextLine()));
    }
}
