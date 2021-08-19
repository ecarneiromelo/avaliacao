package com.avalicao.service;

import com.avalicao.domain.MovimentoManual;
import com.avalicao.domain.MovimentoManualId;
import com.avalicao.domain.dto.MovimentoManualDTO;
import com.avalicao.repository.MovimentoManualRepository;
import com.avalicao.service.mapper.MovimentoManualMapper;
import com.avalicao.service.mapper.ProdutoCoisfMapper;
import com.avalicao.service.mapper.ProdutoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MovimentoManualService {

    private static final String USUARIO_TESTE = "TESTE";
    @Autowired
    private MovimentoManualRepository movimentoManualRepository;
    private MovimentoManualMapper movimentoManualMapper;
    private ProdutoMapper produtoMapper;
    private ProdutoCoisfMapper produtoCoisfMapper;

    public MovimentoManualDTO buscar(Integer datMes, Integer datAno, Long numLancamento) {
        MovimentoManualId movimentoManualId = MovimentoManualId.builder().datAno(datAno).datMes(datMes).numLancamento(numLancamento).build();
        return movimentoManualMapper.toDto(movimentoManualRepository.getById(movimentoManualId));
    }
    public List<MovimentoManual> findAll() {
        return movimentoManualRepository.findAll();
    }

    public MovimentoManualDTO salvar(MovimentoManualDTO movimentoManualDTO) {
        MovimentoManual movimentoManual = MovimentoManual.builder()
                .datAno(movimentoManualDTO.getDatAno())
                .datMes(movimentoManualDTO.getDatMes())
                .descricao(movimentoManualDTO.getDescricao())
                .numLancamento(getNum(movimentoManualDTO) + 1)
                .valor(movimentoManualDTO.getValor())
                .datMovimento(LocalDateTime.now())
                .usuario(USUARIO_TESTE)
                .produto(produtoMapper.toEntity(movimentoManualDTO.getProduto()))
                .produtoCosif(produtoCoisfMapper.toEntity(movimentoManualDTO.getProdutoCosif()))
                .build();
        return this.movimentoManualMapper.toDto(movimentoManualRepository.save(movimentoManual));
    }

    private Long getNum(MovimentoManualDTO movimentoManualDTO) {
        return this.movimentoManualRepository.getNumLancamento(movimentoManualDTO.getDatMes(), movimentoManualDTO.getDatAno()).get();
    }
}
