package database;

import ap1.modelos.*;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public interface IDatabase {

    public void inserirCliente(Cliente ccliente) throws SQLException;
    public void alterarCliente(Cliente cliente) throws SQLException;
    public void deletarCliente(Cliente cliente) throws SQLException;
    public List<ClienteModel> buscaClientes() throws  SQLException;
    public List<MotoModel> buscarMotos() throws  SQLException;
    public List<VendaModel> buscarVendas() throws  SQLException;
    public void inserirMoto(Motocicleta motocicleta) throws SQLException;
    public void novaVenda(UUID cliente, UUID motocicleta, Double valor) throws SQLException;
    public void atualizarMoto(Motocicleta motocicleta) throws SQLException;
    public void deletarMoto(Motocicleta motocicleta) throws SQLException;
}
