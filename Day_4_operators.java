package Programing.Section3;

public class Day_4_operators {
    public static void main(String[] args) {
        String mystring = "this is a string";
        System.out.println("mystring = "+mystring);
        mystring = mystring+ " and i can add line into this string.";
        System.out.println(mystring);
        mystring = mystring+ " i can add symbol into string."+ '\u00a9';
        System.out.println(mystring);

        // using with primitive types .... int, double
        System.out.println(" ");   // space of one line "". if u add \n in "" then it will add 2 line
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

        // OPERATORS

        System.out.println("\n Operators");

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult =  " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult =  " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("1 + 1 = " +result);

        result--;
        System.out.println("2 - 1 = "+ result);

        result += 10;
        System.out.println("1 + 10 = "+result);

        result-= 1;
        System.out.println("11 - 1 = "+result);

        result*= 9;
        System.out.println("10 * 9 = "+result);

        result/= 3;
        System.out.println("90 / 3 = "+result);

    }
}
