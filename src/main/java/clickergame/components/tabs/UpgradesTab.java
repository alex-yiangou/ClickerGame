package clickergame.components.tabs;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.Tab;
import clickergame.enums.TopMenuTabsEnum;

public class UpgradesTab extends Tab {

    public UpgradesTab() {
        renderUpgradesTab();
    }

    public Tab renderUpgradesTab() {
        this.setId(TopMenuTabsEnum.UPGRADES.getTabId());
        this.setText(TopMenuTabsEnum.UPGRADES.getTabLabel());
        this.setClosable(false);
        return this;
    }
}