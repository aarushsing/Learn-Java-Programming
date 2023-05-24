package Programing.Section4;

public class Day_12_methodoverloading {
    public static void main(String[] args) {
       int newscore= calculatedscore("Aarush",200);
        System.out.println("newscore is now "+newscore +" points");
        System.out.println("");
        calculatedscore(75);

    }
    public static int calculatedscore(String name, int score){
        System.out.println("Player "+name+" scored " +score+" points");
        return score * 2;
    }
    public static int calculatedscore(int score) {
        System.out.println("unnamed Player " + "scored " + score + " points");
        return score * 2;
    }
}
