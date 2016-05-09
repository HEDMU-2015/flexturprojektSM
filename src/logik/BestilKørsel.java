package logik;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BestilKørsel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Midttrafik Flextur");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Bestil kørsel");
        scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL, 16));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label frakom = new Label("Afgang fra:");
        grid.add(frakom, 0, 1);

        final ComboBox frakombar = new ComboBox();
        frakombar.getItems().addAll(
            "Herning",
            "Aarhus",
            "Esbjerg"
        );
        grid.add(frakombar, 1, 1);

        Label tilkom = new Label("Ankomst til:");
        grid.add(tilkom, 0, 2);

        final ComboBox tilkombar = new ComboBox();
        tilkombar.getItems().addAll(
            "Herning",
            "Aarhus",
            "Esbjerg"
        );
        grid.add(tilkombar, 1, 2);

        Button logknap = new Button("Log ind");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(logknap);
        grid.add(hbBtn, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        logknap.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}