package application;

import banking.InSufficientBalanceException;
import banking.InvalidAccountException;
import banking.MaxWithdawException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class BankTransactionController {
	 @FXML
	 TextField accNumTF;
	 @FXML
	 TextField amtTf;
	 
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
}
