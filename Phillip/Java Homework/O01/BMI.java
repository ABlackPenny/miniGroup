package comp1110.homework.O01;

public class BMI {
    private String name;
    private double height;
    private double weight;

    public BMI(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double getBMI() {
        return weight/Math.pow(height, 2);
    }

    public String toString() {
        return name + " is " + height + "m tall and is " + weight + "Kg and has a BMI of " + getBMI() + "Kg/m^2";
    }

    public String getName() {

        return name;
    }

    public static void main(String[] args) {
        BMI p = new BMI("ph", 1.7, 60);
        System.out.println(p.height);
        p.height = 2.2;
        System.out.println(p.height);
    }

}
