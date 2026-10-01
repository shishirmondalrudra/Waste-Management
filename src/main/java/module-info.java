module com.example.wastemanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wastemanagement to javafx.fxml;
    exports com.example.wastemanagement;
}