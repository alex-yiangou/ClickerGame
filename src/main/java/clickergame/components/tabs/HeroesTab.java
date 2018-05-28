package clickergame.components.tabs;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.Tab;
import clickergame.enums.TopMenuTabsEnum;

public class HeroesTab extends Tab {

    public HeroesTab() {
        renderHeroesTab();
    }

    public Tab renderHeroesTab() {
        this.setId(TopMenuTabsEnum.HEROES.getTabId());
        this.setText(TopMenuTabsEnum.HEROES.getTabLabel());
        this.setClosable(false);
        return this;
    }
}