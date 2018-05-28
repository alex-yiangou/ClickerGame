package clickergame.containers.launcher;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.scene.layout.BorderPane;
import clickergame.containers.topmenutabs.TopMenuTabsContainer;

public class LauncherContainer extends BorderPane {

    public LauncherContainer() {
        renderLauncherContainer();
    }

    public BorderPane renderLauncherContainer() {
        this.setTop(new TopMenuTabsContainer());
        return this;
    }
}