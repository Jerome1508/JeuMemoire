module com.example.jeumemoire {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jeumemoire to javafx.fxml;
    exports com.example.jeumemoire;
}