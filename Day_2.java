package Programing.Section3;

public class Day_2 {

    public static void main(String[] args) {
        // write your code here
        int myintmaxvalue = Integer.MAX_VALUE;
        int myintminvalue = Integer.MIN_VALUE;
        System.out.println(" Integer minimum value= "+ myintminvalue);
        System.out.println(" Integer maximum value= "+ myintmaxvalue);
        // output:
        // Integer minimum value= -2147483648
        // Integer maximum value= 2147483647

        short myshortmaxvalue = Short.MAX_VALUE;
        short myshortminvalue = Short.MIN_VALUE;
        System.out.println(" Short minimum value= "+ myshortminvalue);
        System.out.println(" Short maximum value= "+ myshortmaxvalue);
        //Short minimum value= -32768
        //Short maximum value= 32767
        long mylongmaxvalue = Long.MAX_VALUE;
        long mylongminvalue = Long.MIN_VALUE;
        System.out.println(" long minimum value= "+ mylongminvalue);
        System.out.println(" long maximum value= "+ mylongmaxvalue);
        // long minimum value= -9223372036854775808
        // long maximum value= 9223372036854775807

        float myfloatvalue = 5.25f; // remove f and it will show error as float is a decimal type and
        // in this type
        // double is default in decimal type
        System.out.println(" my float value: " +myfloatvalue);


        // also we can remove the error by the concept of casting
        float myfloatvalue2= (float) 5.26;
        System.out.println(" my float value2: " +myfloatvalue2);


        int a = 4;
        byte mynewbytevalue = (byte) (a / 2);
        System.out.println(" my new byte value: " +mynewbytevalue);


        // char and boolean

        char mychar = 'D';
        char mychar1 = '\u0044';
        System.out.println(" Normal character :" +mychar);
        System.out.println(" my unicode character :"+mychar1);



    }

}
