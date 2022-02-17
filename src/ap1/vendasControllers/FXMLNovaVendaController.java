package ap1.vendasControllers;

import ap1.modelos.Cliente;
import ap1.modelos.Motocicleta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.*;

public class FXMLNovaVendaController implements Initializable {

    @FXML
    private ComboBox<Cliente> comboCliente;

    @FXML
    private ComboBox<Motocicleta> comboMotocicleta;

    @FXML
    private List<Cliente> listClientes = new ArrayList<>();

    @FXML
    private ObservableList<Cliente> obsListClientes;

    @FXML
    private List<Motocicleta> listMotocicletas = new ArrayList<>();

    @FXML
    private ObservableList<Motocicleta> obsListMotocicletas;

    @FXML
    private TextField valor;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregaClientes();
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
    private void carregaClientes(){
        Cliente cliente1 = new Cliente("Odair", "0000000", new Date(1987,2,13), 10000);

        listClientes.add(cliente1);
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
