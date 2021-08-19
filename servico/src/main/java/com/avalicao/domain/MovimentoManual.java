package com.avalicao.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_MOVIMENTO_MANUAL")
@IdClass(MovimentoManualId.class)
@Getter
@Setter
public class MovimentoManual {

    @Id
    @Column(name = "DAT_MES")
    private Integer datMes;

    @Id
    @Column(name = "DAT_ANO")
    private Integer datAno;

    @Id
    @Column(name = "NUM_LANCAMENTO")
    private Long numLancamento;

    @Column(name = "DES_DESCRICAO")
    private String descricao;

    @Column(name = "DAT_MOVIMENTO")
    private LocalDateTime datMovimento;

    @Column(name = "COD_USUARIO")
    private String usuario;

    @Column(name = "VAL_VALOR")
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "COD_PRODUTO")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "COD_COSIF")
    private ProdutoCosif produtoCosif;

}
