package ap1.vendasControllers;

import ap1.modelos.MotoModel;
import com.sun.xml.internal.bind.v2.TODO;
import database.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FXMLBuscaVendasController implements Initializable {
    private Database conDatabase = new Database();

    @FXML
    private ComboBox<MotoModel> comboMotocicleta;

    @FXML
    private Button buscarButton;

    @FXML
    private List<MotoModel> listMotocicletas = new ArrayList<>();

    @FXML
    private ObservableList<MotoModel> obsListMotocicletas;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            carregaMotocicletas();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @FXML
    private void carregaMotocicletas() throws SQLException {
        List<MotoModel> motos = conDatabase.buscarMotos();

        listMotocicletas.addAll(motos);
        obsListMotocicletas = FXCollections.observableArrayList(listMotocicletas);

        comboMotocicleta.setItems(obsListMotocicletas);
    }

    public void buscaVendasPorMoto(){
        //ToDo
    }

}
