package com.avalicao.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class SelectProdutoDTO {

    private String id;
    private String nome;

}
