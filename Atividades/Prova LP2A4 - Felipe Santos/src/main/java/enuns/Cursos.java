package enuns;

public enum Cursos {
    TECNICO_ADMINISTRACAO_EJA("Técnico em Administração Integrado ao Ensino Médio - Modalidade EJA"),
    TECNICO_DESENVOLVIMENTO_SISTEMAS("Técnico em Desenvolvimento de Sistemas Integrado ao Ensino Médio"),
    TECNICO_ELETRONICA("Técnico em Eletrônica Integrado ao Ensino Médio"),
    TECNICO_ELETROTECNICA_EM("Técnico em Eletrotécnica Integrado ao Ensino Médio"),
    TECNICO_INFORMATICA("Técnico em Informática Integrado ao Ensino Médio"),
    TECNICO_MECANICA_EM("Técnico em Mecânica Integrado ao Ensino Médio"),
    TECNICO_QUALIDADE_EJA("Técnico em Qualidade Integrado ao Ensino Médio - Modalidade EJA"),
    TECNICO_SISTEMAS_ENERGIA_RENOVAVEIS("Técnico em Sistemas de Energia Renováveis Integrado ao Ensino Médio"),
    TECNICO_TELECOMUNICACOES_EM("Técnico em Telecomunicações Integrado ao Ensino Médio"),
    TECNICO_AUTOMACAO_INDUSTRIAL("Técnico em Automação Industrial"),
    TECNICO_DESENVOLVIMENTO_COMUNITARIO("Técnico em Desenvolvimento Comunitário"),
    TECNICO_EDIFICACOES("Técnico em Edificações"),
    TECNICO_ELETROTECNICA("Técnico em Eletrotécnica"),
    TECNICO_MECANICA("Técnico em Mecânica"),
    TECNICO_SERVICOS_RESTAURANTE_BAR("Técnico em Serviços de Restaurante e Bar"),
    TECNICO_TELECOMUNICACOES("Técnico em Telecomunicações"),
    ARQUITETURA_URBANISMO("Arquitetura e Urbanismo"),
    ENGENHARIA_CIVIL("Engenharia Civil"),
    ENGENHARIA_CONTROLE_AUTOMACAO("Engenharia de Controle e Automação"),
    ENGENHARIA_PRODUCAO("Engenharia de Produção"),
    ENGENHARIA_ELETRICA("Engenharia Elétrica"),
    ENGENHARIA_ELETRONICA("Engenharia Eletrônica"),
    ENGENHARIA_MECANICA("Engenharia Mecânica"),
    SISTEMAS_INFORMACAO("Sistemas de Informação"),
    LICENCIATURA_CIENCIAS_BIOLOGICAS("Licenciatura em Ciências Biológicas"),
    LICENCIATURA_FISICA("Licenciatura em Física"),
    LICENCIATURA_GEOGRAFIA("Licenciatura em Geografia"),
    LICENCIATURA_LETRAS("Licenciatura em Letras"),
    LICENCIATURA_MATEMATICA("Licenciatura em Matemática"),
    LICENCIATURA_QUIMICA("Licenciatura em Química"),
    TECNOLOGIA_ANALISE_DESENVOLVIMENTO_SISTEMAS("Superior de Tecnologia em Análise e Desenvolvimento de Sistemas"),
    TECNOLOGIA_AUTOMACAO_INDUSTRIAL("Superior de Tecnologia em Automação Industrial"),
    TECNOLOGIA_GESTAO_PRODUCAO_INDUSTRIAL("Superior de Tecnologia em Gestão da Produção Industrial"),
    TECNOLOGIA_GESTAO_TURISMO("Superior de Tecnologia em Gestão de Turismo"),
    TECNOLOGIA_SISTEMAS_ELETRICOS("Superior de Tecnologia em Sistemas Elétricos");

    private final String descricao;

    Cursos(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

