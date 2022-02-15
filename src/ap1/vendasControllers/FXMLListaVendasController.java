package ap1.vendasControllers;

import ap1.modelos.Vendas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.*;

public class FXMLListaVendasController implements Initializable {

    @FXML
    private TableView<Vendas> tableListaVendas;

    @FXML
    private TableColumn<Vendas, String> nomeCliente;

    @FXML
    private TableColumn<Vendas, String> motocicleta;

    @FXML
    private TableColumn<Vendas, Integer> valorVenda;

    private ObservableList<Vendas> obsVendas;

    private List<Vendas> vendas = new ArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregaListaVendas();
    }

    public void carregaListaVendas() {
        nomeCliente.setCellValueFactory(
                new PropertyValueFactory<>("cliente")
        );
        motocicleta.setCellValueFactory(
                new PropertyValueFactory<>("motocicleta")
        );
        valorVenda.setCellValueFactory(
                new PropertyValueFactory<>("valorVenda")
        );

        Vendas venda1 = new Vendas("Odair","MT09",20000);
        Vendas venda2 = new Vendas("João","XJ6",25000);
        vendas.add(venda1);
        vendas.add(venda2);

        obsVendas = FXCollections.observableArrayList(vendas);
        tableListaVendas.setItems(obsVendas);
    }

}
