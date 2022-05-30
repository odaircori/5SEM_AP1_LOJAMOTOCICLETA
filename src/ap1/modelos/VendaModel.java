package ap1.modelos;

import javafx.fxml.FXML;

public class VendaModel {
    private String cliente;
    private String motocicleta;
    private Double valorVenda;

    public VendaModel(String cliente, String motocicleta, Double valorVenda){
        this.cliente = cliente;
        this.motocicleta = motocicleta;
        this.valorVenda = valorVenda;
    }

    public String getCliente(){
        return cliente;
    }

    public String getMotocicleta(){
        return motocicleta;
    }

    public Double getValorVenda(){
        return valorVenda;
    }


    @Override
    public String toString(){
        return this.cliente + " - " + this.motocicleta + " - " + this.valorVenda;
    }
}
