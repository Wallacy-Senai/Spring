package webapp.escola_xyz_b.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Aluno implements Serializable {
    // Atributos
    @Id
    private String cpf;
    private String nome;
    private String email;
    private String senha;

    @OneToOne
    private Disciplina disciplina; // Associando o aluno a uma disciplina

    // Métodos getters e setters

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
