package AccountLoader;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class mainController  extends TabPane implements Initializable {
 @FXML TextField userId;
 @FXML PasswordField password;
 @FXML Button login;
 @FXML Label errorMessage;

 private Main application;


 public void setApp(Main application){
  this.application = application;
 }

 @Override
 public void initialize(URL location, ResourceBundle resources) {
  errorMessage.setText("");
  userId.setPromptText("demo");
  password.setPromptText("demo");

 }

 public void processLogin(ActionEvent event) {
  if (application == null){
   // We are running in isolated FXML, possibly in Scene Builder.
   // NO-OP.
   errorMessage.setText("Hello " + userId.getText());
  } else {
//   if (!application.userLogging(userId.getText(), password.getText())){
//    errorMessage.setText("Username/Password is incorrect");
//   }
  }
 }

}
