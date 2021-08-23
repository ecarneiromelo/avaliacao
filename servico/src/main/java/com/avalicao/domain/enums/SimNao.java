package com.avalicao.domain.enums;

public enum SimNao {

    S("S", "Sim"),
    N("N", "Não");

    private String codigo;
    private String descricao;

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    SimNao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

}

