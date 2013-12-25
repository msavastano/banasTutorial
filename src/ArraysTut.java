/**
 * Created with IntelliJ IDEA.
 * User: michael
 * Date: 12/24/13
 * Time: 9:12 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.ArrayList;
import java.util.Arrays;
public class ArraysTut {
    public static void main(String[] args){

        int[] randomArray;

        int[] numberArray = new int[10];

        randomArray = new int[20];

        randomArray[1] = 2;

        String[] stringArray = {"hj", "ll"};

        for(int i = 0; i < numberArray.length; i++){
            numberArray[i] = i;
        }

        int k = 1;
        while (k<=41){System.out.print('-'); k++; }
        System.out.println();

        for(int j = 0 ; j<numberArray.length; j++){
             System.out.print("| " + j + " ");
        }

        System.out.println("|");

        String[][] multiArray = new String[10][10];

        for(int i = 0; i<multiArray.length; i++) {
            for(int j =0 ;j<multiArray[i].length;j++) {
                multiArray[i][j] = i + " " + j;
            }
        }

        k = 1;
        while (k<=41){System.out.print('-'); k++; }
        System.out.println();

        for(int i = 0; i<multiArray.length; i++) {
            for(int j =0 ;j<multiArray[i].length;j++) {
               System.out.print("| " + multiArray[i][j] + " ");
            }
            System.out.println();
        }

        for(int row : numberArray){
            System.out.print(row);
        }
        System.out.print("\n");

        for(String[] rows : multiArray){
            for(String column : rows){
                System.out.print("| " + column + " ");
            }
            System.out.println();
        }

        int[] numberCopy = Arrays.copyOf(numberArray, 5);
        for(int row : numberCopy){

                System.out.print(row);

            System.out.println();
        }

        System.out.println(Arrays.toString(numberCopy));

        int[] moreNumbers = new int[100];

        Arrays.fill(moreNumbers,2);

        int[] numsToSort = new int[10];

        for(int i =0 ; i < 10 ; i++){
            numsToSort[i] = (int)(Math.random()*100);
        }

        System.out.println(Arrays.toString(numsToSort));

        int whereIsFifty  = Arrays.binarySearch(numsToSort,54);

        System.out.println(whereIsFifty);

        ArrayList h = new ArrayList();



    }
}
