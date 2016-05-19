package præsentation;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SeBrugerhistorik {

	public TableView<Person> table = new TableView<Person>();
	public final ObservableList<Person> data = FXCollections
			.observableArrayList(new Person("", "", ""));
	final HBox hb = new HBox();

	public SeBrugerhistorik(Menu sn) {
		Stage stage = new Stage();

		Scene scene = new Scene(new Group());
		stage.setTitle("Se brugerhistorik");
		stage.setWidth(600);
		stage.setHeight(550);

		final Label label = new Label("Brugerhistorik");
		label.setFont(new Font("Arial", 20));

		table.setEditable(true);

		TableColumn dato = new TableColumn("Dato");
		dato.setMinWidth(50);
		dato.setCellValueFactory(new PropertyValueFactory<Person, String>("dato"));

		TableColumn tid = new TableColumn("Tid");
		tid.setMinWidth(50);
		tid.setCellValueFactory(new PropertyValueFactory<Person, String>("tid"));
		
		TableColumn navn = new TableColumn("Navn");
		navn.setMinWidth(50);
		navn.setCellValueFactory(new PropertyValueFactory<Person, String>("navn"));
		
		TableColumn adresse = new TableColumn("Adresse");
		adresse.setMinWidth(50);
		adresse.setCellValueFactory(new PropertyValueFactory<Person, String>("adresse"));
		
		TableColumn by = new TableColumn("By");
		by.setMinWidth(50);
		by.setCellValueFactory(new PropertyValueFactory<Person, String>("by"));
		
		TableColumn afgangfra = new TableColumn("Afgang fra");
		afgangfra.setMinWidth(50);
		afgangfra.setCellValueFactory(new PropertyValueFactory<Person, String>("afgangfra"));
		
		TableColumn ankomsttil = new TableColumn("Ankomst til");
		ankomsttil.setMinWidth(50);
		ankomsttil.setCellValueFactory(new PropertyValueFactory<Person, String>("ankomsttil"));
		
		TableColumn adresse2 = new TableColumn("Adresse");
		adresse2.setMinWidth(50);
		adresse2.setCellValueFactory(new PropertyValueFactory<Person, String>("adresse2"));
		
		TableColumn hjælpemidler = new TableColumn("Hjælpemidler");
		adresse2.setMinWidth(50);
		adresse2.setCellValueFactory(new PropertyValueFactory<Person, String>("hjælpemidler"));

		table.setItems(data);
		table.getColumns().addAll(dato, tid, navn, adresse, by, afgangfra, ankomsttil, adresse2, hjælpemidler);

		hb.setSpacing(3);

		final VBox vbox = new VBox();
		vbox.setSpacing(5);
		vbox.setPadding(new Insets(10, 0, 0, 10));
		vbox.getChildren().addAll(label, table, hb);

		((Group) scene.getRoot()).getChildren().addAll(vbox);

		stage.setScene(scene);
		stage.show();
	}

	public static class Person {

		private final SimpleStringProperty dato;
		private final SimpleStringProperty tid;

		Person(String fName, String daTo, String tId) {

			this.dato = new SimpleStringProperty(daTo);
			this.tid = new SimpleStringProperty(tId);
		}

		public String getLastName() {
			return dato.get();
		}

		public void setLastName(String fName) {
			dato.set(fName);
		}

		public String getEmail() {
			return tid.get();
		}

		public void setEmail(String fName) {
			tid.set(fName);
		}

	}
}