module com.example.search_engine_accio {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.search_engine_accio to javafx.fxml;
    exports com.example.search_engine_accio;
}