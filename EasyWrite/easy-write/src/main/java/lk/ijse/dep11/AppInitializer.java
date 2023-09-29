package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/MainForm.fxml"));
        Scene mainScene = new Scene(root);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("EasyWrite Text Editor");

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        root.setBackground(Background.fill(Color.TRANSPARENT));
        mainScene.setFill(Color.TRANSPARENT);
        //Thread.sleep(50);
        primaryStage.centerOnScreen();
        primaryStage.show();

        FadeTransition fade1 = new FadeTransition(Duration.millis(200),root);
        fade1.setFromValue(0);
        fade1.setToValue(1);
        fade1.playFromStart();

        FadeTransition fade2 = new FadeTransition(Duration.millis(5000),root);
        fade2.setFromValue(1);
        fade2.setToValue(0);
        fade2.playFromStart();

        //primaryStage.close();
    }
}
