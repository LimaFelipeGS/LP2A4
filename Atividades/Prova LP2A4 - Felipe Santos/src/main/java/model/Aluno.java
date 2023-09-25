package model;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alunos")
@Entity(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String curso;
    @Column
    private String cpf;
    @Column
    private String genero;
    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Nota> notas;
    @Column
    private Date dataNascimento;
    @Column
    private int anoIngresso;
    @Column
    private String sobrenome;
    @Column
    private String emailSecundario;
    @Column
    private String emial;
    @Column
    private String situacao;
    @Column
    private Double ira;
    @Column
    private String nome;
    @Column
    private int semestreIngresso;

    public String getCurso() {
        return curso;
    }

    public String getCpf() {
        return cpf;
    }

    public String getGenero() {
        return genero;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmailSecundario() {
        return emailSecundario;
    }

    public int getId() {
        return id;
    }

    public String getEmial() {
        return emial;
    }

    public String getSituacao() {
        return situacao;
    }

    public Double getIra() {
        return ira;
    }

    public String getNome() {
        return nome;
    }

    public int getSemestreIngresso() {
        return semestreIngresso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setEmailSecundario(String emailSecundario) {
        this.emailSecundario = emailSecundario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setIra(Double ira) {
        this.ira = ira;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSemestreIngresso(int semestreIngresso) {
        this.semestreIngresso = semestreIngresso;
    }
}
