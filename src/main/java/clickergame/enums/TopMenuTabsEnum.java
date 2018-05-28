package clickergame.enums;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

public enum TopMenuTabsEnum {
    /**
     * tab_key (
     *  tab_id
     *  tab_label
     * )
     **/ 
    HEROES("heroes-tab", "Heroes"),
    ACHIEVEMENTS("achievements-tab", "Achievements"),
    STATS("stats-tab", "Stats"),
    UPGRADES("upgrades-tab", "Upgrades");

    public String tabId, tabLabel;

    TopMenuTabsEnum(String id, String label) {
        tabId = id;
        tabLabel = label;
    }

    public String getTabId() {
        return tabId;
    }

    public String getTabLabel() {
        return tabLabel;
    }
}