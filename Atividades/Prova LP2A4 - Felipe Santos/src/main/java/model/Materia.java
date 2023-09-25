package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "materias")
@Entity(name = "materias")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "professor_id")
    private Professor professor;
    @Column
    private String horario;
    @Column
    private int ano;
    @Column
    private String curso;
    @Column
    private String dia;
    @Column
    private int semestre;
    @OneToMany(mappedBy = "materia",cascade = CascadeType.ALL)
    private List<Nota> notas;
    @Column
    private String nome;

    public Professor getProfessor() {
        return professor;
    }

    public String getHorario() {
        return horario;
    }

    public int getAno() {
        return ano;
    }

    public String getCurso() {
        return curso;
    }

    public int getId() {
        return id;
    }

    public String getDia() {
        return dia;
    }

    public int getSemestre() {
        return semestre;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public String getNome() {
        return nome;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
