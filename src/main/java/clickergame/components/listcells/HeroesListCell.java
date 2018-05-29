package clickergame.components.listcells;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.ListCell;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;

public class HeroesListCell extends ListCell<String> {

    BorderPane cellLayout;
    Label label;

    public HeroesListCell() {
        cellLayout = new BorderPane();
        label = new Label();       
        cellLayout.setCenter(label);
    }

    public Node getListCell() {
        return cellLayout;
    }

    public void updateCell(String hero) {
        label.setText(hero);
    }

    @Override
    protected void updateItem(String item, boolean empty) {
        super.updateItem(item, empty);
        if (empty) {
            setGraphic(null);
        } else {
            this.updateCell(item);
            setGraphic(getListCell());
        }
    } 
}