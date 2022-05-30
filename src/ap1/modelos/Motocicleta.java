package ap1.modelos;

import javafx.fxml.FXML;

import java.util.UUID;

public class Motocicleta {
    @FXML
    private UUID id;

    @FXML
    private String fabricante;

    @FXML
    private String modelo;

    @FXML
    private Integer ano;

    @FXML
    private Double valor;

    public Motocicleta(String fabricante, String modelo, Integer ano, Double valor){
        this.id = UUID.randomUUID();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public UUID getId(){
        return this.id;
    }

    public String getFabricante(){
        return this.fabricante;
    }
    public String getModelo(){  return this.modelo;}
    public Integer getAno(){
        return this.ano;
    }
    public Double getValor(){
        return this.valor;
    }

    @Override
    public String toString(){
        return this.fabricante + " " + this.modelo + " " + this.ano;
    }
}
