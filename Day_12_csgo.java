package Programing.Section4;
import java.util.*;
public class Day_12_csgo {
    public static void main(String[] args) {


        System.out.println("Enter username :");
        Scanner sc= new Scanner(System.in);
        String username= sc.nextLine();


        boolean off = false;
        csgo( off );
        csgo (true, username);

    }
    public static void csgo(boolean off)  {
        System.out.println("Connecting with server (bom via~ 23).");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int csgo(boolean on, String username){
        System.out.println("Welcome back Agent "+username +", we hope u r doing pretty well. :) ");
        return -1;
    }


}


//        boolean on = true;
//        int kills,assist,deaths;
//        byte years_of_experience;
//        int profile_name;

//        String name=username;
