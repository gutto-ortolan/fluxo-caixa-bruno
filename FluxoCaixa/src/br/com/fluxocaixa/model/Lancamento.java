package br.com.fluxocaixa.model;

import java.util.Date;

public class Lancamento {
    
    private Integer idLancamento;
    private String descricao;
    private Double valor;
    private String movimentacao;
    private Integer idTipoLancamento;
    private Integer idTipoPagamento;
    private Date dtLancamento;
    private Integer idUsuario;

    public Lancamento(String descricao, Double valor, String movimentacao, Integer idTipoLancamento, Integer idTipoPagamento, Date dtLancamento, Integer idUsuario) {
        this.descricao = descricao;
        this.valor = valor;
        this.movimentacao = movimentacao;
        this.idTipoLancamento = idTipoLancamento;
        this.idTipoPagamento = idTipoPagamento;
        this.dtLancamento = dtLancamento;
        this.idUsuario = idUsuario;
    }

    public Lancamento(Integer idLancamento, String descricao, Double valor, String movimentacao, Integer idTipoLancamento, Integer idTipoPagamento, Date dtLancamento, Integer idUsuario) {
        this.idLancamento = idLancamento;
        this.descricao = descricao;
        this.valor = valor;
        this.movimentacao = movimentacao;
        this.idTipoLancamento = idTipoLancamento;
        this.idTipoPagamento = idTipoPagamento;
        this.dtLancamento = dtLancamento;
        this.idUsuario = idUsuario;
    }
    
    public Integer getIdLancamento() {
        return idLancamento;
    }

    public void setIdLancamento(Integer idLancamento) {
        this.idLancamento = idLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(String movimentacao) {
        this.movimentacao = movimentacao;
    }

    public Integer getIdTipoLancamento() {
        return idTipoLancamento;
    }

    public void setIdTipoLancamento(Integer idTipoLancamento) {
        this.idTipoLancamento = idTipoLancamento;
    }

    public Integer getIdTipoPagamento() {
        return idTipoPagamento;
    }

    public void setIdTipoPagamento(Integer idTipoPagamento) {
        this.idTipoPagamento = idTipoPagamento;
    }

    public Date getDtLancamento() {
        return dtLancamento;
    }

    public void setDtLancamento(Date dtLancamento) {
        this.dtLancamento = dtLancamento;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

}
