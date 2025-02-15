package org.example;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main {
    public void start(Stage primaryStage) {
        ProduitController controller = new ProduitController();
        VBox root = controller.getView();
        root.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        Scene scene = new Scene(root, 300, 400);
        primaryStage.setTitle("Gestion des Produits");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }}