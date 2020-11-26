package br.com.fluxocaixa.dao;

import br.com.fluxocaixa.banco.UtilBD;
import br.com.fluxocaixa.model.Lancamento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LancamentoDAO implements InterfaceDAO<Lancamento> {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat sdfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    @Override
    public void inserir(Lancamento lancamento) {
        try {
            String query = "INSERT INTO lancamento VALUES (null, '" + lancamento.getDescricao() + "', '" + lancamento.getValor() + "', '"
                    + lancamento.getMovimentacao() + "', " + lancamento.getIdTipoLancamento() + ", " + lancamento.getIdTipoPagamento() + ", '"+sdf.format(lancamento.getDtLancamento()) + "', " + lancamento.getIdUsuario()+" )";
            UtilBD.alterarBD(query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Não foi possível inserir a pessoa no banco!");
        }
    }

    public void deletarr(Integer id) {
        try {
            String query = "DELETE FROM lancamento WHERE idLancamento = " + id;
            UtilBD.alterarBD(query);
        } catch (SQLException e) {
            System.err.println("Não foi possível remover a pessoa no banco!");
        }
    }

    @Override
    public void atualizar(Lancamento lancamento) {
        try {
            String query = "UPDATE lancamento SET descricao = '" + lancamento.getDescricao() + "', valor = '" + lancamento.getValor()
                    + "', movimentacao = " + lancamento.getMovimentacao() + ", idTipoLancamento = " + lancamento.getIdTipoLancamento() + ", idTipoPagamento = "+ lancamento.getIdTipoPagamento() 
                    + ", dtLancamento = " + sdf.format(lancamento.getDtLancamento()) + ", idUsuario = " + lancamento.getIdUsuario()+ " WHERE lancamento.idLancamento = "
                    + lancamento.getIdLancamento();
            UtilBD.alterarBD(query);
        } catch (SQLException e) {
            System.err.println("Não foi possível atualizar os dados da pessoa no banco!");
        }
    }

    @Override
    public List<Lancamento> buscar() {
        try {
            Connection bd = UtilBD.getConexao();
            Statement stm = bd.createStatement();
            String query = "SELECT * FROM lancamento";

            try (ResultSet rs = stm.executeQuery(query)) {

                List<Lancamento> lancamentos = new ArrayList<Lancamento>();

                while (rs.next()) {
                    
                    String data = rs.getString("dtLancamento");
                    
                    Lancamento lancamento = new Lancamento(
                            rs.getInt("idLancamento"),
                            rs.getString("descricao"),
                            rs.getDouble("valor"),
                            rs.getString("movimentacao"),
                            rs.getInt("idTipoLancamento"),
                            rs.getInt("idTipoPagamento"),
                            sdf.parse(data),
                            rs.getInt("idUsuario")
                    );
                    
                    lancamentos.add(lancamento);
                }
                
                return lancamentos;

            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println("Falha ao tentar obter o conjunto resultado!");
            } catch (ParseException ex) {
                Logger.getLogger(LancamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException e) {
            System.err.println("Não foi possível buscar os dados do banco!");
        }
        return null;
    }

    @Override
    public Lancamento buscarId(Integer id) {
        try {
            Connection bd = UtilBD.getConexao();
            Statement stm = bd.createStatement();
            String query = "SELECT * FROM lancamento WHERE idLancamento = " + id;

            try (ResultSet rs = stm.executeQuery(query)) {

                List<Lancamento> lancamentos = new ArrayList<Lancamento>();

                while (rs.next()) {
                    Lancamento lancamento = new Lancamento(
                            rs.getInt("idLancamento"),
                            rs.getString("descricao"),
                            rs.getDouble("valor"),
                            rs.getString("movimentacao"),
                            rs.getInt("idTipoLancamento"),
                            rs.getInt("idTipoPagamento"),
                            rs.getDate("dtLancamento"),
                            rs.getInt("idUsuario")
                    );
                    
                    lancamentos.add(lancamento);
                }
                
                if(lancamentos != null && !lancamentos.isEmpty()){
                    return lancamentos.get(0);
                }

            } catch (SQLException e) {
                System.err.println("Falha ao tentar obter o conjunto resultado!");
            }

        } catch (SQLException e) {
            System.err.println("Não foi possível buscar os dados do banco!");
        }
        return null;
    }
    
    public List<Lancamento> buscarData(Date inicio, Date fim) {
        try {
            Connection bd = UtilBD.getConexao();
            Statement stm = bd.createStatement();
            String query = "SELECT * FROM lancamento WHERE dtLancamento between '"+sdfd.format(inicio)+"' and '"+sdfd.format(fim)+"' and idUsuario = "+new Integer(System.getProperty("idUsuario"));

            try (ResultSet rs = stm.executeQuery(query)) {

                List<Lancamento> lancamentos = new ArrayList<Lancamento>();

                while (rs.next()) {
                    
                    String data = rs.getString("dtLancamento");
                    
                    Lancamento lancamento = new Lancamento(
                            rs.getInt("idLancamento"),
                            rs.getString("descricao"),
                            rs.getDouble("valor"),
                            rs.getString("movimentacao"),
                            rs.getInt("idTipoLancamento"),
                            rs.getInt("idTipoPagamento"),
                            sdf.parse(data),
                            rs.getInt("idUsuario")
                    );
                    
                    lancamentos.add(lancamento);
                }
                
                return lancamentos;

            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println("Falha ao tentar obter o conjunto resultado!");
            } catch (ParseException ex) {
                Logger.getLogger(LancamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException e) {
            System.err.println("Não foi possível buscar os dados do banco!");
        }
        return null;
    }

    @Override
    public void deletar(Lancamento referencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
