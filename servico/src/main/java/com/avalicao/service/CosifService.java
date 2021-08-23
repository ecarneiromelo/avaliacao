package com.avalicao.service;

import com.avalicao.domain.MovimentoManual;
import com.avalicao.domain.MovimentoManualId;
import com.avalicao.domain.ProdutoCosif;
import com.avalicao.domain.dto.MovimentoManualDTO;
import com.avalicao.repository.CosifRepository;
import com.avalicao.repository.MovimentoManualRepository;
import com.avalicao.service.mapper.MovimentoManualMapper;
import com.avalicao.service.mapper.ProdutoCoisfMapper;
import com.avalicao.service.mapper.ProdutoMapper;
import com.avalicao.util.SelectItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CosifService {

    @Autowired
    private CosifRepository cosifRepository;
    private ProdutoCoisfMapper produtoCoisfMapper;

    public List<SelectItem> findAllByProduto(String idProduto) {
        return cosifRepository.findAllByProdutoId(idProduto);
    }

}
