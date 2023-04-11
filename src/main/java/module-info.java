module com.example.hibernatejavafxultimate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hibernatejavafxultimate to javafx.fxml;
    exports com.example.hibernatejavafxultimate;
}