package model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "materias")
@Entity(name = "materias")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String endereco;
    @Column
    private String pais;
    @Column
    private String estado;
    @Column
    private String cep;

    public Endereco(String endereco, String pais, String estado, String cep) {
        this.endereco = endereco;
        this.pais = pais;
        this.estado = estado;
        this.cep = cep;
    }

    public int getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getEstado() {
        return estado;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getPais() {
        return pais;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
