/**
 * Created with IntelliJ IDEA.
 * User: michael
 * Date: 12/24/13
 * Time: 12:00 AM
 * To change this template use File | Settings | File Templates.
 */

import java.util.Scanner;
public class MethodsAndFields {
    static double myPi = 3.14159;

    static Scanner userInput = new Scanner(System.in);
    static int randomNumber;

    public static void main(String[] args){
        System.out.println(addThem(1, 2));
        int d = 5;
        tryToChange(d);
        System.out.println("main change "+d);
        System.out.println(getRandomNum());
        int guessResult = 1;
        int randomGuess = 0;

        while(guessResult!=-1){
            System.out.print("Guess a number 1 - 10 ") ;

            randomGuess = userInput.nextInt();

            guessResult = checkGuess(randomGuess);
        }

        System.out.println("You got " + randomGuess);

    }

    public static int addThem(int a, int b){
        double smallPi = 3.140 ;
        return a+b;
    }

    /**
     * Simple method to add 1 to to a variable
     * @param d  int to add number to
     */
    public static void tryToChange  (int d)  {
        d = d + 1;
        System.out.println("try to change " + d);
    }

    public static int getRandomNum(){
        randomNumber = (int) (Math.random() * 10);
        return randomNumber;
    }

    public static int checkGuess(int guess){
        if(guess == randomNumber){
            return  -1;
        }   else {
            return 1;
        }
    }



}
