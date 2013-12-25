import java.util.Scanner;

public class ScannerLesson {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Your fav num ");

        if(userInput.hasNextInt()){
            int numEntered = userInput.nextInt();

            System.out.println("YOu entered " + numEntered);

            int numEnteredTimes2 = numEntered + numEntered;

            System.out.println("numentered is " + numEnteredTimes2);

            System.out.println(numEntered+=2);

            System.out.println(Math.abs(numEntered));

        }   else {

            System.out.println("YOu entered wrong" );
        }



    }

}