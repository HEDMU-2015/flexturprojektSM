package logik;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Menu {

	public Menu(Login lg) {

		Stage myStage = new Stage();
		myStage.setTitle("Opret bruger");

		GridPane design = new GridPane();
		design.setPadding(new Insets(15));
		design.setHgap(5);
		design.setVgap(5);
		design.setAlignment(Pos.CENTER);

		Scene myScene = new Scene(design, 300, 200);

		final Label overskrift = new Label("Midttrafik Flextur");
		overskrift.setFont(new Font("Arial", 16));
		design.add(overskrift, 1, 0);

		Button btn = new Button("Bestil kørsel");
		design.add(btn, 1, 1);
		btn.setOnAction(e -> new BestilKørsel(null));

		Button btn1 = new Button("Se brugerhistorik");
		design.add(btn1, 1, 2);
		btn1.setOnAction(e -> new SeBrugerhistorik(null));

		myStage.setScene(myScene);
		myStage.show();
	}

};