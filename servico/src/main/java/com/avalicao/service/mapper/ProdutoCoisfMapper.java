package com.avalicao.service.mapper;

import com.avalicao.domain.ProdutoCosif;
import com.avalicao.domain.dto.ProdutoCosifDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProdutoCoisfMapper extends EntityMapper<ProdutoCosifDTO, ProdutoCosif> {

}