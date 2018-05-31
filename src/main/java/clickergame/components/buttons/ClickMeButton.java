package clickergame.components.buttons;

/*
 * @author      Alexandros Yiangou (31/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.Button;

public class ClickMeButton extends Button {
    public ClickMeButton() {
        renderClickMeButton();
    }

    public Button renderClickMeButton() {
        this.setText("Click Me");
        // TODO Functionality missing
        this.setOnAction((event) -> System.exit(0));
        return this;
    }
}