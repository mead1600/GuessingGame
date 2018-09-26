package MeadGyawu;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    /*public static void main(String[] args) {
	// write your code here
       int randomnum = (int)(10.0*Math.random());
       System.out.println("What is my number");
       Scanner answer = new Scanner(System.in);
       int realVal = answer.nextInt();
       while(realVal != randomnum)
       {
            System.out.println("WRONG STOOPID!!!!! POOGERS");
            answer = new Scanner(System.in);
            realVal = answer.nextInt();
       }
       System.out.println("YOU WIN PogChamp PogChamp!!!!!!");
    }*/
    public static void main(String[] args){
        int compGuess = 50;
        int divsor = 2;
        int lowerBoundary = -1;
        int upperBoundary = 101;
        System.out.println("Is your number " + compGuess);
        Scanner verifier = new Scanner(System.in);
        String verifiedResult = verifier.nextLine();
        while (!(verifiedResult .equals("correct")))
        {
            if(verifiedResult.equals("higher"))
            {
                lowerBoundary = compGuess;
                compGuess = compGuess + compGuess/2;
                System.out.println("Is your number " + compGuess);
                verifier = new Scanner(System.in);
                verifiedResult = verifier.nextLine();
            }
            if (verifiedResult.equals("lower"))
            {
                upperBoundary = compGuess;
                compGuess = compGuess - compGuess/2;
                System.out.println("Is your number " + compGuess);
                verifier = new Scanner(System.in);
                verifiedResult = verifier.nextLine();
            }
        }
        System.out.println("YAY I WON. I ROCK AND YOU SOCCC");
    }
}
