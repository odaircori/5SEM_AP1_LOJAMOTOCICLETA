package ap1.cadastrosControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class FXMLCadMotoController {

    @FXML
    private TextField fabricante;

    @FXML
    private TextField modelo;

    @FXML
    private TextField ano;

    @FXML
    private TextField valor;

    @FXML
    public void limparCadMoto(ActionEvent event) {
        fabricante.setText(null);
        modelo.setText(null);
        ano.setText(null);
        valor.setText(null);
    }

    @FXML
    private void salvarCadMoto(ActionEvent event) {
        // TODO
    }

}
