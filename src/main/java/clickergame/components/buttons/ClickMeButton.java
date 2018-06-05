package clickergame.components.buttons;

/*
 * @author      Alexandros Yiangou (31/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.Button;
import clickergame.containers.playarea.CenterPlayAreaContainer;
import clickergame.models.Monster;
import javafx.event.Event;
import javafx.event.EventHandler;

public class ClickMeButton extends Button implements EventHandler<Event> {

    Monster monster = new Monster();
    double initialHp = monster.getMonsterHealth();

    public ClickMeButton() {
        renderClickMeButton();
    }

    public Button renderClickMeButton() {
        this.setId("click-me-btn");
        this.setText("Click Me");
        return this;
    }

    public void handle(Event event) {   
        CenterPlayAreaContainer.getMonsterHealthLabel().setText(String.valueOf(initialHp--));
    }
}