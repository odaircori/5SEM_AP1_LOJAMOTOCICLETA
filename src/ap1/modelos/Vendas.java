package ap1.modelos;

import javafx.fxml.FXML;

import java.util.UUID;

public class Vendas {

    @FXML
    private UUID id;

    @FXML
    private String cliente;

    @FXML
    private String motocicleta;

    @FXML
    private Integer valorVenda;

    public Vendas(String cliente, String motocicleta, Integer valor){
        this.id = UUID.randomUUID();
        this.cliente = cliente;
        this.motocicleta = motocicleta;
        this.valorVenda = valor;

    }

    public String getCliente() {
        return cliente;
    }

    public String getMotocicleta() {
        return motocicleta;
    }

    public Integer getValorVenda() {
        return valorVenda;
    }
}
