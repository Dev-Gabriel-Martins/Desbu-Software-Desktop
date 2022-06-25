/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gabs
 */
public class Conexao {

    private String DB_URL = "jdbc:mysql://localhost:3306/DB_DESBU";
    private String DB_USER = "root";
    private String DB_PASSWD = "2705"; // senha do mysql

    private Connection connection;
    private Statement statement;
    private PreparedStatement pst;
    private ResultSet resultSet;

    //Classe responsabel em se conectar ao banco de dados;
    public void iniciarConexao() {
        try {
            System.out.println("Conectando com o banco de dados");

            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
            statement = connection.createStatement();
            System.out.println("A porta da geladeira está aberta");
        } catch (SQLException ex) {
            System.err.println("Problema com a conexao");
            ex.printStackTrace();
        }
    }

    public void fecharConexao() {
        try {
            System.out.println("Fechando a conexao com o banco de dados");
            statement.close();
            connection.close();
            System.out.println("A porta da geladeira está fechada");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void abrirChamado(Chamado chamado, int idCli) {
        String query = "INSERT INTO CHAMADO (id_cliente, descricao_chamado, estado_chamado, prioridade_chamado)"
                + "VALUES ('" + idCli + "','" + chamado.getDescAberturaCham() + "', '" + chamado.getEstadoCham() + "','" + chamado.getPrioridadeCham() + "')";
        try {
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("problema para executar a query");
            ex.printStackTrace();
        }

    }

    public void encerrarChamado(Chamado chamado) {
        String query = "UPDATE CHAMADO SET descricao_encerramento='" + chamado.getDescEncerramentoCham() + "', estado_chamado='" + chamado.getEstadoCham() + "' WHERE id_chamado = " + chamado.getIdCham();

        try {
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("problema para executar a query");
            ex.printStackTrace();
        }

    }

    public void insertCli(Cliente cliente) {
        String query = "INSERT INTO CLIENTE (Cnpj_cliente ,"
                + "nome_cliente, "
                + "endereco_cliente,"
                + " telefone_cliente,"
                + " celular_cliente, "
                + "email_cliente) values "
                + "('" + cliente.getCnpj() + "',"
                + "'" + cliente.getNomeCli() + "',"
                + "'" + cliente.getEnderecoCli() + "',"
                + "'" + cliente.getTelefoneCli() + "',"
                + "'" + cliente.getCelularCli() + "',"
                + "'" + cliente.getEmailCli() + "')";

        try {
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("problema para executar a query");
            ex.printStackTrace();
        }

    }

    public void deleteCli(String idCli) {
        String query = "DELETE FROM CLIENTE WHERE id_cliente= ? ";

        try {
            pst = connection.prepareStatement(query);
            pst.setString(1, idCli);
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("problema para executar a query");
            ex.printStackTrace();
        }

    }

    public ArrayList<Cliente> selectCli() throws SQLException {
        ArrayList<Cliente> lista = new ArrayList();
        resultSet = statement.executeQuery("SELECT * FROM CLIENTE");

        while (resultSet.next()) {

            int idCli = resultSet.getInt(1);
            String Cnpj = resultSet.getString(2);
            String nomeCli = resultSet.getString(3);

            String enderecoCli = resultSet.getString(4);
            String telefoneCli = resultSet.getString(5);
            String celularCli = resultSet.getString(6);
            String emailCli = resultSet.getString(7);

            Cliente cliente = new Cliente(idCli, Cnpj, nomeCli, enderecoCli, telefoneCli, celularCli, emailCli);

            lista.add(cliente);
        }

        return lista;
    }

    public ArrayList<Chamado> selectChamAberto() throws SQLException {
        ArrayList<Chamado> lista2 = new ArrayList();
        resultSet = statement.executeQuery("select * from CHAMADO Where estado_chamado = 1");

        while (resultSet.next()) {

            int idCham = resultSet.getInt(1);
            String descAberturaCham = resultSet.getString(2);
            String prioridadeCham = resultSet.getString(4);
            int idCli = resultSet.getInt(6);

            Chamado chamado = new Chamado(idCham, descAberturaCham, prioridadeCham, idCli);
            lista2.add(chamado);
        }

        return lista2;

    }

    public ArrayList<Chamado> selectChamEncerrados() throws SQLException {
        ArrayList<Chamado> lista3 = new ArrayList();
        resultSet = statement.executeQuery("select * from CHAMADO Where estado_chamado = 2");

        while (resultSet.next()) {

            int idCham = resultSet.getInt(1);
            String descEncerramentoCham = resultSet.getString(5);
            int idCli = resultSet.getInt(6);

            Chamado chamado = new Chamado(idCham, descEncerramentoCham, idCli);
            lista3.add(chamado);
        }

        return lista3;

    }

    public void insertUsuario(Analista analista) {
        String query = "INSERT INTO CLIENTE (nome_usuario ,"
                + "senha_usuario, "
                + "acesso_usuario,"
                + " values "
                + "('" + analista.getNomeUsu() + "',"
                + "'" + analista.getSenhaUsu() + "',"                
                + "'" + analista.getAcessoUsu() + "')";

        try {
            int executeUpdate = statement.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("problema para executar a query");
            ex.printStackTrace();
        }

    }

    public ResultSet autenticarUsuario(Analista analista) throws SQLException {

        String query = "SELECT * FROM ANALISTA WHERE nome_usuario = ? and senha_usuario = ? ";
        pst = connection.prepareStatement(query);
        pst.setString(1, analista.getNomeUsu());
        pst.setString(2, analista.getSenhaUsu());

        resultSet = pst.executeQuery();

        return resultSet;

    }

    public boolean acessoUsuario(Analista analista) throws SQLException {

        String query = "SELECT * FROM ANALISTA WHERE nome_usuario = ? and senha_usuario = ? and acesso_usuario = 1";
        pst = connection.prepareStatement(query);
        pst.setString(1, analista.getNomeUsu());
        pst.setString(2, analista.getSenhaUsu());

        resultSet = pst.executeQuery();

        if (resultSet.next()) {
            return true;
        } else {

            return false;
        }

    }

}
