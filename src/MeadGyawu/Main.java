package MeadGyawu;
import java.util.Scanner;
import java.lang.Math;
// Both methods work individually, when the second one isn't commented out, either neither program runs, or only the first program runs.
// So if you want to use the second program, comment out the first one and bring the second one out of the comments
//test 1xe`
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("What is your name?");
        Scanner name = new Scanner(System.in);
        String username = name.nextLine();
        System.out.println("Which game do you want to play "+ username +"? choose between 'Guess the computers number' and 'The computer will guess your number'");
        Scanner choice = new Scanner(System.in);
        String TheChoice = choice.nextLine();
        if (TheChoice.equals("Guess the computers number")) {
            int randomnum = (int) (10.0 * Math.random());
            System.out.println("What is my number");
            Scanner answer = new Scanner(System.in);
            int realVal = answer.nextInt();
            while (realVal != randomnum) {
                System.out.println("WRONG!!"+ username + " IS STOOPID!!!!! POOGERS");
                answer = new Scanner(System.in);
                realVal = answer.nextInt();
            }
            System.out.println("YOU WIN" + username + "PogChamp PogChamp!!!!!!");
        } else {
            if(TheChoice.equals("The computer will guess your number")) {
                int compGuess = 50;
                int changer = 0;
                int lowerBoundary = 0;
                int upperBoundary = 100;
                System.out.println("Is your number " + compGuess);
                Scanner verifier = new Scanner(System.in);
                String verifiedResult = verifier.nextLine();
                while (!(verifiedResult.equals("correct"))) {
                    if (verifiedResult.equals("higher")) {
                        lowerBoundary = compGuess;
                        changer = (upperBoundary - lowerBoundary) / 2;
                        compGuess = lowerBoundary + changer;
                        System.out.println("Is your number " + compGuess);
                        verifier = new Scanner(System.in);
                        verifiedResult = verifier.nextLine();
                    }
                    if (verifiedResult.equals("lower")) {
                        upperBoundary = compGuess;
                        changer = (upperBoundary - lowerBoundary) / 2;
                        compGuess = upperBoundary - changer;
                        System.out.println("Is your number " + compGuess);
                        verifier = new Scanner(System.in);
                        verifiedResult = verifier.nextLine();
                    }
                }
                System.out.println("YAY I WON. I ROCK AND YOU SOCCC," + username);
            }
    }
        }
    }
