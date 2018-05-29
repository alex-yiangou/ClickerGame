package clickergame.models;

/*
 * @author      Alexandros Yiangou (29/05/18)
 * @version     v0.0.0
 */

public class Hero {
    public String heroId, heroName;
    public double heroInitDamage;

    public Hero(String id, String name, double initDmg) {
        heroId = id;
        heroName = name;
        heroInitDamage = initDmg;
    }

    public String gerHeroId() {
        return heroId;
    }

    public String getHeroName() {
        return heroName;
    }

    public double getHeroInitDamage() {
        return heroInitDamage;
    }
}