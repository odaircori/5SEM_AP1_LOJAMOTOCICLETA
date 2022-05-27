package ap1.modelos;

import java.util.UUID;

public class ClienteModel {
    public UUID id;
    public String nome;

    @Override
    public String toString(){
        return this.nome;
    }
}
