module com.example.librarymanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens com.example.librarymanagement to javafx.fxml, com.google.gson;
    exports com.example.librarymanagement;
}