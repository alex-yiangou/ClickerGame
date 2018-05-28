package clickergame.components.tabs;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.Tab;

public class StatsTab extends Tab {

    public StatsTab() {
        renderStatsTab();
    }

    public Tab renderStatsTab() {
        this.setId("stats-tab");
        this.setText("Stats");
        this.setClosable(false);
        return this;
    }
}