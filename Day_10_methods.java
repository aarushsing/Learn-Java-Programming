package Programing.Section4;

public class Day_10_methods {
    public static void main(String[] args) {

        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;

        calculatescore( gameover, score, levelcompleted, bonus); //  result/output : first line finalscore by this manner. (variables defined in main)


        calculatescore(true,800,5,200);          //second line finalscore by this method (void , no return)

        calculatescore(true,800,5,300);

        calculatescore(true, 1000, 4);   //  fourth line i.e (2nd score) by this method (int, return type)


        int playerA = calculatescore(true, 3000);
        int playerB = calculatescore(true,5500);

        int teampoint = playerA + playerB;
        System.out.println("teampoint of A and B is :"+teampoint);     // fourth line and th return value of playerA and player B is used.



    }

    public static void calculatescore(boolean gameover, int score, int levelcompleted, int bonus){
        if (gameover){
            int finalscore = score + (levelcompleted*bonus);                 // void method
            finalscore += 2000;
            System.out.println("your finalscore is:  "+finalscore);
        }
    }
    // if we have used 'int' instead of 'void' before 'calculatescore' then we have to return a value too.
    // and also we have to make sure that all the possible outcomes are covered in our code in a method.
    // eg:-
    public static int calculatescore (boolean gameover , int score, int levelcompleted){
        if (gameover){
            int finalscore = score;                         // int method
            System.out.println("2nd score (by int return type): "+score);
            return finalscore;
        }
        return -1;
    }


    // by doing this we can also give this method a variable name in main and we can then can use its value for some another part of code.
    // refer to main method

    public static int calculatescore (boolean gameover , int score){
        if (gameover){
            int finalscore = score;            // int method and the return value is assigned to a variable and teamscore is calculated.
            return  finalscore;
        }
        return -1;
    }




}
