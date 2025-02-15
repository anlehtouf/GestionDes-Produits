package org.example;

import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;

public class ProduitController {
    private VBox view;
    private TextField nameField;
    private TextField priceField;
    private ListView<Produit> listView;
    private Button addButton;

    public ProduitController() {
        Label nameLabel = new Label("Nom du produit:");
        nameField = new TextField();

        Label priceLabel = new Label("Prix du produit:");
        priceField = new TextField();

        addButton = new Button("Ajouter");
        ObservableList<Produit> produitList = null;
        listView = new ListView<>(produitList);

        addButton.setOnAction(e -> {
            String name = nameField.getText();
            try {
                double price = Double.parseDouble(priceField.getText());
                produitList.add(new Produit(name, price));
                nameField.clear();
                priceField.clear();
            } catch (NumberFormatException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR, "Veuillez entrer un prix valide.", ButtonType.OK);
                alert.showAndWait();
            }
        });

        view = new VBox(10, nameLabel, nameField, priceLabel, priceField, addButton, listView);
        view.setPadding(new Insets(10));
    }

    public VBox getView() {
        return view;
    }
}

