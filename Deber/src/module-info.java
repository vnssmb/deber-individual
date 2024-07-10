module Deber {
    requires javafx.controls;
    requires javafx.fxml;
    opens application to javafx.base;
    exports application;
}
