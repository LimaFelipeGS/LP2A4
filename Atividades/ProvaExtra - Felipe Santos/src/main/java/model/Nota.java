package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Nota")
@Entity(name = "Nota")
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private Double nota;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    public Nota(Double nota, Aluno aluno) {
        this.nota = nota;
        this.aluno = aluno;
    }

    public int getId() {
        return id;
    }

    public Double getNota() {
        return nota;
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

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
