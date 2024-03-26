package crudescola.crud_escola.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PreCadAdm implements Serializable {

    @Id
    private String cpf;
    private String nomme;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNomme() {
        return nomme;
    }
    public void setNomme(String nomme) {
        this.nomme = nomme;
    }
}
