package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class BankAddUserController implements Initializable {
	
	 @FXML
	 private ComboBox<String> comb;
	 
	 @FXML
	 TextField nameTf;
	 @FXML
	 TextField nidTf;
	 @FXML
	 TextField initialBalanceTf;
	 @FXML
	 TextField tradelicenseTf;
	 @FXML
	 TextField studentIdTf;
	 @FXML
	 TextField institutionNameTf;
	 @FXML
	 TextField maxWithTf;
	 @FXML
	 Label info;
	 

	 public void selected(ActionEvent e) {
		 String s = comb.getSelectionModel().getSelectedItem().toString();
	       
	        if(s.equals("Current Account")) {
	        	try {
	    			
	    			AnchorPane root = FXMLLoader.load(getClass().getResource("BankAddCurrent.fxml"));
	    			Scene scene = new Scene(root,600,600);
	    			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	    			Main.primaryStage.setScene(scene);
	    			Main.primaryStage.show();
	    		}catch(Exception e1) {
	    			e1.printStackTrace();
	    		}
	        }
	        if(s.equals("Student Account")) {
	        	try {
	    			
	    			AnchorPane root = FXMLLoader.load(getClass().getResource("BankAddStudent.fxml"));
	    			Scene scene = new Scene(root,600,600);
	    			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	    			Main.primaryStage.setScene(scene);
	    			Main.primaryStage.show();
	    		}catch(Exception e1) {
	    			e1.printStackTrace();
	    		}
	        }
	        if(s.equals("Savings Account")) {
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
	       
	    }   
	 
	public void addCurrentUser() {
		System.out.println("Current");
		try {
    		System.out.println("Data not saved");
    		String name = nameTf.getText();
			String nid = nidTf.getText();
			String tradelicense = tradelicenseTf.getText();
			double balance = Double.parseDouble(initialBalanceTf.getText());
	
			String accNum = Main.bank.addAccount(name, nid, balance,tradelicense);
				
			info.setText(accNum);
			try {
				Main.bank.saveData();
			}catch(IOException e) {
				System.out.println("Data not saved");
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public void addStudentUser() {
		
		try {
			
    		String name = nameTf.getText();
			String nid = nidTf.getText();
			String sid = studentIdTf.getText();
			String institution = institutionNameTf.getText();
			double balance = Double.parseDouble(initialBalanceTf.getText());
			
			
			String accNum = Main.bank.addAccount(name, nid, balance, institution,sid);
			
			info.setText(accNum);
			try {
				Main.bank.saveData();
			}catch(IOException e) {
				System.out.println("Data not saved");
			}
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	 
	public void addSavingsUser() {
		
			
	        	try {
	        		
	    			String name = nameTf.getText();
	    			String nid = nidTf.getText();
	    			double balance = Double.parseDouble(initialBalanceTf.getText());
	    			double maxWith = Double.parseDouble( maxWithTf.getText());
	    			
	    			String accNum = Main.bank.addAccount(name, nid, balance, maxWith);
	    			
	    			info.setText(accNum);
	    			try {
	    				Main.bank.saveData();
	    			}catch(IOException e) {
	    				System.out.println("Data not saved");
	    			}
	    			
	    			
	    			
	    		}catch(Exception e1) {
	    			e1.printStackTrace();
	    		}
	        
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 ObservableList<String> list = FXCollections.observableArrayList("Savings Account","Current Account","Student Account");
         comb.setItems(list);
        
		
	}
	
}
