package Programing.Section5;

import java.util.Scanner;

public class Day_18_reading_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


       /* System.out.println(" Enter your age: ");
        int age = sc.nextInt(); */

        // we have comment these line because if we run it , code will generate a ENTER-KEY-ISSUE which will skip "enter your name part".
        // To prevent ENTER KEY ISSUE GENERATED BY next.Int .... after this line we will type a line seperator on next line i.e sc.nextline()
        // remember always wriye sc.nextLine(); right after


        // to prevent invalid filed type (input - mismatch exception) we will use sc.hasNextInt() as a method which returns boolean type.




            System.out.println(" Enter your name: ");
            String name = sc.nextLine();


            System.out.println(" Enter your age: ");
         boolean prevent_mismatch_exception = sc.hasNextInt();
            if (prevent_mismatch_exception) {
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println(" city: ");
            String city = sc.nextLine();

            System.out.println(" To mein kya karu agar tera naam " + name + " hai aur tu " + age + " saal ka hai . usse mera kya fayda!!");
            System.out.println(" sorry i was just kidding , by the way i am from " + city + " too.");
        }
        else{
            System.out.println(" Invalid entry. (unable to parse your age) ");
        }
            sc.close();


    }
}
