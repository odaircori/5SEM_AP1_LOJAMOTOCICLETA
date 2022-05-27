package ap1.modelos;

import javafx.fxml.FXML;

import java.time.LocalDate;
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
    private LocalDate dataNascimento;

    @FXML
    private Double renda;

    public Cliente(String nome, String cpf, LocalDate dataNascimento, Double renda) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.renda = renda;
    }

    public UUID getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }
    public Double getRenda(){
        return this.renda;
    }

    @Override
    public String toString(){
        return this.nome + " " + this.cpf;
    }
}
