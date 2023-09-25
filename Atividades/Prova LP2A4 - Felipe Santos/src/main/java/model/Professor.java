package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "professores")
@Entity(name = "professores")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String genero;
    @Column
    private String email;
    @Column
    private String area;
    @Column
    private Date dataNascimento;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    @Column
    private String jornada;
    @Column
    private String cpf;
    @Column
    private String sobrenome;
    @Column
    private String emailSecundario;
    @Column
    private String nome;

    public int getId() {
        return id;
    }

    public String getGenero() {
        return genero;
    }

    public String getEmail() {
        return email;
    }

    public String getArea() {
        return area;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getJornada() {
        return jornada;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmailSecundario() {
        return emailSecundario;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setEmailSecundario(String emailSecundario) {
        this.emailSecundario = emailSecundario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
