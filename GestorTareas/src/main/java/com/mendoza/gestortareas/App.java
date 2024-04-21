package com.mendoza.gestortareas;

import com.mendoza.gestortareas.models.Tarea;
import com.mendoza.gestortareas.models.TareaAtrasada;
import com.mendoza.gestortareas.models.TareaCategorizada;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;
import java.util.ArrayList;

public class App extends javafx.application.Application  {
    private static Stage stageView;
    private static Stage stageRoot;
    private static Tarea tarea = new Tarea();
    public static Tarea getTarea() {
        return tarea;
    }
    private static ArrayList<TareaCategorizada>listaCategorizada = new ArrayList<>();
    private static ArrayList<TareaAtrasada>listaAtrasada = new ArrayList<>();
    public static void agregarAtrasada(TareaAtrasada tareaAtrasada) {
        listaAtrasada.add(tareaAtrasada);
    }
    public static void agregarCategorizada(TareaCategorizada tareaCategorizada) {
        listaCategorizada.add(tareaCategorizada);
    }
    public static ArrayList<TareaCategorizada> getListaCategorizada() {
        return listaCategorizada;
    }
    @Override
    public void start(Stage stage) throws IOException {
        stageRoot = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("control-view.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setTitle("NameApplication - Home");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void newStage(String fxml, String title) {
        stageView = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(loadFXML(fxml));
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            stageView.setTitle(title);
            stageView.setScene(scene);
            stageView.centerOnScreen();
            stageView.initOwner(stageRoot);
            stageView.initModality(Modality.APPLICATION_MODAL);
            stageView.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Stage getStageView(){
        return stageView;
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}