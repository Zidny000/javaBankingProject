package application;

import java.util.ArrayList;

import banking.BankAccount;
import banking.InSufficientBalanceException;
import banking.InvalidAccountException;
import banking.MaxWithdawException;
import banking.Transaction;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class BankTransactionController {
	 @FXML
	 TextField accNumTF;
	 @FXML
	 TextField amtTf;
	 @FXML
	 TextField fromAccTf;
	 @FXML
	 TextField toAccTf;
	 @FXML
	 ListView<String> myListView;
	 @FXML
	 Label info;
	 
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
	 
	 public void withdraw() throws InSufficientBalanceException, MaxWithdawException {
		 String accNum = accNumTF.getText();
		 double amt = Double.parseDouble(amtTf.getText());
		 try {
			Main.bank.withdraw(accNum, amt);
		} catch (InvalidAccountException e) {
			e.printStackTrace();
		}
	 }
	 
	 public void deposit() {
		 String accNum = accNumTF.getText();
		 double amt = Double.parseDouble(amtTf.getText());
		 try {
			Main.bank.deposit(accNum, amt);
		} catch (InvalidAccountException e) {
			e.printStackTrace();
		}
	 }
	 public void transfer() throws InSufficientBalanceException, MaxWithdawException {
		 String fromAccNum = fromAccTf.getText();
		 String toAccNum = toAccTf.getText();
		 double amt = Double.parseDouble(amtTf.getText());
	 	try {
			Main.bank.transfer(fromAccNum,toAccNum,amt);
		} catch (InvalidAccountException e) {
			e.printStackTrace();
		}
		 
	 }
	 
	 public void getBalance() throws InvalidAccountException {
		 String accNum = accNumTF.getText();
		 try {
			 double amt = Main.bank.getBalance(accNum);
			 info.setText(Double.toString(amt));
		 }catch (InvalidAccountException e) {
			 e.printStackTrace();
		 }
		 
		 
	 }
	 public void getAccTransaction() throws InvalidAccountException{
		 String accNum = accNumTF.getText();
	 	try {
	 		ArrayList <Transaction> transactions = new ArrayList<>();
			transactions = Main.bank.getAccTransactions(accNum);
			for(int i = 0 ; i < transactions.size() ; i++) {
				
				System.out.println(transactions.get(i).toString());
				myListView.getItems().add(transactions.get(i).toString());
				
			}
		
		} catch (InvalidAccountException e) {
			e.printStackTrace();
		}
	 }
	 public void findAccount() throws InvalidAccountException{
		 String accNum = accNumTF.getText();
			try {
				String bankAcc = Main.bank.findAccount(accNum).toString();
				info.setText(bankAcc);
			} catch (InvalidAccountException e) {
				e.printStackTrace();
			}
	 }
}
