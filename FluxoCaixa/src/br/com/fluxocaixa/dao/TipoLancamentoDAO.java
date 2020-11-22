package br.com.fluxocaixa.dao;

import br.com.fluxocaixa.banco.UtilBD;
import br.com.fluxocaixa.model.TipoLancamento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TipoLancamentoDAO implements InterfaceDAO<TipoLancamento> {

    @Override
    public void inserir(TipoLancamento tipoLancamento) {
        try {
            String query = "INSERT INTO tipolancamento VALUES (null, '" + tipoLancamento.getDescricao() + "', '" + tipoLancamento.getMovimentacao() + "' )";
            UtilBD.alterarBD(query);
        } catch (SQLException e) {
            System.err.println("Não foi possível inserir a pessoa no banco!");
        }
    }

    @Override
    public void deletar(TipoLancamento tipoLancamento) {
        try {
            String query = "DELETE FROM tipolancamento WHERE idTipoLancamento = " + tipoLancamento.getIdTipoLancamento();
            UtilBD.alterarBD(query);
        } catch (SQLException e) {
            System.err.println("Não foi possível remover a pessoa no banco!");
        }
    }

    @Override
    public void atualizar(TipoLancamento tipoLancamento) {
        try {
            String query = "UPDATE tipolancamento SET descricao = '" + tipoLancamento.getDescricao() + "', movimentacao = '" + tipoLancamento.getMovimentacao()
                    + "' WHERE idTipoLancamento = "
                    + tipoLancamento.getIdTipoLancamento();
            UtilBD.alterarBD(query);
        } catch (SQLException e) {
            System.err.println("Não foi possível atualizar os dados da pessoa no banco!");
        }
    }

    @Override
    public List<TipoLancamento> buscar() {
        try {
            Connection bd = UtilBD.getConexao();
            Statement stm = bd.createStatement();
            String query = "SELECT * FROM tipolancamento";

            try (ResultSet rs = stm.executeQuery(query)) {

                List<TipoLancamento> tipoLancamentos = new ArrayList<TipoLancamento>();

                while (rs.next()) {
                    TipoLancamento tipoLancamento = new TipoLancamento(
                            rs.getInt("idTipoLancamento"),
                            rs.getString("descricao"),
                            rs.getString("movimentacao")
                    );
                    tipoLancamentos.add(tipoLancamento);
                }

                return tipoLancamentos;

            } catch (SQLException e) {
                System.err.println("Falha ao tentar obter o conjunto resultado!");
            }

        } catch (SQLException e) {
            System.err.println("Não foi possível buscar os dados do banco!");
        }
        return null;
    }

    @Override
    public TipoLancamento buscarId(Integer id) {
        try {
            Connection bd = UtilBD.getConexao();
            Statement stm = bd.createStatement();
            String query = "SELECT * FROM tipolancamento where idTipoLancamento = " + id;

            try (ResultSet rs = stm.executeQuery(query)) {

                List<TipoLancamento> tipoLancamentos = new ArrayList<TipoLancamento>();

                while (rs.next()) {
                    TipoLancamento tipoLancamento = new TipoLancamento(
                            rs.getInt("idTipoLancamento"),
                            rs.getString("descricao"),
                            rs.getString("movimentacao")
                    );
                    tipoLancamentos.add(tipoLancamento);
                }

                if(tipoLancamentos != null && !tipoLancamentos.isEmpty()){
                    return tipoLancamentos.get(0);
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
