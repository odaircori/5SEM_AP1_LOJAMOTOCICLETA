package database;

import ap1.modelos.Cliente;
import ap1.modelos.Motocicleta;

import java.sql.SQLException;

public interface IDatabase {

    public void inserirCliente(Cliente ccliente) throws SQLException;
    public void alterarCliente(Cliente cliente) throws SQLException;
    public void deletarCliente(Cliente cliente) throws SQLException;
    public void inserirMoto(Motocicleta motocicleta) throws SQLException;
    public void atualizarMoto(Motocicleta motocicleta) throws SQLException;
    public void deletarMoto(Motocicleta motocicleta) throws SQLException;
}
