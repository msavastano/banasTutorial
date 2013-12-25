/**
 * Created with IntelliJ IDEA.
 * User: michael
 * Date: 12/24/13
 * Time: 1:53 PM
 * To change this template use File | Settings | File Templates.
 */
/**
 * Created with IntelliJ IDEA.
 * User: michael
 * Date: 12/24/13
 * Time: 9:31 AM
 * To change this template use File | Settings | File Templates.
 *
 * MonsterTwo
 */

import java.util.Arrays;
//import org.apache.commons.lang3.ArrayUtils;

public class MonsterTwo {

    static char[][] battleBoard   = new char[10][10];

    public static void buildBattleBoard(){
         for(char[] row : battleBoard){
             Arrays.fill(row, '*');
         }
    }

    public static void reDrawBoard(){
        int k = 1;
        while(k<=30){System.out.print('-');k++;}
        System.out.println();

        for(int i = 0; i<battleBoard.length;i++){
            for(int j = 0;j<battleBoard[i].length;j++){
                System.out.print("|"+battleBoard[i][j]+"|");
            }
            System.out.println();
        }
        k = 1;
        while(k<=30){System.out.print('-');k++;}
        System.out.println();
    }


    public final String TOMBSTONE = "Herr lies a dead Monster";

    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    public int xposition = 0;
    public int yposition = 0;
    public char nameChar1 = 'B';
    public static int numOfMonsters = 0;
    private boolean alive = true;

    public String name = "Big";

    /**
     * Returns attack field
     * @return property for attack int
     */
    public int getAttack(){
        return attack;
    }

    /**
     * Returns movement field
     * @return property for movement int
     */
    public int getMovement(){
        return movement;
    }

    public int getHealth(){
        return health;
    }

    public boolean getAlive(){
        return alive;
    }

    public void setHealth(int decreaseHealth){
        health = health - decreaseHealth;
        if (health < 0){
            alive = false;
        }
    }

    /**
     * health field minus param
     * @param decreaseHealth double
     */

    public void setHealth(double decreaseHealth){
        int intDecreaseHealth = (int)decreaseHealth;
        health = health - intDecreaseHealth;
        if (health < 0){
            alive = false;
        }
    }

    public MonsterTwo(int newHealth, int newAttack, int newMovement, String name){
        this.health = newHealth;
        this.attack = newAttack;
        this.movement = newMovement;
        this.name = name;
        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoardSpace = battleBoard[0].length - 1;

        int randNumX, randNumY;

        do {
        randNumX = (int) (Math.random() * maxXBoardSpace);
        randNumY = (int) (Math.random() * maxYBoardSpace);
        } while(battleBoard[randNumX][randNumY] != '*');

        this.xposition = randNumX;
        this.yposition = randNumY;

        this.nameChar1 = this.name.charAt(0);

        battleBoard[this.yposition][this.xposition]  = this.nameChar1;

        numOfMonsters++;



    }

    public MonsterTwo(){
        numOfMonsters++;
    }

    public MonsterTwo(int newHealth){
        health = newHealth;
    }

    public MonsterTwo(int newHealth, int newAttack){
        this(newHealth);
        attack = newAttack;

    }


}

