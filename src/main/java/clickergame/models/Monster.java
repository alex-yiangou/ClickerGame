package clickergame.models;

/*
 * @author      Alexandros Yiangou (31/05/18)
 * @version     v0.0.0
 */

public class Monster {
    String monsterName;
    double monsterHealth;

    // TODO Hardcoded constructor. This needs to become dynamic later on.
    public Monster() {
        monsterName = "Monster Name";
        monsterHealth = 50;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public double getMonsterHealth() {
        return monsterHealth;
    }
}