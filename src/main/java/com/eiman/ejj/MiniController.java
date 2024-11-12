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
}
