package clickergame.components.labels;

/*
 * @author      Alexandros Yiangou (30/05/18)
 * @version     v0.0.0
 */

import clickergame.models.Monster;
import javafx.scene.control.Label;

public class MonsterHealthLabel extends Label {

    public MonsterHealthLabel() {
        renderMonsterHealthLabel();
    }

    public Label renderMonsterHealthLabel() {
        this.setText(String.valueOf(new Monster().getMonsterHealth()));
        return this;
    }
}