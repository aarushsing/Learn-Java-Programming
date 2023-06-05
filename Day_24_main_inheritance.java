package Programing.Section6;

public class Day_24_main_inheritance {
    public static void main(String[] args) {
         Day_24_1_base_animal animal = new Day_24_1_base_animal("Animal",1,1,10);

         Day_24_2_sub_c_dog shadow = new Day_24_2_sub_c_dog("Shadow-pedow",1,1,20,2,4,1,32,"Silky-Shiny black body");
         shadow.eat();

        System.out.println("");
         shadow.walk();
         shadow.run();

    }



}
