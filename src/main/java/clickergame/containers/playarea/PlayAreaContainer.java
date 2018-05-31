package clickergame.containers.playarea;

/*
 * @author      Alexandros Yiangou (30/05/18)
 * @version     v0.0.0
 */

import javafx.scene.layout.BorderPane;

public class PlayAreaContainer extends BorderPane {
    public PlayAreaContainer() {
        renderPlayAreaContainer();
    }

    private BorderPane renderPlayAreaContainer() {
        //TODO Create a GridPane to hold the 3 following components
        this.setCenter(new CenterPlayAreaContainer());
        //TODO Move the 3 following components in their own java files
        return this;
    }
}