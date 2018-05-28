package clickergame.components.tabs;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.Tab;
import clickergame.enums.TopMenuTabsEnum;

public class StatsTab extends Tab {

    public StatsTab() {
        renderStatsTab();
    }

    public Tab renderStatsTab() {
        this.setId(TopMenuTabsEnum.STATS.getTabId());
        this.setText(TopMenuTabsEnum.STATS.getTabLabel());
        this.setClosable(false);
        return this;
    }
}