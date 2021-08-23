package com.avalicao.domain;

import com.avalicao.util.SimNaoConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Inheritance(strategy = InheritanceType.JOINED)
public class Produto {

    @Id
    @Column(name = "COD_PRODUTO", nullable = false)
    private String id;

    @Column(name = "DES_PRODUTO")
    private String descricao;

    @Convert(converter = SimNaoConverter.class)
    @Column(name = "STA_STATUS")
    private Boolean status;

}
