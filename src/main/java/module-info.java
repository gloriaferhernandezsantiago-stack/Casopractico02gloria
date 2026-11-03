module com.mycompany.casopractico02gloria {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.casopractico02gloria to javafx.fxml;
    exports com.mycompany.casopractico02gloria;
}
