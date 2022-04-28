package application;
	
import banking.Bank;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	public static Bank bank = new Bank("Estern");
	public static Stage primaryStage = null;
	@Override
	public void start(Stage stage) {
		try {
			primaryStage = stage;
			AnchorPane root = FXMLLoader.load(getClass().getResource("BankingUser.fxml"));
			Scene scene = new Scene(root,600,600);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
