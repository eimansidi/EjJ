module com.eiman.ejj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.eiman.ejj to javafx.fxml;
    exports com.eiman.ejj;
}