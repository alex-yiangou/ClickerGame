package clickergame;

/*
 * @author      Alexandros Yiangou (28/05/18)
 * @version     v0.0.0
 */

import javafx.application.Application;
import javafx.stage.Stage;

public class Launcher extends Application {
    public String getGreeting() {
        return "Hello world.";
    }

    @Override
    public void init() {
        System.out.println("Launcher.init()");
        // TODO Initialise all the components and containers that are used in the launcher here
    }

    @Override
    public void start(Stage stage) {
        System.out.println("Launcher.start()");
        // TODO Add all the components and containers into the Launcher stage
        stage.show();
    }

    @Override
    public void stop() {
        System.out.println("Launcher.stop()");
        System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println(new Launcher().getGreeting());
        launch(args);
    }
}
