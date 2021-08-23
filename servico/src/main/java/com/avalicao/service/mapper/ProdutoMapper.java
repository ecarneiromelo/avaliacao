package com.avalicao.service.mapper;

import com.avalicao.domain.Produto;
import com.avalicao.domain.dto.ProdutoDTO;
import com.avalicao.domain.enums.SimNao;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    Produto toEntity(ProdutoDTO dto);

    ProdutoDTO toDto(Produto entity);

    List<Produto> toEntity(List<ProdutoDTO> dtoList);

    List <ProdutoDTO> toDto(List<Produto> entityList);


}