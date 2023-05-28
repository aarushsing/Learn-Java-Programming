package Programing.Section5;

public class Day_15_while {
    public static void main(String[] args) {
        // while loop
        int count = 1;
        while (count != 5){
            System.out.println("value in while loop are "+count);
            count++;
        }

        System.out.println("********");

        //for loop
        for (count=1; count!=5 ; count++){
            System.out.println("value in for loop are "+count);
        }

        System.out.println("********");

        count =1;
        do {
            System.out.println("Count value in do-while loop are " + count);
            count++;
        } while(count != 5);


    }
}
