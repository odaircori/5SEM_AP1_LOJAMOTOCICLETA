package ap1.cadastrosControllers;

import ap1.modelos.Motocicleta;
import database.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class FXMLCadMotoController {
    private Database conDatabase = new Database();

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
        try {
            String fabricante = this.fabricante.getText();
            String modelo = this.modelo.getText();
            Integer ano = Integer.parseInt(this.ano.getText());
            Double valor = Double.parseDouble(this.valor.getText());;

            Motocicleta moto = new Motocicleta(fabricante, modelo, ano, valor);

            conDatabase.inserirMoto(moto);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
