package Programing.Section5;

public class Day_13_weekchallenge {
    public static void main(String[] args) {
        dayoftheweek(-1);
        dayoftheweek(0);
        dayoftheweek(1);
        dayoftheweek(2);
        dayoftheweek(3);
        dayoftheweek(4);
        dayoftheweek(5);
        dayoftheweek(6);
        dayoftheweek(7);
    }
    public static void dayoftheweek(int day){
        switch (day){
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
