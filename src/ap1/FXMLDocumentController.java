package ap1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author OdairCoriolano
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label labelButton;

    @FXML
    private MenuItem cadCliente;

    @FXML
    private MenuItem cadMoto;

    @FXML
    private MenuItem novaVenda;

    @FXML
    private MenuItem listaVendas;

    @FXML
    private MenuItem buscaVendas;

    @FXML
    private AnchorPane anchorPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleCadCliente(ActionEvent event) throws IOException {
        AnchorPane cadCliente = (AnchorPane) FXMLLoader.load(getClass().getResource("cadastrosView/FXMLCadCliente.fxml"));
        anchorPane.getChildren().setAll(cadCliente);
    }

    @FXML
    private void handleCadMoto(ActionEvent event) throws IOException {
        AnchorPane cadMoto = (AnchorPane) FXMLLoader.load(getClass().getResource("cadastrosView/FXMLCadMoto.fxml"));
        anchorPane.getChildren().setAll(cadMoto);
    }

    @FXML
    private void handleNovaVenda(ActionEvent event) throws IOException {
        AnchorPane cadMoto = (AnchorPane) FXMLLoader.load(getClass().getResource("vendasView/FXMLNovaVenda.fxml"));
        anchorPane.getChildren().setAll(cadMoto);
    }

    @FXML
    private void handleListaVendas(ActionEvent event) throws IOException {
        AnchorPane cadMoto = (AnchorPane) FXMLLoader.load(getClass().getResource("vendasView/FXMLListaVendas.fxml"));
        anchorPane.getChildren().setAll(cadMoto);
    }
    

    
}
