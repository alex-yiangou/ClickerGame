package clickergame.containers.heroeslist;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.ListView;
import javafx.event.Event;
import javafx.event.EventHandler;
import java.util.ArrayList;

import clickergame.enums.HeroesListEnum;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

//TODO Need to create a new custom cell for the list view
public class HeroesListContainer extends ListView<String> implements EventHandler<Event> {
    public HeroesListContainer() {
        renderHeroesListContainer();
    }

    public ListView<String> renderHeroesListContainer() {
        ArrayList<String> heroesList = new ArrayList<>();
        ObservableList<String> heroesData = FXCollections.observableArrayList();
        
        // TODO These data needs to be fetched from the database for each specific player.
        for (int i = 0; i < HeroesListEnum.values().length; i++) {
            heroesList.add(i, HeroesListEnum.values()[i].getHeroName());
            heroesData.add(heroesList.get(i));
        }
        //TODO Here it needs to be getting Hero objects and not String objects
        this.setItems(heroesData);
        this.setOnMouseClicked(this::handle);

        return this;
    }

    public void handle(Event event) {
        System.out.println(this.getSelectionModel().getSelectedItem() + " clicked" );
    }
}