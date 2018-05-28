package clickergame.components.tabs;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.Tab;

public class AchievementsTab extends Tab {

    public AchievementsTab() {
        renderAchievementsTab();
    }

    public Tab renderAchievementsTab() {
        this.setId("achievements-tab");
        this.setText("Achievements");
        this.setClosable(false);
        return this;
    }
}