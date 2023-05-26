package Programing.Section5;

public class Day_13_switchchallenge {
    public static void main(String[] args) {
        char character = 'A';
        switch(character){
            case 'A':
            System.out.println("it's A");
            break;
            case 'B':
                System.out.println("it's B");
            break;
            case 'C':
                System.out.println("it's C");
            break;
            case 'D':
                System.out.println("it's D");
            break;
            case 'E':
                System.out.println("it's E");
            break;
            default:
                System.out.println("not found.");
        }
        System.out.println("");

        //using .toLowercase

        String month = "November";
        switch (month.toLowerCase()){
            case "november":
                System.out.println("it's a month of November");
                break;
            case "january":
                System.out.println("it's a month of January");
                break;
            default:
                System.out.println("it's not january or november");
        }
    }
}
