module com.example.eduvoschatroomclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eduvoschatroomclient to javafx.fxml;
    exports com.example.eduvoschatroomclient;
}