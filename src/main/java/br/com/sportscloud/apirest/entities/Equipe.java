package br.com.sportscloud.apirest.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TB_EQUIPE")
public class Equipe implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long atleta;
    private long tecnico;

    @OneToMany(mappedBy = "equipe")
    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public Equipe() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAtleta() {
        return atleta;
    }

    public void setAtleta(long atleta) {
        this.atleta = atleta;
    }

    public long getTecnico() {
        return tecnico;
    }

    public void setTecnico(long tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipe equipe = (Equipe) o;
        return id == equipe.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
