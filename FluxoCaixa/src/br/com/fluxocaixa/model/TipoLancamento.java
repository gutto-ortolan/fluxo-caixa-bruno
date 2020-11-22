package br.com.fluxocaixa.model;

public class TipoLancamento {
    
    private Integer idTipoLancamento;
    private String descricao;
    private String movimentacao;

    public TipoLancamento(Integer idTipoLancamento, String descricao, String movimentacao) {
        this.idTipoLancamento = idTipoLancamento;
        this.descricao = descricao;
        this.movimentacao = movimentacao;
    }

    public TipoLancamento(String descricao, String movimentacao) {
        this.descricao = descricao;
        this.movimentacao = movimentacao;
    }
    
    public Integer getIdTipoLancamento() {
        return idTipoLancamento;
    }

    public void setIdTipoLancamento(Integer idTipoLancamento) {
        this.idTipoLancamento = idTipoLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(String movimentacao) {
        this.movimentacao = movimentacao;
    }
    
    @Override
    public String toString() {
        return getDescricao();
    }
    
}
