package ap1.modelos;

import java.util.UUID;

public class MotoModel {
    public UUID id;
    public String fabricante;
    public String modelo;
    public Integer ano;

    public MotoModel(UUID id, String fabricante, String modelo, Integer ano){
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
    }

    public MotoModel(){}

    @Override
    public String toString(){
        return this.fabricante + " - " + this.modelo + " - " + this.ano;
    }
}
