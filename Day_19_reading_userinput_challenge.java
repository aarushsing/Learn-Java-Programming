package Programing.Section5;

import java.util.Scanner;

public class Day_19_reading_userinput_challenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int sum = 0;


        while(true){
            int order = counter +1;
            System.out.println(" Enter number# "+order +":");

            boolean hasnextint = sc.hasNextInt();
            if(hasnextint){
                int num = sc.nextInt();
                counter++;
                sum +=num;
                if( order ==10 )
                    break;

            }
            else{
                System.out.println(" Invalid number: ");
            }
            sc.nextLine();
        }

        sc.close();
        System.out.println(" sum is: "+sum);
    }
}
