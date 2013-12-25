/**
 * Created with IntelliJ IDEA.
 * User: michael
 * Date: 12/24/13
 * Time: 2:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Game {

    public static void main(String[] args){
        MonsterTwo.buildBattleBoard();

        char[][] tempBattleBoard = new char[10][10];

        MonsterTwo[] Monsters = new MonsterTwo[4];

        Monsters[0] = new MonsterTwo(1000, 20, 1, "Frank");
        Monsters[1] = new MonsterTwo(500, 40, 1, "Drac");
        Monsters[2] = new MonsterTwo(1000, 20, 2, "Bill");
        Monsters[3] = new MonsterTwo(1000, 20, 1, "Jack");

        MonsterTwo.reDrawBoard();
    }
}
