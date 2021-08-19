package com.avalicao.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@EqualsAndHashCode
@Data
@Builder
@AllArgsConstructor
@Embeddable
@NoArgsConstructor
public class MovimentoManualId implements Serializable {

    private Integer datMes;

    private Integer datAno;

    private Long numLancamento;


}