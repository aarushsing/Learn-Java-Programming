package Programing.Section3;

public class Day_1 {
    public static void main(String[] args)
    {

        System.out.println("Hey there, its aarush singh here.");
        int a = (10+5)*(23-3);
        int b = 75;
        int c = a-b;
        int total = a+b+c;
        System.out.println("total= "+total+"   ");
        int integer_minvalue =Integer.MIN_VALUE;
        int integer_max_value =Integer.MAX_VALUE;

        System.out.println(integer_minvalue+"   "+integer_max_value);

        int f= 2_147_483_647;
        long M= 214748364746L;
        System.out.println(f+ "  " + M);

        byte e=Byte.MAX_VALUE;
        byte new_byte=(byte)(e / 2);
        System.out.println(new_byte);

        int k=Integer.MAX_VALUE;
        int new_int=(int)(k / 2);
        System.out.println(new_int);

        byte ab=32;
        short bc=21;           // primitive type challenges
        int i=4900;
        long Longvalue= 50000L - 10L *(ab+bc+i);
        System.out.println("its longvalue: "+Longvalue);
        short Shortvalue=(short) (10000 - 10*(ab+bc));     // in short-type we have to use short in parathesis before operation
        System.out.println(Shortvalue);


        /*  decimal no.s (floating point )
          they have fractional parts so we use float and double to express floating point numbers
          double have much larger range and precision than float......
          float width is 32 while double is 64
        */

        float floatmaxvalue= Float.MAX_VALUE;
        float floatminvalue= Float.MIN_VALUE;
        System.out.println(floatmaxvalue+"     "+floatminvalue);



        double doublemaxvalue= Double.MAX_VALUE;
        double doubleminvalue= Double.MIN_VALUE;
        System.out.println(doublemaxvalue+"     "+doubleminvalue);

        //string:-
        String stringname = "This is aarush";
        System.out.println(stringname+". Hello ALPHA");
        stringname = stringname+" yoyo";
        System.out.println(stringname);
        stringname = stringname+" \u00A9 00:44,03/03/2022";      //u00A9 is used for copyright symbol.
        System.out.println(stringname);

        String stringnumber="253.44";
        stringnumber= stringnumber+88;                      //string treats number too as text. so output= 253.4488
        System.out.println(stringnumber);


    }
}


