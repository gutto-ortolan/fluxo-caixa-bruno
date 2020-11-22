package br.com.fluxocaixa.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UtilBD {

    private static Connection conexao;

    private static void abrirConexao() {
        try {
            Class.forName("org.sqlite.JDBC");
            conexao = DriverManager.getConnection("jdbc:sqlite:banco.sqlite");
        } catch (SQLException e1) {
            System.err.println("Não foi possível abrir a conexão com o banco!");
        } catch (ClassNotFoundException e2) {
            System.err.println("Ocorreu uma falha ao utilizar o driver!");
        }
    }

    public static void fecharConexao() {
        if (conexao == null) {
            return;
        }
        try {
            if (!conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException e) {
            System.err.println("Não foi possível fechar a conexão com o banco!");
        }
    }

    public static Connection getConexao() {
        try {
            if (conexao == null) {
                abrirConexao();
            }
            if (conexao.isClosed()) {
                abrirConexao();
            }
        } catch (SQLException e) {
            System.err.println("Não foi possível abrir a conexão com o banco!!");
        }
        return conexao;
    }

    public static void alterarBD(String query) throws SQLException {
        Connection bd = UtilBD.getConexao();
        Statement stm = bd.createStatement();
        stm.executeUpdate(query);
        stm.close();
    }
}
