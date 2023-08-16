module com.example.tworings {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tworings to javafx.fxml;
    exports com.example.tworings;
}