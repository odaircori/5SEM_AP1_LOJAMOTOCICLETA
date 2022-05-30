package ap1.modelos;

import java.util.UUID;

public class MotoModel {
    public UUID id;
    public String fabricante;
    public String modelo;
    public Integer ano;

    @Override
    public String toString(){
        return this.fabricante + " - " + this.modelo + " - " + this.ano;
    }
}
