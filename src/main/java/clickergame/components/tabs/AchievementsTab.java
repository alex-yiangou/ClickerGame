package clickergame.components.tabs;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.Tab;
import clickergame.enums.TopMenuTabsEnum;

public class AchievementsTab extends Tab {

    public AchievementsTab() {
        renderAchievementsTab();
    }

    public Tab renderAchievementsTab() {
        this.setId(TopMenuTabsEnum.ACHIEVEMENTS.getTabId());
        this.setText(TopMenuTabsEnum.ACHIEVEMENTS.getTabLabel());
        this.setClosable(false);
        return this;
    }
}