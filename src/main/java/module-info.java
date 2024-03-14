module org.example.colorselector {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.colorselector to javafx.fxml;
    exports org.example.colorselector;
}