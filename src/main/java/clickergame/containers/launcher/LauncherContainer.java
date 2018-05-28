package clickergame.containers.launcher;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.scene.layout.BorderPane;
import clickergame.containers.heroeslist.HeroesListContainer;
import clickergame.containers.topmenutabs.TopMenuTabsContainer;

public class LauncherContainer extends BorderPane {

    public LauncherContainer() {
        renderLauncherContainer();
    }

    public BorderPane renderLauncherContainer() {
        this.setTop(new TopMenuTabsContainer());
        //TODO With each selected top menu tab, show according list
        this.setLeft(new HeroesListContainer());
        return this;
    }
}