package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "materias")
@Entity(name = "materias")
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private Double nota;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "materia_id")
    private Materia materia;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    public Nota(Double nota, Materia materia, Aluno aluno) {
        this.nota = nota;
        this.materia = materia;
        this.aluno = aluno;
    }

    public int getId() {
        return id;
    }

    public Double getNota() {
        return nota;
    }

    public Materia getMateria() {
        return materia;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
