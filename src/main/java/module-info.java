module fordsoft.com.javafx.crud {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
   

    opens fordsoft.com.javafx.crud to javafx.fxml;
    opens fordsoft.com.javafx.crud.dashboard to javafx.fxml;
    exports fordsoft.com.javafx.crud;
    exports fordsoft.com.javafx.crud.dashboard;
    exports fordsoft.com.javafx.crud.model;

    
}
