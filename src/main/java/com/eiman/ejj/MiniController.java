package com.eiman.ejj;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * Controlador para gestionar la interfaz de configuracion del MINI Cooper.
 * Controla el encendido/apagado de luces y el cambio de color del coche.
 */
public class MiniController {

    @FXML
    private ImageView carImageView;

    @FXML
    private ImageView lightsButton;

    @FXML
    private ImageView lightsOverlayImageView;

    private boolean lightsOn = false;

    /**
     * Alterna las luces del coche entre encendidas y apagadas.
     * Muestra o oculta la imagen de superposicion de las luces segun el estado.
     */
    @FXML
    private void toggleLights() {
        if (lightsOn) {
            lightsButton.setImage(new Image(getClass().getResource("/com/eiman/ejj/imagenes/lucesOff.png").toExternalForm()));
            lightsOverlayImageView.setVisible(false);
            lightsOn = false;
        } else {
            lightsButton.setImage(new Image(getClass().getResource("/com/eiman/ejj/imagenes/lucesOn.png").toExternalForm()));
            lightsOverlayImageView.setVisible(true);
            lightsOn = true;
        }
    }

    /**
     * Cambia el color del coche segun el boton de color presionado.
     * Determina el nuevo color basado en el ID del boton.
     *
     * @param event ImageView del color seleccionado.
     */
    @FXML
    private void changeColor(MouseEvent event) {
        ImageView colorButton = (ImageView) event.getSource();
        String colorId = colorButton.getId().replace("color", "mini");
        String imagePath = String.format("/com/eiman/ejj/imagenes/%s.png", colorId);

        carImageView.setImage(new Image(getClass().getResource(imagePath).toExternalForm()));

        if (lightsOn) {
            toggleLights(); // Apaga las luces si estaban encendidas al cambiar de color
        }
    }
}
