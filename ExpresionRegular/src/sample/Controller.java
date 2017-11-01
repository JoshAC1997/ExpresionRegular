package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static javafx.scene.control.Alert.*;

public class Controller {
    public TextField txfTexto;
    public Button btnBuscar;

    public void RealizarComparacion(ActionEvent event) {

            Persona.buscarPorNombre(txfTexto.getText());



    }
}
