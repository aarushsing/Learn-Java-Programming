package Programing.Section5;

public class Day_18_parsing_from_string {
    public static void main(String[] args) {

        System.out.println("************ string to integer *************");
        String numString = "2332";
        System.out.println("numString : "+numString);
        int num = Integer.parseInt(numString);
        System.out.println("String to integer: " +num);
        System.out.println(" ");

        System.out.println("************ string to decimal *************");
        String numberAsString = "2018.125";
        System.out.println("numberAsString= " + numberAsString);


        double number = Double.parseDouble(numberAsString);
        System.out.println("String to decimal = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);



    }
}
