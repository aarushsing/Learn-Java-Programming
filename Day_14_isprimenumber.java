package Programing.Section5;

public class Day_14_isprimenumber {
    public static void main(String[] args) {
        int count = 0;
        long starttime = System.nanoTime();
        for(int i=250; i<360; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
        long endtime = System.nanoTime();
        System.out.println("our program took " +(endtime-starttime) + " nano seconds to execute");
    }


    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            //System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }

}
