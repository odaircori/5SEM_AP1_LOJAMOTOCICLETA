package ap1.vendasControllers;

import ap1.modelos.*;
import database.Database;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.sql.SQLException;
import java.util.*;

public class FXMLListaVendasController implements Initializable {
    private Database conDatabase = new Database();

    @FXML
    private TableView<VendaModel> tableListaVendas;

    @FXML
    private TableColumn<VendaModel, String> cliente;

    @FXML
    private TableColumn<VendaModel, String> motocicleta;

    @FXML
    private TableColumn<VendaModel, Double> valorVenda;

    private ObservableList<VendaModel> obsVendas;

    private List<VendaModel> vendas = new ArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            carregaListaVendas();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void carregaListaVendas() throws SQLException {
        List<VendaModel> listaVendas = conDatabase.buscarVendas();

        cliente.setCellValueFactory(
                new PropertyValueFactory<>("cliente")
        );

        motocicleta.setCellValueFactory(
                new PropertyValueFactory<>("motocicleta")
        );
        valorVenda.setCellValueFactory(
                new PropertyValueFactory<>("valorVenda")
        );

        vendas.addAll(listaVendas);

        obsVendas = FXCollections.observableArrayList(vendas);
        tableListaVendas.setItems(obsVendas);
    }

}
