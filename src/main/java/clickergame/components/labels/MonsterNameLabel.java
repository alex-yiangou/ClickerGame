package clickergame.components.labels;

/*
 * @author      Alexandros Yiangou (30/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.Label;

public class MonsterNameLabel extends Label {

    public MonsterNameLabel() {
        renderMonsterNameLabel();
    }

    public Label renderMonsterNameLabel() {
        this.setText("MonsterName");
        return this;
    }
}