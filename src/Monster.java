/**
 * Created with IntelliJ IDEA.
 * User: michael
 * Date: 12/24/13
 * Time: 9:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Monster {

    public final String TOMBSTONE = "Herr lies a dead Monster";

    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xposition = 0;
    private int yposition = 0;
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

    public Monster(int newHealth, int newAttack, int newMovement){
        this.health = newHealth;
        this.attack = newAttack;
        this.movement = newMovement;
    }

    public Monster(){

    }

    public Monster(int newHealth){
        health = newHealth;
    }

    public Monster(int newHealth, int newAttack){
        this(newHealth);
        attack = newAttack;

    }


}
