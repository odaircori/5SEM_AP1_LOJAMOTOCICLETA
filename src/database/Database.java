package database;

import ap1.modelos.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Database implements IDatabase {
    public Connection databaseLink;

    public Database(){
        String databaseName = "coriolanoMotoVendas";
        String databaseUser = "app";
        String databasePassword = "12345";
        String url = "jdbc:mysql://localhost/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void inserirCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO clientes VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = databaseLink.prepareStatement(sql);
        ps.setString(1, cliente.getId().toString());
        ps.setString(2, cliente.getNome());
        ps.setString(3, cliente.getCpf());
        ps.setObject(4, cliente.getDataNascimento());
        ps.setDouble(5, cliente.getRenda());
        ps.execute();
        ps.close();

    }

    @Override
    public void alterarCliente(Cliente cliente) throws SQLException {

    }

    @Override
    public void deletarCliente(Cliente cliente) throws SQLException {

    }

    @Override
    public List<ClienteModel> buscaClientes() throws SQLException {
        List<ClienteModel> listaClientes = new ArrayList<>();

        String sql = "SELECT id, nome FROM clientes";
        PreparedStatement ps = databaseLink.prepareStatement(sql);
        ResultSet result = ps.executeQuery();

        while (result.next()){
            ClienteModel clienteModel = new ClienteModel();
            clienteModel.id = UUID.fromString(result.getString("id"));
            clienteModel.nome = result.getString("nome");

            listaClientes.add(clienteModel);
        }

        result.close();
        ps.close();

        return listaClientes;
    }

    @Override
    public void inserirMoto(Motocicleta motocicleta) throws SQLException {
        String sql = "INSERT INTO motocicletas VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = databaseLink.prepareStatement(sql);
        ps.setString(1, motocicleta.getId().toString());
        ps.setString(2, motocicleta.getFabricante());
        ps.setString(3, motocicleta.getModelo());
        ps.setInt(4, motocicleta.getAno());
        ps.setDouble(5, motocicleta.getValor());
        ps.execute();
        ps.close();
    }

    @Override
    public void novaVenda(UUID clienteId, UUID motocicletaId, Double valor) throws SQLException {
        String sql = "INSERT INTO vendas VALUES (?, ?, ?, ?)";
        PreparedStatement ps = databaseLink.prepareStatement(sql);
        ps.setString(1, UUID.randomUUID().toString());
        ps.setString(2, clienteId.toString());
        ps.setString(3, motocicletaId.toString());
        ps.setDouble(4, valor);
        ps.execute();
        ps.close();
    }

    @Override
    public void atualizarMoto(Motocicleta motocicleta) throws SQLException {

    }

    @Override
    public void deletarMoto(Motocicleta motocicleta) throws SQLException {

    }

    @Override
    public List<MotoModel> buscarMotos() throws SQLException {
        List<MotoModel> listaMotos = new ArrayList<>();

        String sql = "SELECT id, fabricante, modelo, ano FROM motocicletas";
        PreparedStatement ps = databaseLink.prepareStatement(sql);
        ResultSet result = ps.executeQuery();

        while (result.next()){
            MotoModel motoModel = new MotoModel();
            motoModel.id = UUID.fromString(result.getString("id"));
            motoModel.fabricante = result.getString("fabricante");
            motoModel.modelo = result.getString("modelo");
            motoModel.ano = result.getInt("ano");

            listaMotos.add(motoModel);
        }

        result.close();
        ps.close();

        return listaMotos;
    }

    @Override
    public List<VendaModel> buscarVendas() throws SQLException {
        List<VendaModel> listarVendas = new ArrayList<>();

        String sql = "SELECT c.id as idCliente, c.nome, m.id as idMoto, m.fabricante, m.modelo, m.ano, v.valor FROM vendas V inner join clientes C on v.cliente_id = c.id inner join motocicletas M on v.motocicleta_id = m.id";
        PreparedStatement ps = databaseLink.prepareStatement(sql);
        ResultSet result = ps.executeQuery();

        while (result.next()){
            VendaModel vendaModel = new VendaModel(result.getString("nome"), result.getString("fabricante") + " - " + result.getString("modelo") + " - " + result.getInt("ano"), Double.parseDouble(result.getString("valor")));

            listarVendas.add(vendaModel);
        }

        result.close();
        ps.close();

        return listarVendas;
    }
}
