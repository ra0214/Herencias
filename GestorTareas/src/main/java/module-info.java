module com.mendoza.gestortareas {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    requires com.gluonhq.attach.display;
    requires com.gluonhq.charm.glisten;
    requires java.desktop;


    opens com.mendoza.gestortareas to javafx.fxml;
    exports com.mendoza.gestortareas;
    exports com.mendoza.gestortareas.controllers;
    opens com.mendoza.gestortareas.controllers to javafx.fxml;
}