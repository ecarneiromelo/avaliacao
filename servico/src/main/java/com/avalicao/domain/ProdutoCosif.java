package com.avalicao.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PRODUTO_COSIF")
public class ProdutoCosif {

    @Id
    @Column(name = "COD_COSIF")
    private String cosif;

    @Column(name = "COD_CLASSIFICACAO ")
    private String classificacao;

    @ManyToOne
    @JoinColumn(name = "COD_PRODUTO")
    private Produto produto;

}
