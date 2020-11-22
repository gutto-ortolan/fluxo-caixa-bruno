package br.com.fluxocaixa.model;

public class TipoPagamento {
    
    private Integer idTipoPagamento;
    private String descricao;

    public TipoPagamento(Integer idTipoPagamento, String descricao) {
        this.idTipoPagamento = idTipoPagamento;
        this.descricao = descricao;
    }

    public TipoPagamento(String descricao) {
        this.descricao = descricao;
    }
    
    public Integer getIdTipoPagamento() {
        return idTipoPagamento;
    }

    public void setIdTipoPagamento(Integer idTipoPagamento) {
        this.idTipoPagamento = idTipoPagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return getDescricao();
    }

}
