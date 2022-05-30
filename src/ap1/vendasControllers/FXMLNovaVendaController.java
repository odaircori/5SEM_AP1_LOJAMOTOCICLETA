package ap1.vendasControllers;

import ap1.modelos.ClienteModel;
import ap1.modelos.MotoModel;
import database.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.SQLException;
import java.util.*;

public class FXMLNovaVendaController implements Initializable {

    private Database conDatabase = new Database();

    @FXML
    private ComboBox<ClienteModel> comboCliente;

    @FXML
    private ComboBox<MotoModel> comboMotocicleta;

    @FXML
    private List<ClienteModel> listClientes = new ArrayList<>();

    @FXML
    private ObservableList<ClienteModel> obsListClientes;

    @FXML
    private List<MotoModel> listMotocicletas = new ArrayList<>();

    @FXML
    private ObservableList<MotoModel> obsListMotocicletas;

    @FXML
    private TextField valor;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            carregaClientes();
            carregaMotocicletas();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @FXML
    public void limparNovaVenda(ActionEvent event) {
        comboCliente.setValue(null);
        comboMotocicleta.setValue(null);
        valor.setText(null);
    }

    @FXML
    private void salvarNovaVenda(ActionEvent event) {
        try {
            UUID clienteId = comboCliente.getValue().id;
            UUID motoId = comboMotocicleta.getValue().id ;
            Double valor = Double.parseDouble(this.valor.getText());

            conDatabase.novaVenda(clienteId, motoId, valor);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void carregaClientes() throws SQLException {
        List<ClienteModel> clientes = conDatabase.buscaClientes();

        listClientes.addAll(clientes);
        obsListClientes = FXCollections.observableArrayList(listClientes);

        comboCliente.setItems(obsListClientes);
    }

    @FXML
    private void carregaMotocicletas() throws SQLException {
        List<MotoModel> motos = conDatabase.buscarMotos();

        listMotocicletas.addAll(motos);
        obsListMotocicletas = FXCollections.observableArrayList(listMotocicletas);

        comboMotocicleta.setItems(obsListMotocicletas);
    }
}
