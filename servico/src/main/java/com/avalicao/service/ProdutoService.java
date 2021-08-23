package com.avalicao.service;

import com.avalicao.repository.ProdutoRepository;
import com.avalicao.util.SelectItem;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;


    public List<SelectItem> findAllSeletItem() {
        return produtoRepository.findAllSeletItem();
    }


}
