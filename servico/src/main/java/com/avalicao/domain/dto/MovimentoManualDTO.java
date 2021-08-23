package com.avalicao.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovimentoManualDTO {
    @NotNull(message = "Mês deve ser preenchido")
    private Integer mes;
    @NotNull(message = "Ano deve ser preenchido")
    private Integer ano;
    @NotBlank(message = "Descricao deve ser preenchido")
    private String descricao;
    @NotNull(message = "Valor deve ser preenchido")
    private BigDecimal valor;
    @NotBlank(message = "Produto deve ser preenchido")
    private String idProduto;
    @NotBlank(message = "Cosif deve ser preenchido")
    private String idCosif;

}
