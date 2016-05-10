package logik;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Startside extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Midttrafik Flextur");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Button logknap = new Button("Log ind");
		grid.add(logknap, 1, 2);
		logknap.setOnAction(e -> new Login(null));

		Button opret = new Button("Opret bruger");
		grid.add(opret, 1, 3);
		opret.setOnAction(e -> new OpretBruger(null));

		final Text actiontarget = new Text();
		grid.add(actiontarget, 1, 6);

		Scene scene = new Scene(grid, 270, 130);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}