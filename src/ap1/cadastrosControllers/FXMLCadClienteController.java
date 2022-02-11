package ap1.cadastrosControllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class FXMLCadClienteController {

    @FXML
    private TextField nome;

    @FXML
    private TextField cpf;

    @FXML
    private DatePicker dataNascimento;

    @FXML
    private TextField renda;

    @FXML
    public void limparCadCliente(ActionEvent event) {
        nome.setText(null);
        cpf.setText(null);
        renda.setText(null);
        dataNascimento.setValue(null);
    }

    @FXML
    private void salvarCadCliente(ActionEvent event) {
        // TODO

    }

}
