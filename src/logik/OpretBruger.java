package logik;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class OpretBruger {

	public OpretBruger(Startside ss) {

		Stage myStage = new Stage();
		myStage.setTitle("Opret bruger");

		GridPane design = new GridPane();
		design.setPadding(new Insets(15));
		design.setHgap(5);
		design.setVgap(5);
		design.setAlignment(Pos.CENTER);

		Scene myScene = new Scene(design, 300, 400);

		final Label overskrift = new Label("Opret bruger");
		overskrift.setFont(new Font("Arial", 16));
		design.add(overskrift, 1, 0);

		Label fornavn = new Label("Fornavn:");
		design.add(fornavn, 0, 2);

		TextField userTextField1 = new TextField();
		design.add(userTextField1, 1, 2);

		Label efternavn = new Label("Efternavn");
		design.add(efternavn, 0, 3);

		TextField userTextField2 = new TextField();
		design.add(userTextField2, 1, 3);

		Label cpr = new Label("CPR. nr.");
		design.add(cpr, 0, 4);

		TextField userTextField0 = new TextField();
		design.add(userTextField0, 1, 4);

		Label adresse = new Label("Adresse");
		design.add(adresse, 0, 5);

		TextField userTextField3 = new TextField();
		design.add(userTextField3, 1, 5);

		Label postnummer = new Label("Postnr");
		design.add(postnummer, 0, 6);

		TextField userTextField4 = new TextField();
		design.add(userTextField4, 1, 6);

		Label email = new Label("E-mail");
		design.add(email, 0, 7);

		TextField userTextField5 = new TextField();
		design.add(userTextField5, 1, 7);

		Label loginoplysninger = new Label("Loginoplysninger");
		design.add(loginoplysninger, 0, 9);

		Label tlfnr = new Label("Tlf. nr.");
		design.add(tlfnr, 0, 10);

		TextField userTextField6 = new TextField();
		design.add(userTextField6, 1, 10);

		Label kodeord = new Label("Kodeord");
		design.add(kodeord, 0, 11);

		TextField userTextField7 = new TextField();
		design.add(userTextField7, 1, 11);

		Button btn6 = new Button("Opret bruger");
		design.add(btn6, 0, 13);

		myStage.setScene(myScene);
		myStage.show();
	}

};
