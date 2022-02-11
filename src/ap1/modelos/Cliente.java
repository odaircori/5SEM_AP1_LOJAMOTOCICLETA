package ap1.modelos;

import javafx.fxml.FXML;

import java.util.Date;
import java.util.UUID;

public class Cliente {

    @FXML
    private UUID id;

    @FXML
    private String nome;

    @FXML
    private String cpf;

    @FXML
    private Date dataNascimento;

    @FXML
    private Number renda;

    public Cliente(String nome, String cpf, Date dataNascimento, Number renda) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.renda = renda;
    }

    @Override
    public String toString(){
        return this.nome + " " + this.cpf;
    }
}
