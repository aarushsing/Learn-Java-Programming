package Programing.Section3;

public class Day_6_equal_to_and_ternary {
    public static void main(String[] args) {

        // assignment.java and equal to operator

        boolean Entry = false;
        if ( Entry = true ){
            System.out.println(" this should not be printed 1.");
        }

                       // THE MAJOR DIFFERENCE IS = SIGN IN BOTH OF THEM, ENTRY2 METHOD IS THE CORRECT WAY.

        boolean Entry2 = false;           // corrected method
        if ( Entry2 == true){
            System.out.println(" this should not be printed 2.");
        }

        // NOT  operator

        boolean iscar = false;
        if (!iscar){
            System.out.println("its a recommended way to check boolean is false");
        }

        // Ternary operator

        boolean is_coding_easy = true;
        boolean finethen = is_coding_easy ? true : false ;
        if ( finethen ) {
            System.out.println(" i will work hard to learn coding. ");
        }


    }
}
