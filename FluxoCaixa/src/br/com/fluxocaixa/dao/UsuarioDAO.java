package br.com.fluxocaixa.dao;

import br.com.fluxocaixa.banco.UtilBD;
import br.com.fluxocaixa.model.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements InterfaceDAO<Usuario> {

    @Override
    public void inserir(Usuario usuario) {
        try {
            String query = "INSERT INTO usuario VALUES (null, '" + usuario.getLogin() + "', '" + usuario.getSenha() + "', "
                    + usuario.getIdPessoa() + ")";
            UtilBD.alterarBD(query);
        } catch (SQLException e) {
            System.err.println("Não foi possível inserir a pessoa no banco!");
        }
    }

    @Override
    public void deletar(Usuario usuario) {
        try {
            String query = "DELETE FROM usuario WHERE idUsuario = " + usuario.getIdUsuario();
            UtilBD.alterarBD(query);
        } catch (SQLException e) {
            System.err.println("Não foi possível remover a pessoa no banco!");
        }
    }

    @Override
    public void atualizar(Usuario usuario) {
        try {
            String query = "UPDATE usuario SET login = '" + usuario.getLogin() + "', senha = '" + usuario.getSenha()
                    + "', idPessoa = " + usuario.getIdPessoa() + " WHERE usuario.idUsuario = "
                    + usuario.getIdUsuario();
            UtilBD.alterarBD(query);
        } catch (SQLException e) {
            System.err.println("Não foi possível atualizar os dados da pessoa no banco!");
        }
    }

    @Override
    public List<Usuario> buscar() {
        try {
            Connection bd = UtilBD.getConexao();
            Statement stm = bd.createStatement();
            String query = "SELECT * FROM usuario";

            try (ResultSet rs = stm.executeQuery(query)) {

                List<Usuario> usuarios = new ArrayList<Usuario>();

                while (rs.next()) {
                    Usuario usuario = new Usuario(
                            rs.getInt("idUsuario"),
                            rs.getString("login"),
                            rs.getString("senha"),
                            rs.getInt("idPessoa")
                    );
                    usuarios.add(usuario);
                }

                return usuarios;

            } catch (SQLException e) {
                System.err.println("Falha ao tentar obter o conjunto resultado!");
            }

        } catch (SQLException e) {
            System.err.println("Não foi possível buscar os dados do banco!");
        }
        return null;
    }
    
    public Usuario buscarUsuario(String nome, String senha){
        try {
            Connection bd = UtilBD.getConexao();
            Statement stm = bd.createStatement();
            String query = "SELECT * FROM usuario where login = '"+nome+"' and senha = '"+senha+"' ";

            try (ResultSet rs = stm.executeQuery(query)) {

                List<Usuario> usuarios = new ArrayList<Usuario>();

                while (rs.next()) {
                    Usuario usuario = new Usuario(
                            rs.getInt("idUsuario"),
                            rs.getString("login"),
                            rs.getString("senha"),
                            rs.getInt("idPessoa")
                    );
                    usuarios.add(usuario);
                }

                if(usuarios != null && !usuarios.isEmpty()){
                    return usuarios.get(0);
                }
                
            } catch (SQLException e) {
                System.err.println("Falha ao tentar obter o conjunto resultado!");
            }

        } catch (SQLException e) {
            System.err.println("Não foi possível buscar os dados do banco!");
        }
        return null;
    }

    @Override
    public Usuario buscarId(Integer id) {
        try {
            Connection bd = UtilBD.getConexao();
            Statement stm = bd.createStatement();
            String query = "SELECT * FROM usuario where idUsuario = "+ id;

            try (ResultSet rs = stm.executeQuery(query)) {

                List<Usuario> usuarios = new ArrayList<Usuario>();

                while (rs.next()) {
                    Usuario usuario = new Usuario(
                            rs.getInt("idUsuario"),
                            rs.getString("login"),
                            rs.getString("senha"),
                            rs.getInt("idPessoa")
                    );
                    usuarios.add(usuario);
                }

                if(usuarios != null && !usuarios.isEmpty()){
                    return usuarios.get(0);
                }
                
            } catch (SQLException e) {
                System.err.println("Falha ao tentar obter o conjunto resultado!");
            }

        } catch (SQLException e) {
            System.err.println("Não foi possível buscar os dados do banco!");
        }
        return null;
    }

}
