//handles interaction with the chatroom interface

package com.example.eduvoschatroomclient;

//imports
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.IOException;

public class ChatroomController {
    //components
    @FXML
    TextField edtFindPerson;

    @FXML
    private void btnLogoutClicked() throws IOException {
        ClientLogin.setRoot("login-view");
    }//btnLogoutClicked

    @FXML
    private void inputTyped() throws IOException {
        String name;
        int EOFPlaceholder=0;
        String[] DBPlaceholder={"John","Macy","Johannes","Karen","Stefan","Zita","Hendriks"};
        //get input
        name=edtFindPerson.getText().toLowerCase();

        //compare-Still need to add in database
        while (EOFPlaceholder<DBPlaceholder.length){

            if (DBPlaceholder[EOFPlaceholder].toLowerCase().contains(name)){
                System.out.println(DBPlaceholder[EOFPlaceholder]);
            }//if

            EOFPlaceholder++;
        }//while

        System.out.println("typing");

    }//inputTyped

}//ChatroomController
