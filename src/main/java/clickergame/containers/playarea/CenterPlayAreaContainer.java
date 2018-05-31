package clickergame.containers.playarea;

/*
 * @author      Alexandros Yiangou (30/05/18)
 * @version     v0.0.0
 */

import clickergame.components.buttons.ExitButton;
import clickergame.components.labels.MonsterHealthLabel;
import clickergame.components.labels.MonsterNameLabel;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class CenterPlayAreaContainer extends GridPane {
    public CenterPlayAreaContainer() {
        renderCenterPlayAreaContainer();
    }

    public GridPane renderCenterPlayAreaContainer() {
        //TODO Render monster health label
        this.add(new MonsterNameLabel(), 0, 0);
        this.add(new MonsterHealthLabel(), 0, 1);
        this.add(new ExitButton(), 0, 2);
        this.setAlignment(Pos.CENTER);
        return this;
    }
}