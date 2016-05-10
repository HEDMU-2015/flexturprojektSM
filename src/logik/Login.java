package logik;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login {

	public Login(Startside ss) {
		Stage myStage = new Stage();

		myStage.setTitle("Midttrafik Flextur");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Text scenetitle = new Text("Login");
		scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL, 16));
		grid.add(scenetitle, 0, 0, 2, 1);

		Label email = new Label("E-mail:");
		grid.add(email, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);

		Label kode = new Label("Kodeord:");
		grid.add(kode, 0, 2);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);

		Button logknap = new Button("Log ind");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(logknap);
		grid.add(hbBtn, 1, 4);

		final Text actiontarget = new Text();
		grid.add(actiontarget, 1, 6);

		Scene scene = new Scene(grid, 300, 275);
		myStage.setScene(scene);
		myStage.show();
	}

}

;
