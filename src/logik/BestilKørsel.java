package logik;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
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

        Text scenetitle = new Text("Midttrafik Flextur - Bestil kørsel");
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
        grid.add(tilkom, 2, 1);

        final ComboBox tilkombar = new ComboBox();
        tilkombar.getItems().addAll(
            "Herning",
            "Aarhus",
            "Esbjerg"
        );
        grid.add(tilkombar, 3, 1);
        
        Label adresse = new Label("Adresse:");
		grid.add(adresse, 0, 2);

		TextField userTextField1 = new TextField();
		grid.add(userTextField1, 1, 2);
		
		Label adresse1 = new Label("Adresse:");
		grid.add(adresse1, 2, 2);

		TextField userTextField2 = new TextField();
		grid.add(userTextField2, 3, 2);
		
		Label dato = new Label("Dato:");
		grid.add(dato, 0, 3);

		DatePicker kalendervalg = new DatePicker();
		grid.add(kalendervalg, 1, 3);
		
		ToggleGroup group = new ToggleGroup();
		RadioButton rb1 = new RadioButton("Afgangstid");
		grid.add(rb1, 2, 3);
		rb1.setToggleGroup(group);
	    rb1.setSelected(true);
	    
	    final ComboBox tidankomst = new ComboBox();
        tidankomst.getItems().addAll(
            "00:00",
            "01:00",
            "02:00",
            "03:00",
            "04:00",
            "05:00",
            "06:00"
        );
        grid.add(tidankomst, 3, 3);
	    
		RadioButton rb2 = new RadioButton("Ankomsttid");
		rb2.setToggleGroup(group);
		grid.add(rb2, 2, 4);
		
		final ComboBox tidafgang = new ComboBox();
        tidafgang.getItems().addAll(
        		"00:00",
                "01:00",
                "02:00",
                "03:00",
                "04:00",
                "05:00",
                "06:00"
        );
        grid.add(tidafgang, 3, 4);
		
		Label hjælp = new Label("Hjælpemidler:");
		grid.add(hjælp, 1, 4);

		TextField userTextField6 = new TextField();
		grid.add(userTextField6, 1, 5);

        Button logknap = new Button("Se pris");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(logknap);
        grid.add(hbBtn, 0, 6);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        logknap.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Vent et øjeblik...");
            }
        });

        Scene scene = new Scene(grid, 550, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}