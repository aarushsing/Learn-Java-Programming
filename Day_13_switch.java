package Programing.Section5;

public class Day_13_switch {
    public static void main(String[] args) {
//        int value = 2;
//        if(value == 1){
//            System.out.println(" value is 1");
//        }
//        else if(value==2){
//            System.out.println("value is 2");
//        }
//        else{
//            System.out.println(" value is not 1 or 2");
//        }


        int number = 4;
        switch(number){
            case 1:
                System.out.println(" number is 1");
                break;
            case 2:
                System.out.println("number is 2");
                break;
            case 3: case 4: case 5:
                System.out.println(" number is either 3 or 4 or 5");
                System.out.println(" Actually the number is: "+number);
                break;
            default:
                System.out.println("number is not 1 ,2 ,3, 4 ,5");
        }
    }
}
