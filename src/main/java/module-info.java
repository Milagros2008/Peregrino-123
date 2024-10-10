module com.uiejemlos.proyectoprueba {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uiejemlos.proyectoprueba to javafx.fxml;
    exports com.uiejemlos.proyectoprueba;
}