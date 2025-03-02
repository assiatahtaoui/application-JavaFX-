module ma.enset.tpjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ma.enset.tpjavafx to javafx.fxml;
    exports ma.enset.tpjavafx;
}