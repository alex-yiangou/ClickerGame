package clickergame.components.tabs;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.Tab;

public class HeroesTab extends Tab {

    public HeroesTab() {
        renderHeroesTab();
    }

    public Tab renderHeroesTab() {
        this.setId("heroes-tab");
        this.setText("Heroes");
        this.setClosable(false);
        return this;
    }
}