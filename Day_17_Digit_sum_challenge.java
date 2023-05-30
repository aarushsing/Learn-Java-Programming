package Programing.Section5;


//Write a method with the name sumDigits that has one int parameter called number.
//
//        If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
//
//        The numbers from 0-9 have 1 digit so we donft want to process them, also we donft want to process negative numbers, so also return -1 for negative numbers.
//
//        For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
//
//        Calling the method sumDigits(1) should return -1 as per requirements described above.
//
//        Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.
//
//        Hint:
//        Use n % 10 to extract the least-significant digit.
//        Use n = n / 10 to discard the least-significant digit.
//        The method needs to be static like other methods so far in the course.
//
//        Tip:
//        Create a project with the name DigitSumChallenge.


public class Day_17_Digit_sum_challenge {
    public static void main(String[] args) {
        System.out.println("sum of digits of 25: " +sumdigits(25));
        System.out.println("sum of digits of 8: " +sumdigits(8));

        System.out.println("sum of digits of -22: " +sumdigits(-22));

        System.out.println("sum of digits of 88394: " +sumdigits(88394));

    }
    public static int sumdigits(int number){

        int sum = 0;

        if( number <10 ){
         return -1;
     }

     else if (number > 10){  // even if we remove else if statement from here , it won't make any changes because our while loop condition is already taking care of number > 10.
         while( number > 10){
             int digit = number % 10;
             sum += digit;

             number = number / 10;
         }
     }

        return sum;
    }
}
