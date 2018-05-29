package clickergame.containers.heroeslist;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.scene.control.ListView;
import javafx.event.Event;
import javafx.event.EventHandler;
import java.util.ArrayList;

import clickergame.components.listcells.HeroesListCell;
import clickergame.enums.HeroesListEnum;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

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

        // TODO This custom cell currently holds only the hero name, needs to be customized to hold hero name and hero damage
        // TODO Later on there can be buttons implemented inside the cell, hero upgrades etc
        this.setCellFactory(listview -> new HeroesListCell());

        for (int i = 0; i < HeroesListEnum.values().length; i++) {
            System.out.println("test" + i);
            this.getItems().add(i, heroesList.get(i));
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