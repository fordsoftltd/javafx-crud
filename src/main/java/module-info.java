module fordsoft.com.javafx.crud {
    requires javafx.controls;
    requires javafx.fxml;

    opens fordsoft.com.javafx.crud to javafx.fxml;
    exports fordsoft.com.javafx.crud;
}
