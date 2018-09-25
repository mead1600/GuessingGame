package MeadGyawu;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
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
    }
}
