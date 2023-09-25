package enuns;

public enum Areas {
    ARTE("Artes"),
    BIOLOGIA("Biologia"),
    EDUCAÇÃO_FISICA("Educação Física"),
    ELETRICA("Elétrica"),
    FILOSOFIA("Filosofia"),
    FISICA("Física"),
    HISTORIA("História"),
    INFORMATICA("Informática"),
    MATEMATICA("Matemática"),
    MECANICA("Mecânica"),
    PORTUGUES("Português"),
    QUIMICA("Química");

    private final String descricao;

    Areas(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

