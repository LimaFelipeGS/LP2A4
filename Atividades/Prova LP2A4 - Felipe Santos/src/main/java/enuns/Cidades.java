package enuns;

import java.util.ArrayList;
import java.util.List;

public enum Cidades {
    RIO_DE_JANEIRO("Rio de Janeiro", Paises.BRASIL),
    SAO_PAULO("São Paulo", Paises.BRASIL),
    BELO_HORIZONTE("Belo Horizonte", Paises.BRASIL),
    SALVADOR("Salvador", Paises.BRASIL),
    RECIFE("Recife", Paises.BRASIL),

    NOVA_YORK("Nova York", Paises.ESTADOS_UNIDOS),
    LOS_ANGELES("Los Angeles", Paises.ESTADOS_UNIDOS),
    CHICAGO("Chicago", Paises.ESTADOS_UNIDOS),
    MIAMI("Miami", Paises.ESTADOS_UNIDOS),
    LAS_VEGAS("Las Vegas", Paises.ESTADOS_UNIDOS),

    TORONTO("Toronto", Paises.CANADA),
    MONTREAL("Montreal", Paises.CANADA),
    VANCOUVER("Vancouver", Paises.CANADA),
    CALGARY("Calgary", Paises.CANADA),
    OTTAWA("Ottawa", Paises.CANADA),

    PARIS("Paris", Paises.FRANCA),
    MARSELHA("Marselha", Paises.FRANCA),
    LION("Lyon", Paises.FRANCA),
    BORDEAUX("Bordeaux", Paises.FRANCA),
    NICE("Nice", Paises.FRANCA),

    TOKYO("Tóquio", Paises.JAPAO),
    OSAKA("Osaka", Paises.JAPAO),
    QUIOTO("Quioto", Paises.JAPAO),
    HIROSHIMA("Hiroshima", Paises.JAPAO),
    NAGOYA("Nagoya", Paises.JAPAO);

    private String nome;
    private Paises pais;

    Cidades(String nome, Paises pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public Paises getPais() {
        return pais;
    }

    public static List<Cidades> getCidadesPorPais(Paises paisDesejado) {
        List<Cidades> cidadesPorPais = new ArrayList<>();
        for (Cidades cidade : Cidades.values()) {
            if (cidade.getPais() == paisDesejado) {
                cidadesPorPais.add(cidade);
            }
        }
        return cidadesPorPais;
    }
}
