package br.com.sportscloud.apirest.entities;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable {

    private long id;
    private String email;
    private String senha;
    private String nome;
    private String sexo;
    private String funcao;

    public Usuario() {
    }

    public Usuario(long id, String email, String senha, String nome, String sexo, String funcao) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.sexo = sexo;
        this.funcao = funcao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
