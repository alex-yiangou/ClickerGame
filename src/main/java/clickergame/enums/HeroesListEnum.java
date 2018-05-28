package clickergame.enums;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

//TODO This class can also be implemented as a db table, but might be more efficient for initial data to be hardcoded inside enums
public enum HeroesListEnum {
    /**
     * hero_key (
     *  hero_id,
     *  hero_name,
     *  hero_lore,
     *  hero_initial_damage,
     * )
     */
    HERO1("hero-1", "Hero1", "...", 1),
    HERO2("hero-2", "Hero2", "...", 2),
    HERO3("hero-3", "Hero3", "...", 3),
    HERO4("hero-4", "Hero4", "...", 4),
    HERO5("hero-5", "Hero5", "...", 5);

    public String heroId, heroName, heroLore;
    public double heroInitDmg, heroDamage;

    HeroesListEnum(String id, String name, String lore, double initDmg) {
        heroId = id;
        heroName = name;
        heroLore = lore;
        heroInitDmg = initDmg;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getHeroLore() {
        return heroLore;
    }

    public double getHeroInitialDamage() {
        return heroInitDmg;
    }

    public double getHeroDamageFormula(String id, double currentDmg) {
        switch (id) {
            case "hero-1": {
                heroDamage = currentDmg + 1;
                break;
            }
            case "hero-2": {
                heroDamage = currentDmg + 2;
                break;
            }
            case "hero-3": {
                heroDamage = currentDmg + 3;
                break;
            }
            case "hero-4": {
                heroDamage = currentDmg + 4;
                break;
            }
            case "hero-5": {
                heroDamage = currentDmg + 5;
                break;
            }
            default: {
                System.out.println("No hero selected");
            }
        }
        return heroDamage;
    }
}