module com.example.clock_app {
            requires javafx.controls;
            requires javafx.fxml;


            opens com.example.clock_app to javafx.fxml;
            exports com.example.clock_app;
}