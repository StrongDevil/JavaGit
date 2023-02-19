module com.example.javagit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javagit to javafx.fxml;
    exports com.example.javagit;
}