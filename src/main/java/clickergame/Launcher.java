package clickergame;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import clickergame.containers.launcher.LauncherContainer;

public class Launcher extends Application {

    public LauncherContainer container;

    public String getGreeting() {
        return "Hello world.";
    }

    // TODO Initialise all the components and containers that are used in the launcher here
    @Override
    public void init() {
        System.out.println("Launcher.init()");
        container = new LauncherContainer();
    }

    // TODO Add all the components and containers into the Launcher stage
    @Override
    public void start(Stage stage) {
        System.out.println("Launcher.start()");
        Scene scene = new Scene(container, 1000, 400);
        stage.setTitle("Clicker Game");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        System.out.println("Launcher.stop()");
        System.out.println("Application Terminated!");
        System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println("Application Started!");
        System.out.println(new Launcher().getGreeting());
        launch(args);
    }
}