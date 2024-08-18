//Everything starts here for the user

package com.example.eduvoschatroomclient;

//imports
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ClientLogin extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("login-view"));
        stage.setTitle("Eduvos Chat Room");
        stage.setScene(scene);
        stage.show();
    }//start

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }//setRoot

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClientLogin.class.getResource(fxml + ".fxml"));
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }//loadFXML

    public static void main(String[] args) {
        launch();
    }//main

}//ClientLogin