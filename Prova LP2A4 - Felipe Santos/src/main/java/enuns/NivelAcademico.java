package enuns;

public enum NivelAcademico {
    GRADUACAO("Graduação"),
    LICENCIATURA("Licenciatura"),
    MESTRADO("Mestrado"),
    DOUTORADO("Doutorado"),
    POS_DOUTORADO("Pós-Doutorado"),
    LIVRE_DOCENCIA("Livre-Docência");

    private final String descricao;

    NivelAcademico(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

