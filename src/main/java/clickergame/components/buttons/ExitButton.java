package clickergame.components.buttons;

/*
 * @author      Alexandros Yiangou (30/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.Button;

public class ExitButton extends Button {
    public ExitButton() {
        renderExitButton();
    }

    public Button renderExitButton() {
        this.setText("Exit");
        this.setOnAction((event) -> System.exit(0));
        return this;
    }
}