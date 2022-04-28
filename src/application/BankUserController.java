package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class BankUserController {
	public void userEmployee(ActionEvent e) {
		try {
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("BankMenu.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}
