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
@Table(name = "Aluno")
@Entity(name = "Aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nome;
    @Column
    private String sobrenome;
    @Column
    private String genero;
    @Column
    private String cpf;
    @Column
    private Date dataNascimento;
    @Column
    private String email;
    @Column
    private String emailSecundario;
    @Column
    private String curso;
    @Column
    private int semestreIngresso;
    @Column
    private int anoIngresso;
    @Column
    private String situacao;
    @Column
    private Double ira = (double) 0;
    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Nota> notas;

    @Column
    private Double somaNotas = (double) 0;


    public Aluno(String nome, String sobrenome, String genero, String cpf, Date dataNascimento, String email, String emailSecundario, String curso, int semestreIngresso, int anoIngresso, String situacao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.emailSecundario = emailSecundario;
        this.curso = curso;
        this.semestreIngresso = semestreIngresso;
        this.anoIngresso = anoIngresso;
        this.situacao = situacao;
    }

    public Double calculoIra(Nota nota) {

        somaNotas = somaNotas + nota.getNota();

        ira = somaNotas / notas.size();

        return ira;
    }

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

    public String getEmail() {
        return email;
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

    public void setEmail(String email) {
        this.email = email;
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
