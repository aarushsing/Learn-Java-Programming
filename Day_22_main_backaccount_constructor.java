package Programing.Section6;

public class Day_22_main_backaccount_constructor {
    public static void main(String[] args) {
        System.out.println("");

        Day_22_c_bankaccount default_account = new Day_22_c_bankaccount();
        System.out.println("name: "+default_account.getName());
        System.out.println("account number: "+default_account.getAccount_number());

        System.out.println("");
        System.out.println("");


        Day_22_c_bankaccount Alpha = new Day_22_c_bankaccount(700000,9897, "Alpha","yoyo@gmail.com");
        System.out.println("name: "+Alpha.getName());
        System.out.println("account number: "+Alpha.getAccount_number());

        System.out.println("");

        Alpha.deposit_funds(10000);

        Alpha.withdraw_funds(5000);


    }
}
