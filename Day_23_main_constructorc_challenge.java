package Programing.Section6;

public class Day_23_main_constructorc_challenge {
    public static void main(String[] args) {

        System.out.println(" ");

        Day_23_c_constructor_challenge emptyfield = new Day_23_c_constructor_challenge();
        System.out.println(emptyfield.getName()+" credit limit is "+emptyfield.getCredit_limit() +" and email is " +emptyfield.getEmail_address());

        System.out.println(" ");

        Day_23_c_constructor_challenge twofield = new Day_23_c_constructor_challenge("tom",888);
        System.out.println(twofield.getName()+" credit limit is "+twofield.getCredit_limit() +" and email is " +twofield.getEmail_address());

        System.out.println(" ");

        Day_23_c_constructor_challenge allfield = new Day_23_c_constructor_challenge("bob",10000,"bob@gmail.com");
        System.out.println(allfield.getName()+" credit limit is "+allfield.getCredit_limit() +" and email is " +allfield.getEmail_address());
        System.out.println(" ");


    }
}
