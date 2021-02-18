module com.edcarlos.mavenproject2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.edcarlos.mavenproject2 to javafx.fxml;
    exports com.edcarlos.mavenproject2;
}
