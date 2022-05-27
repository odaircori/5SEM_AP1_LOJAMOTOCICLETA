package ap1.cadastrosControllers;
import ap1.modelos.Cliente;
import database.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;

public class FXMLCadClienteController {

    private Database conDatabase = new Database();

    @FXML
    private TextField nome;

    @FXML
    private TextField cpf;

    @FXML
    private DatePicker dataNascimento;

    @FXML
    private TextField renda;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    public void limparCadCliente(ActionEvent event) {
        nome.setText(null);
        cpf.setText(null);
        renda.setText(null);
        dataNascimento.setValue(null);
    }

    @FXML
    private void salvarCadCliente(ActionEvent event) {
        try {
            String nome = this.nome.getText();
            String cpf = this.cpf.getText();
            LocalDate dataNascimento = this.dataNascimento.getValue();
            Double renda = Double.parseDouble(this.renda.getText());

            Cliente cliente = new Cliente(nome, cpf, dataNascimento, renda);

            conDatabase.inserirCliente(cliente);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void limparCadCliente() {
        nome.setText(null);
        cpf.setText(null);
        renda.setText(null);
        dataNascimento.setValue(null);
    }


}
