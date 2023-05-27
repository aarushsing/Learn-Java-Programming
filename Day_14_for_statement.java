package Programing.Section5;

public class Day_14_for_statement {
    public static void main(String[] args) {
        // System.out.println("interest at 100 with 5% rate is: "+calculateinterest(100,5));

        // implementation of for loop
        for(int i =0; i<5; i++){
            System.out.println("loop "+i + " says hey");
        }
        System.out.println("");
        // now let's calculate our interest at different rates

        for(double rate=0; rate<5; rate++){
            System.out.println("interest rate at 500 with rate " +rate +"% is : " +calculateinterest(500, rate));
        }
        System.out.println("");

        System.out.println("to get desired answer till some decimal places we can use String.format: "+String.format("%.4f",calculateinterest(500 ,4)));
    }
    public static double calculateinterest(double amount, double rate){
        return (amount*(rate/100));
    }
}
