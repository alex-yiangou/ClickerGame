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
import clickergame.components.buttons.ClickMeButton;

public class CenterPlayAreaContainer extends GridPane {

    public static MonsterHealthLabel monsterHealthLabel = new MonsterHealthLabel();
    ClickMeButton clickMeButton = new ClickMeButton();

    public CenterPlayAreaContainer() {
        renderCenterPlayAreaContainer();
    }

    public GridPane renderCenterPlayAreaContainer() {
        this.add(new MonsterNameLabel(), 0, 0);
        this.add(monsterHealthLabel, 0, 1);
        this.add(clickMeButton, 0, 2);
        this.add(new ExitButton(), 1, 2);
        this.setAlignment(Pos.CENTER);
        return this;
    }

    public ClickMeButton getClickMeButton() {
        return clickMeButton;
    }

    public static MonsterHealthLabel getMonsterHealthLabel() {
        return monsterHealthLabel;
    }
}