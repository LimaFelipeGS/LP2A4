package enuns;

public enum HorarioAula {
    MATUTINO_PRIMEIRA("Matutino - 1ª Aula", "7h00"),
    MATUTINO_SEGUNDA("Matutino - 2ª Aula", "7h45"),
    MATUTINO_TERCEIRA("Matutino - 3ª Aula", "8h30"),
    MATUTINO_INTERVALO("Matutino - Intervalo", "9h15"),
    MATUTINO_QUARTA("Matutino - 4ª Aula", "9h30"),
    MATUTINO_QUINTA("Matutino - 5ª Aula", "10h15"),
    MATUTINO_SEXTA("Matutino - 6ª Aula", "11h00"),

    VESPERTINO_PRIMEIRA("Vespertino - 1ª Aula", "13h15"),
    VESPERTINO_SEGUNDA("Vespertino - 2ª Aula", "14h00"),
    VESPERTINO_TERCEIRA("Vespertino - 3ª Aula", "14h45"),
    VESPERTINO_INTERVALO("Vespertino - Intervalo", "15h30"),
    VESPERTINO_QUARTA("Vespertino - 4ª Aula", "15h45"),
    VESPERTINO_QUINTA("Vespertino - 5ª Aula", "16h30"),
    VESPERTINO_SEXTA("Vespertino - 6ª Aula", "17h15"),

    NOTURNO_PRIMEIRA("Noturno - 1ª Aula", "18h50"),
    NOTURNO_SEGUNDA("Noturno - 2ª Aula", "19h35"),
    NOTURNO_TERCEIRA("Noturno - 3ª Aula", "20h20"),
    NOTURNO_INTERVALO("Noturno - Intervalo", "21h05"),
    NOTURNO_QUARTA("Noturno - 4ª Aula", "21h20"),
    NOTURNO_QUINTA("Noturno - 5ª Aula", "22h05");

    private final String descricao;
    private final String horarioInicio;

    HorarioAula(String descricao, String horarioInicio) {
        this.descricao = descricao;
        this.horarioInicio = horarioInicio;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }
}

