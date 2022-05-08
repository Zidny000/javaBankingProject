package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import banking.BankAccount;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class BankAccountController  implements Initializable{
	 @FXML
	 private ComboBox<String> accountCombo;
	 @FXML
	 ListView<String> accountList;
	 
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
	 
	 public void selected(ActionEvent e) {
		
		 String s = accountCombo.getSelectionModel().getSelectedItem().toString();
		 	if(s.equals("All")) {
	        	try {
	        		accountList.getItems().clear();
	    			ArrayList <BankAccount> accounts = new ArrayList<>();
	    			accounts = Main.bank.getAccounts();
	    			for(int i = 0 ; i < accounts.size() ; i++) {
	    				
	    				accountList.getItems().add(accounts.get(i).toString());
	    				
	    			}
	    			
	    		}catch(Exception e1) {
	    			e1.printStackTrace();
	    		}
	        }
	        if(s.equals("Current Account")) {
	        	try {
	    			accountList.getItems().clear();
	        		ArrayList <BankAccount> accounts = new ArrayList<>();
	    			accounts = Main.bank.getAccounts("current");
	    			for(int i = 0 ; i < accounts.size() ; i++) {
	    				
	    				
	    				accountList.getItems().add(accounts.get(i).toString());
	    				
	    				
	    			}
	    		}catch(Exception e1) {
	    			e1.printStackTrace();
	    		}
	        }
	        if(s.equals("Student Account")) {
	        	try {
	        		accountList.getItems().clear();
	        		ArrayList <BankAccount> accounts = new ArrayList<>();
	    			accounts = Main.bank.getAccounts("student");
	    			for(int i = 0 ; i < accounts.size() ; i++) {
	    				
	    				accountList.getItems().add(accounts.get(i).toString());
	    				
	    			}
	    		}catch(Exception e1) {
	    			e1.printStackTrace();
	    		}
	        }
	        if(s.equals("Savings Account")) {
	        	try {
	        		accountList.getItems().clear();
	        		ArrayList <BankAccount> accounts = new ArrayList<>();
	    			accounts = Main.bank.getAccounts("saving");
	    			for(int i = 0 ; i < accounts.size() ; i++) {
	    				
	    				accountList.getItems().add(accounts.get(i).toString());
	    				
	    			}
	    		}catch(Exception e1) {
	    			e1.printStackTrace();
	    		}
	        }
	       
	    }  
	 
	 @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 ObservableList<String> list = FXCollections.observableArrayList("All","Savings Account","Current Account","Student Account");
         accountCombo.setItems(list);
	}
	 
	 
	 
	 

	 
	 
	 
	 
	 
}
