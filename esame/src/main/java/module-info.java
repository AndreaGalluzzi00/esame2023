module com.example.esame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.esame to javafx.fxml;
    exports com.example.esame;
}