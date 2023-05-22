package Programing.Section4;

public class Day_9_challenge_BMI {
    public static void main(String[] args) {

        int score = 5001;
        int weight = 76;
        int height = 184;
        boolean entry = true;

        if (score > 5000) {
            System.out.println("congratulations!! u r applicable.");
        }
        else if (score < 5000){
            System.out.println("not applicable");
        }
        else {
            System.out.println("this is a valid score of 5000");
        }

        if (entry== true){
            int BMI = 100 * (weight+height);  // just a fake formula for example
            System.out.println("\n\tBody mass ratio: "+BMI);
        }
               // if i try to call BMI outside the codeblock{} like:-
        //                                    int newBMI = BMI;
        //                                       this wont be able to process and error will interrupt.


        score = 7000;
        weight = 33;
        height = 150;
        if (entry== true){                             // i just changed the values for this output
            int BMI = 100 * (weight+height);           // not a proper way because we are just duplicating the code
            System.out.println("\n\tBMI: "+BMI);       //

        }
        int newscore = score;
        newscore= 10000;
        int newweight = weight;
        newweight = 80;                        // i created the object of these variables and now take out the new BMI
        int newheight = height;
        newheight = 190;
        if ( entry == true){
            int newBMI = 100 * (newweight+newheight);
            System.out.println("\n\tnew BMI: "+newBMI);
        }
    }


    // it's all above is method which is under main , now we will create our own method.



    public static void calculate(){
            // our method name is calculate which is a void type means it will not return any value.
    }
}
