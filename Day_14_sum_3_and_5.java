package Programing.Section5;

public class Day_14_sum_3_and_5 {
    public static void main(String[] args) {
      int count = 0;
      int sum = 0;
      for(int i = 1; i <=1000; i++){
          if ((i % 3 == 0) && (i % 5 == 0)){
              // System.out.println("number found "+i);   we can't write this line of code here because then it will consider zero also
              count++;
              sum +=i;
              System.out.println("number found "+i);
          }
          if (count ==5){
              break;
          }
      }
        System.out.println("sum = "+sum);
    }
}
