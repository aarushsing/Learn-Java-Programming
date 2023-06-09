package Programing.Section4;
// Create a method called displayHighScorePosition
// it should a players name as a parameter, and a 2nd parameter as a position in the high score table
// You should display the players name along with a message like " managed to get into position " and the
// position they got and a further message " on the high score table".
//
// Create a 2nd method called calculateHighScorePosition
// it should be sent one argument only, the player score
// it should return an in
// the return data should be
// 1 if the score is >=1000
// 2 if the score is >=500 and < 1000
// 3 if the score is >=100 and < 500
// 4 in all other cases
// call both methods and display the results of the following
// a score of 1500, 900, 400 and 50

public class Day_11_challenge_methods {
    public static void main(String[] args) {

        int checkinghighscoreposition = calculatehighscorepositions(1500);
        displayhighscorepositions("Aarush",checkinghighscoreposition);

         checkinghighscoreposition = calculatehighscorepositions(900);
         displayhighscorepositions("Alpha",checkinghighscoreposition);

         checkinghighscoreposition = calculatehighscorepositions(400);
         displayhighscorepositions("Putin",checkinghighscoreposition);

         checkinghighscoreposition = calculatehighscorepositions(50);
         displayhighscorepositions("Death",checkinghighscoreposition);

    }


    public static void displayhighscorepositions (String name, int positions){
        System.out.println(name+ " managed to get into position " +positions +" on the high score table.");
    }
    public static int calculatehighscorepositions (int score){
        if (score >= 1000){
            return 1;
        }
        else if (score >=500) {                    // in this (score>= 500 && score<1000)
            return 2;
        }
        else if (score >= 100) {
            return 3;
        }
        else return 4;
    }
}
