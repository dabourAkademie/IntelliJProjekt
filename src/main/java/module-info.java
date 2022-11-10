module com.example.fxgithub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxgithub to javafx.fxml;
    exports com.example.fxgithub;
}