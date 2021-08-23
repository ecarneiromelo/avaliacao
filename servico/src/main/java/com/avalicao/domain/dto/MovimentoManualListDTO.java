package com.avalicao.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class MovimentoManualListDTO implements Serializable {

    private int datMes;
    private int datAno;
    private String codProduto;
    private String desProduto;
    private Long numLancamento;
    private String descricao;

}
