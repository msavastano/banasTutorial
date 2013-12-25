/**
 * Created with IntelliJ IDEA.
 * User: michael
 * Date: 12/23/13
 * Time: 11:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Conditionals {

    /* Relational Operators:
		 * Java has 6 relational operators
		 * > : Greater Than
		 * < : Less Than
		 * == : Equal To
		 * != : Not Equal To
		 * >= : Greater Than Or Equal To
		 * <= : Less Than Or Equal To
		 */

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 50);

        if( randomNumber < 25){

            System.out.println("less than 25") ;

        }
        System.out.println(randomNumber) ;

        int valueOne = 1;
        int valueTwo = 2;
        int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;

        System.out.println(biggestValue + " is the biggest\n");

        char theGrade = 'B';
        switch(theGrade)
        {
            case 'A':
                System.out.println("Great");
                break;
            case 'B':
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Not");
                break;
            default:
                System.out.println("Fail");
                break;
        }
    }




}
