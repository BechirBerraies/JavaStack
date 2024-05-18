module com.example.rmi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rmi to javafx.fxml;
    exports com.example.rmi;
}