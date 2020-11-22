package br.com.fluxocaixa.dao;

import br.com.fluxocaixa.banco.UtilBD;
import br.com.fluxocaixa.model.Pessoa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO implements InterfaceDAO<Pessoa> {

    @Override
    public void inserir(Pessoa pessoa) {
        try {
            String query = "INSERT INTO pessoa VALUES (null, '" + pessoa.getNome() + "', '" + pessoa.getSobrenome() + "', "
                    + pessoa.getCpf() + " )";
            UtilBD.alterarBD(query);
        } catch (SQLException e) {
            System.err.println("Não foi possível inserir a pessoa no banco!");
        }
    }

    @Override
    public void deletar(Pessoa pessoa) {
        try {
            String query = "DELETE FROM pessoa WHERE idPessoa = " + pessoa.getIdPessoa();
            UtilBD.alterarBD(query);
        } catch (SQLException e) {
            System.err.println("Não foi possível remover a pessoa no banco!");
        }
    }

    @Override
    public void atualizar(Pessoa pessoa) {
        try {
            String query = "UPDATE pessoa SET nome = '" + pessoa.getNome() + "', sobrenome = '" + pessoa.getSobrenome()
                    + "', cpf = " + pessoa.getCpf() + ", WHERE pessoa.idPessoa = "
                    + pessoa.getIdPessoa();
            UtilBD.alterarBD(query);
        } catch (SQLException e) {
            System.err.println("Não foi possível atualizar os dados da pessoa no banco!");
        }
    }

    @Override
    public List<Pessoa> buscar() {
        try {
            Connection bd = UtilBD.getConexao();
            Statement stm = bd.createStatement();
            String query = "SELECT * FROM pessoa";

            try (ResultSet rs = stm.executeQuery(query)) {

                List<Pessoa> pessoas = new ArrayList<Pessoa>();

                while (rs.next()) {
                    Pessoa pessoa = new Pessoa(
                            rs.getInt("idPessoa"),
                            rs.getString("nome"),
                            rs.getString("sobrenome"),
                            rs.getString("cpf")
                    );
                    pessoas.add(pessoa);
                }

                return pessoas;

            } catch (SQLException e) {
                System.err.println("Falha ao tentar obter o conjunto resultado!");
            }

        } catch (SQLException e) {
            System.err.println("Não foi possível buscar os dados do banco!");
        }
        return null;
    }

    @Override
    public Pessoa buscarId(Integer id) {
        try {
            Connection bd = UtilBD.getConexao();
            Statement stm = bd.createStatement();
            String query = "SELECT * FROM pessoa where idPessoa = " + id;

            try (ResultSet rs = stm.executeQuery(query)) {

                List<Pessoa> pessoas = new ArrayList<Pessoa>();

                while (rs.next()) {
                    Pessoa pessoa = new Pessoa(
                            rs.getInt("idPessoa"),
                            rs.getString("nome"),
                            rs.getString("sobrenome"),
                            rs.getString("cpf")
                    );
                    pessoas.add(pessoa);
                }

                if (pessoas != null && !pessoas.isEmpty()) {
                    return pessoas.get(0);
                }

            } catch (SQLException e) {
                System.err.println("Falha ao tentar obter o conjunto resultado!");
            }

        } catch (SQLException e) {
            System.err.println("Não foi possível buscar os dados do banco!");
        }
        return null;
    }

    public Pessoa getUltimaPessoaGravada() {
        try {
            Connection bd = UtilBD.getConexao();
            Statement stm = bd.createStatement();
            String query = "SELECT * FROM pessoa where idPessoa = (select max(idPessoa) from pessoa)";

            try (ResultSet rs = stm.executeQuery(query)) {

                List<Pessoa> pessoas = new ArrayList<Pessoa>();

                while (rs.next()) {
                    Pessoa pessoa = new Pessoa(
                            rs.getInt("idPessoa"),
                            rs.getString("nome"),
                            rs.getString("sobrenome"),
                            rs.getString("cpf")
                    );
                    pessoas.add(pessoa);
                }

                if (pessoas != null && !pessoas.isEmpty()) {
                    return pessoas.get(0);
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
