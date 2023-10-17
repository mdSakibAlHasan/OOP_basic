module com.example.smaple {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.smaple to javafx.fxml;
    exports com.example.smaple;
}