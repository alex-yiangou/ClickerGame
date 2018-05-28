package clickergame.components.tabs;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.Tab;

public class UpgradesTab extends Tab {

    public UpgradesTab() {
        renderUpgradesTab();
    }

    public Tab renderUpgradesTab() {
        this.setId("upgrades-tab");
        this.setText("Upgrades");
        this.setClosable(false);
        return this;
    }
}