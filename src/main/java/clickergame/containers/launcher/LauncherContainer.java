package clickergame.containers.launcher;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.scene.layout.BorderPane;
import clickergame.components.buttons.ClickMeButton;
import clickergame.containers.heroeslist.HeroesListContainer;
import clickergame.containers.playarea.PlayAreaContainer;
import clickergame.containers.topmenutabs.TopMenuTabsContainer;

public class LauncherContainer extends BorderPane {

    PlayAreaContainer playAreaContainer = new PlayAreaContainer();
    ClickMeButton clickMeBtn = playAreaContainer.getCenterPlayAreaContainer().getClickMeButton();

    public LauncherContainer() {
        renderLauncherContainer();
        clickMeBtn.setOnAction(event -> clickMeBtn.handle(event));
    }

    public BorderPane renderLauncherContainer() {
        this.setTop(new TopMenuTabsContainer());
        //TODO With each selected top menu tab, show according list
        this.setLeft(new HeroesListContainer());
        this.setCenter(playAreaContainer);
        return this;
    }
}