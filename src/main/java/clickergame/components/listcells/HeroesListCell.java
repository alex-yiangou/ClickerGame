package clickergame.components.listcells;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.ListCell;
import clickergame.models.Hero;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;

public class HeroesListCell extends ListCell<Hero> {

    BorderPane cellLayout;
    Label heroIdLabel, heroNameLabel, heroDamageLabel;

    public HeroesListCell() {
        cellLayout = new BorderPane();
        heroIdLabel = new Label();
        heroNameLabel = new Label();
        heroDamageLabel = new Label();
        cellLayout.setLeft(heroIdLabel);
        cellLayout.setCenter(heroNameLabel);
        cellLayout.setRight(heroDamageLabel);
    }

    public Node getListCell() {
        return cellLayout;
    }

    public void updateCell(Hero hero) {
        heroIdLabel.setText(hero.gerHeroId());
        heroNameLabel.setText(hero.getHeroName());
        heroDamageLabel.setText(" " + hero.getHeroInitDamage());
    }

    @Override
    protected void updateItem(Hero item, boolean empty) {
        super.updateItem(item, empty);
        if (empty) {
            setGraphic(null);
        } else {
            this.updateCell(item);
            setGraphic(getListCell());
        }
    } 
}