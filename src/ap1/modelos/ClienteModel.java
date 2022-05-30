package ap1.modelos;

import java.util.UUID;

public class ClienteModel {
    public UUID id;
    public String nome;

    public ClienteModel(UUID id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public ClienteModel(){}

    @Override
    public String toString(){
        return this.nome;
    }
}
