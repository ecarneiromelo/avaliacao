package com.avalicao.service.mapper;

import com.avalicao.domain.MovimentoManual;
import com.avalicao.domain.dto.MovimentoManualDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovimentoManualMapper extends EntityMapper<MovimentoManualDTO, MovimentoManual> {

}