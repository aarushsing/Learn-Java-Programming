package Programing.Section6;

public class Day_21_main_class {
    public static void main(String[] args) {
        Day_21_c_Cars porsche = new Day_21_c_Cars();

        porsche.setDoors(4);
        porsche.setModel("porsche");

        System.out.println("Car name is: "+porsche.getModel());
        System.out.println("car have: " +porsche.getDoors() +" doors");
    }
}
