package clickergame.containers.topmenutabs;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import clickergame.components.tabs.HeroesTab;
import clickergame.components.tabs.UpgradesTab;
import clickergame.components.tabs.AchievementsTab;
import clickergame.components.tabs.StatsTab;

public class TopMenuTabsContainer extends TabPane implements EventHandler<Event> {

    public TopMenuTabsContainer() {
        renderTopMenuTabsContainer();
    }

    public TabPane renderTopMenuTabsContainer() {
        Tab heroesTab = new HeroesTab();
        heroesTab.setOnSelectionChanged(this::handle);
        Tab upgradesTab = new UpgradesTab();
        upgradesTab.setOnSelectionChanged(this::handle);
        Tab achievementsTab = new AchievementsTab();
        achievementsTab.setOnSelectionChanged(this::handle);
        Tab statsTab = new StatsTab();
        statsTab.setOnSelectionChanged(this::handle);
        this.getTabs().addAll(heroesTab, upgradesTab, achievementsTab, statsTab);
        return this;
    }

    public void handle(Event event) {
        String tabId = this.getSelectionModel().getSelectedItem().getId();

        switch (tabId) {
            case "heroes-tab":
                System.out.println("Heroes Tab selected");
                break;
            case "upgrades-tab":
                System.out.println("Upgrades Tab selected");
                break;
            case "achievements-tab":
                System.out.println("Achievements Tab selected");
                break;
            case "stats-tab":
                System.out.println("Stats Tab selected");
                break;            
            default:
                System.out.println("None Tab is selected");
                break;
        }
    }
}