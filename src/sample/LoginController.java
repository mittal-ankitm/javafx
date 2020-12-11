package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
public class LoginController {

    @FXML
    private Button clickButton;
    @FXML
    private Label textpwdField;
    @FXML
    private PasswordField pwdfield;
    public void clickbuttonOnAction(ActionEvent event){
        //Stage stage =(Stage) clickButton.getScene().getWindow();
        //stage.close();
        textpwdField.setText(pwdfield.getText().toString());
    }

}
