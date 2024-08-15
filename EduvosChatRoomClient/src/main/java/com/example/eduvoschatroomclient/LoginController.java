package com.example.eduvoschatroomclient;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {
    //components
    @FXML
    private Label lblName, lblIP;
    @FXML
    private TextField txtName, txtIP;
    @FXML
    private Button btnJoin;

    //validation
    @FXML
     void isNameEmpty(String string){
        if (string.isEmpty()){
            lblName.setVisible(true);
        }else {
            lblName.setVisible(false);
        }
    }

    @FXML
    void isIPEmpty(String string){
        if (string.isEmpty()){
            lblIP.setVisible(true);
        }else{
            lblIP.setVisible(false);
        }
    }


    @FXML
    protected void onJoinClick() throws IOException {
        //var
        String userName, userIP;
        boolean canJoin=true;

        userName=txtName.getText();
        userIP=txtIP.getText();

        isNameEmpty(userName);
        isIPEmpty(userIP);

        if (canJoin==true){
            System.out.println("Success");
            ClientLogin.setRoot("chatroom-view");
        }

    }
}