package br.com.fluxocaixa.model;

public class Usuario {
    
    private Integer idUsuario;
    private String login;
    private String senha;
    private Integer idPessoa;

    public Usuario(Integer idUsuario, String login, String senha, Integer idPessoa) {
        this.idUsuario = idUsuario;
        this.login = login;
        this.senha = senha;
        this.idPessoa = idPessoa;
    }

    public Usuario(String login, String senha, Integer idPessoa) {
        this.login = login;
        this.senha = senha;
        this.idPessoa = idPessoa;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }
    
    
    
}
