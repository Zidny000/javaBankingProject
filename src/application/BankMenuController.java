package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class BankMenuController {
	public void addUser(ActionEvent e) {
		try {
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("BankAddSavings.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public void withdrawOrDeposit() {
		try {
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("BankWithdraw.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}
