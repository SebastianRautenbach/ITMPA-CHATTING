//Handles interaction with the login UI

package com.example.eduvoschatroomclient;

//imports
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.util.regex.Pattern;

public class LoginController {
    //components
    @FXML
    private Label lblName, lblPassword, lblPasswordPattern;
    @FXML
    private TextField txtName, txtIP;



    //validation
    @FXML
    private boolean isNameEmpty(String string) {//checks for empty name
        if (string.isEmpty()) {
            lblName.setText("*Name cannot be empty");
            lblName.setVisible(true);
            return true;
        } else {
            lblName.setVisible(false);
            return false;
        }//if
    }//isNameEmpty

    @FXML
    private boolean isPasswordEmpty(String string) {//checks for empty password
        if (string.isEmpty()) {
            lblPassword.setText("*Password cannot be empty");
            lblPassword.setVisible(true);
            return true;
        } else {
            lblPassword.setVisible(false);
            return false;
        }//if
    }//isIPEmpty

    private boolean isSmallName(String name) {//checks length of name
        if (name.length() < 2) {
            lblName.setText("*Name cannot be less than 2 characters long");
            lblName.setVisible(true);
            return true;
        } else {
            lblName.setVisible(false);
            return false;
        }//if
    }//isSmallName

    private boolean isSmallPassword(String password) {//checks length of password
        if (password.length() < 8) {
            lblPassword.setText("*Password cannot be less than 8 characters long");
            lblPassword.setVisible(true);
            return true;
        } else {
            lblPassword.setVisible(false);
            return false;
        }//if
    }//isSmallPassword

    private boolean isInvalidPassword(String password) {//checks that the password has variety
        boolean hasLowerCase, hasUpperCase, hasNumber, hasSpecial;

        //Set patterns for searching
        //check for lowercase letter
        Pattern lowerCasePattern = Pattern.compile("[a-z]");
        //check for uppercase letter
        Pattern upperCasePattern = Pattern.compile("[A-Z]");
        //check for a number
        Pattern numberPattern = Pattern.compile("[0-9]");
        //check for a special character
        Pattern specialPattern = Pattern.compile("[^a-zA-Z0-9]");

        hasLowerCase = lowerCasePattern.matcher(password).find();
        hasUpperCase = upperCasePattern.matcher(password).find();
        hasNumber = numberPattern.matcher(password).find();
        hasSpecial = specialPattern.matcher(password).find();


        if (((!hasLowerCase) || (!hasUpperCase) || (!hasNumber) || (!hasSpecial)) && !(lblPassword.isVisible())) {
            lblPasswordPattern.setText("*Must contain a number, special, uppercase and lowercase character.");
            lblPasswordPattern.setVisible(true);


            return true;
        } else {
            lblPasswordPattern.setVisible(false);
            return false;

        }//if
    }//isInvalidPassword

    private boolean validateInput(String name, String password) {
        boolean nameEmpty, passwordEmpty, nameTooShort, passwordTooShort, sqlInjection, invalidPassword;

        nameEmpty = isNameEmpty(name);
        passwordEmpty = isPasswordEmpty(password);
        nameTooShort = isSmallName(name);
        passwordTooShort = isSmallPassword(password);
        invalidPassword = isInvalidPassword(password);
        //sqlInjection(name, password)-prevent phrases like SELECT * FROM


        return !(nameEmpty || passwordEmpty || nameTooShort || passwordTooShort || invalidPassword);
    }//validateInput

    @FXML
    protected void onJoinClick() throws IOException {
        //var
        String userName, userPassword;
        boolean canJoin = true;

        userName = txtName.getText();
        userPassword = txtIP.getText();

        canJoin = validateInput(userName, userPassword);


        if (canJoin == true) {
            System.out.println("Success");
            ClientLogin.setRoot("chatroom-view");
        } else {
            System.out.println("Validation failed");
        }//if

    }//onJoinClick

}//LoginController