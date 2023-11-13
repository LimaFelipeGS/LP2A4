package enuns;

public enum Paises {
    BRASIL("Brasil"),
    ESTADOS_UNIDOS("Estados Unidos"),
    CANADA("Canadá"),
    FRANCA("França"),
    JAPAO("Japão");

    private String nome;

    Paises(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
