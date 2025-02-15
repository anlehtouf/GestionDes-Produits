package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProduitsApp  extends Application {
    @Override
    public void start(Stage primaryStage) {
        ProduitController controller = new ProduitController();
        VBox root = controller.getView();
        root.getStylesheets().add(getClass().getResource("/Style.css").toExternalForm());

        Scene scene = new Scene(root, 300, 400);
        primaryStage.setTitle("Gestion des Produits");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}