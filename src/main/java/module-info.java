module com.example.test_sf3_26 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test_sf3_26 to javafx.fxml;
    exports com.example.test_sf3_26;
}