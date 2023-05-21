package Programing.Section3;

public class Day_5_if_else_statement {
    public static void main(String[] args) {

        // if-then statement
        boolean isaliean = false;

        if (isaliean == false) {
            System.out.println(" its not an aliean.");
        }

        int score = 100;
        if ( score == 100 ){
            System.out.println(" you scored the highest.");
        }
        if ( score != 100 ){
            System.out.println(" nothing will print because score != 100 is a false statement");
        }
        if ( score > 100 ){
            System.out.println(" it will also not print anything as it is false statement");
        }
        if (score >= 100) {
            System.out.println("\n\n you scored the highest. (it prints in this case because >= means greater than or equal to)");
        }

        // AND operator (&&)

        int first_top = 90 ;
        int second_top = 80 ;
        if (first_top < 100 && second_top == 80){  //we can also add the conditions in bracket like ((first_top < 100) && (second_top == 80))
            System.out.println(" \n its satisfing both the conditions of AND operator. ");
        }

        // OR Operator (||)

        if ( (first_top > 90) || (second_top <= 90)) {
            System.out.println(" \n Either or both of the conditions is/are true.");
        }

    }
}

