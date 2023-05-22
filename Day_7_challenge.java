package Programing.Section3;

public class Day_7_challenge {
    public static void main(String[] args) {

        double a = 20.00d;
        double b = 80.00d;
        double c = (a + b)*100.00d;
        double result = c % 40d;
        boolean d = (result== 0) ? true : false;
        System.out.println(" output of boolean variable: "+d);
        if (!d)
        {
            System.out.println(" got some remainder ");
        }



    }
}
