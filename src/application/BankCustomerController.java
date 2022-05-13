package application;

import java.util.ArrayList;

import banking.BankAccount;
import banking.InvalidAccountException;
import banking.Transaction;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class BankCustomerController {
	
	 @FXML
	 ListView<String> accountList;
	 @FXML
	 TextField accNumTF;
	 @FXML
	 TextField nidTf;
	 @FXML
	 Label info;
	 @FXML
	 Label error;

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
	
	public void findAccounts() {
		 ArrayList <BankAccount> accounts = new ArrayList<>();
		 	String nid = nidTf.getText();
			accounts = Main.bank.findAccounts(nid);
			for(int i = 0 ; i < accounts.size() ; i++) {
				
				accountList.getItems().add(accounts.get(i).toString());
				
			}
	 }
	 
	 public void findAccount() throws InvalidAccountException{
		 String accNum = accNumTF.getText();
		 String nid = nidTf.getText();
			try {
				String bankAcc = Main.bank.findAccount(nid,accNum).toString();
				info.setText(bankAcc);
				error.setText("");
			} catch (InvalidAccountException e) {
				e.printStackTrace();
				error.setText(e.getMessage());
			}
	 }
	 
	 public void getAccTransaction() throws InvalidAccountException {
		 String accNum = accNumTF.getText();
		 String nid = nidTf.getText();
	 	try {
	 		ArrayList <Transaction> transactions = new ArrayList<>();
			transactions = Main.bank.getAccTransactions(nid,accNum);
			for(int i = 0 ; i < transactions.size() ; i++) {
				
				System.out.println(transactions.get(i).toString());
				accountList.getItems().add(transactions.get(i).toString());
				
			}
			error.setText("");
		
		} catch (InvalidAccountException e) {
			e.printStackTrace();
			error.setText(e.getMessage());
		}
	 }
}
