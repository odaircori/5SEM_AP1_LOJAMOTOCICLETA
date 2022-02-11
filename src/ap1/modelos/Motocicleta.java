package ap1.modelos;

import javafx.fxml.FXML;

import java.util.Date;
import java.util.UUID;

public class Motocicleta {
    @FXML
    private UUID id;

    @FXML
    private String fabricante;

    @FXML
    private String modelo;

    @FXML
    private Number ano;

    @FXML
    private Number valor;

    public Motocicleta(String fabricante, String modelo, Number ano, Number valor){
        this.id = UUID.randomUUID();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    @Override
    public String toString(){
        return this.fabricante + " " + this.modelo + " " + this.ano;
    }
}
