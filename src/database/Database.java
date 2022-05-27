package database;

import ap1.modelos.Cliente;
import ap1.modelos.Motocicleta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
    public void inserirMoto(Motocicleta motocicleta) throws SQLException {

    }

    @Override
    public void atualizarMoto(Motocicleta motocicleta) throws SQLException {

    }

    @Override
    public void deletarMoto(Motocicleta motocicleta) throws SQLException {

    }
}
