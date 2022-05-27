package ap1.vendasControllers;

import ap1.modelos.ClienteModel;
import ap1.modelos.Motocicleta;
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
    private ComboBox<Motocicleta> comboMotocicleta;

    @FXML
    private List<ClienteModel> listClientes = new ArrayList<>();

    @FXML
    private ObservableList<ClienteModel> obsListClientes;

    @FXML
    private List<Motocicleta> listMotocicletas = new ArrayList<>();

    @FXML
    private ObservableList<Motocicleta> obsListMotocicletas;

    @FXML
    private TextField valor;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            carregaClientes();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        carregaMotocicletas();
    }

    @FXML
    public void limparNovaVenda(ActionEvent event) {
        comboCliente.setValue(null);
        comboMotocicleta.setValue(null);
        valor.setText(null);
    }

    @FXML
    private void salvarNovaVenda(ActionEvent event) {
        // TODO
    }

    @FXML
    private void carregaClientes() throws SQLException {
        List<ClienteModel> clientes = conDatabase.buscaClientes();

        listClientes.addAll(clientes);
        obsListClientes = FXCollections.observableArrayList(listClientes);

        comboCliente.setItems(obsListClientes);
    }

    @FXML
    private void carregaMotocicletas(){
        Motocicleta moto1 = new Motocicleta("Yamaha", "MT09", 2021, 10000);

        listMotocicletas.add(moto1);
        obsListMotocicletas = FXCollections.observableArrayList(listMotocicletas);

        comboMotocicleta.setItems(obsListMotocicletas);


    }
}
