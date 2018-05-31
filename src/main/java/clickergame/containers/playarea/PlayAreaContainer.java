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
        this.setCenter(new CenterPlayAreaContainer());
        return this;
    }
}