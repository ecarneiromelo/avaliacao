package com.avalicao.service.mapper;

import com.avalicao.domain.Produto;
import com.avalicao.domain.dto.ProdutoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProdutoMapper extends EntityMapper<ProdutoDTO, Produto> {


}