package br.com.fluxocaixa.dao;

import br.com.fluxocaixa.banco.UtilBD;
import br.com.fluxocaixa.model.TipoPagamento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TipoPagamentoDAO implements InterfaceDAO<TipoPagamento> {

    @Override
    public void inserir(TipoPagamento tipoPagamento) {
        try {
            String query = "INSERT INTO tipopagamento VALUES (null, '" + tipoPagamento.getDescricao() + "' )";
            UtilBD.alterarBD(query);
        } catch (SQLException e) {
            System.err.println("Não foi possível inserir a pessoa no banco!");
        }
    }

    @Override
    public void deletar(TipoPagamento tipoPagamento) {
        try {
            String query = "DELETE FROM tipopagamento WHERE idTipoPagamento = " + tipoPagamento.getIdTipoPagamento();
            UtilBD.alterarBD(query);
        } catch (SQLException e) {
            System.err.println("Não foi possível remover a pessoa no banco!");
        }
    }

    @Override
    public void atualizar(TipoPagamento tipoPagamento) {
        try {
            String query = "UPDATE tipopagamento SET descricao = '" + tipoPagamento.getDescricao() + "' WHERE idTipoPagamento = "
                    + tipoPagamento.getIdTipoPagamento();
            UtilBD.alterarBD(query);
        } catch (SQLException e) {
            System.err.println("Não foi possível atualizar os dados da pessoa no banco!");
        }
    }

    @Override
    public List<TipoPagamento> buscar() {
        try {
            Connection bd = UtilBD.getConexao();
            Statement stm = bd.createStatement();
            String query = "SELECT * FROM tipopagamento";

            try (ResultSet rs = stm.executeQuery(query)) {

                List<TipoPagamento> tipoPagamentos = new ArrayList<TipoPagamento>();

                while (rs.next()) {
                    TipoPagamento tipoPagamento = new TipoPagamento(
                            rs.getInt("idTipoPagamento"),
                            rs.getString("descricao")
                    );
                    tipoPagamentos.add(tipoPagamento);
                }

                return tipoPagamentos;

            } catch (SQLException e) {
                System.err.println("Falha ao tentar obter o conjunto resultado!");
            }

        } catch (SQLException e) {
            System.err.println("Não foi possível buscar os dados do banco!");
        }
        return null;
    }

    @Override
    public TipoPagamento buscarId(Integer id) {
         try {
            Connection bd = UtilBD.getConexao();
            Statement stm = bd.createStatement();
            String query = "SELECT * FROM tipopagamento where idTipoPagamento = " + id;

            try (ResultSet rs = stm.executeQuery(query)) {

                List<TipoPagamento> tipoPagamentos = new ArrayList<TipoPagamento>();

                while (rs.next()) {
                    TipoPagamento tipoPagamento = new TipoPagamento(
                            rs.getInt("idTipoPagamento"),
                            rs.getString("descricao")
                    );
                    tipoPagamentos.add(tipoPagamento);
                }

                if(tipoPagamentos != null && !tipoPagamentos.isEmpty()){
                    return tipoPagamentos.get(0);
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
