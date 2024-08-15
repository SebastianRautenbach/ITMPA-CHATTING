package com.example.eduvoschatroomclient;

import javafx.fxml.FXML;

import java.io.IOException;

public class ChatroomController {
    //components

    @FXML
    private void btnLogoutClicked() throws IOException {
        ClientLogin.setRoot("login-view");
    }

}
