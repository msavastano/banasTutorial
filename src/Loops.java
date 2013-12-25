import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: michael
 * Date: 12/23/13
 * Time: 11:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Loops {

    public static void main(String[] args)
    {
        int i = 0;
        while(i <= 20){
            if(i==3){
                i+=2;
                continue;
            }

            System.out.println(i);
            i++;

            if(i%2==0){
                i++;
            }



            double myPi = 4.0;

            double j = 3.0;

            while(j < 11){
                myPi = myPi - (4/j) + (4/(j+2))  ;
                j+=4;

                System.out.println(myPi);
                System.out.println(Math.PI);
            }
        }
    }

}
