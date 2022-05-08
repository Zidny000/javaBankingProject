package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class BankMenuController {
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
	public void userCustomer(ActionEvent e) {
		try {
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("BankCustomerMenu.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
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
	
	public void transfer() {
		try {
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("BankTransfer.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	public void getTransactions() {
		try {
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("BankTransactions.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	public void getBalance() {
		try {
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("BankBalance.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	public void getAccount() {
		try {
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("BankAccount.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public void accounts() {
		try {
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("BankAccounts.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	
	//Customer
	
	public void customerFindAccount() {
		try {
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("BankCAccount.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public void customerFindAccounts() {
		try {
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("BankCAccounts.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public void customerGetTransactions() {
		try {
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("BankCTransactions.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	
	
	
	
}
