package com.avalicao.web;

import com.avalicao.domain.MovimentoManual;
import com.avalicao.domain.dto.MovimentoManualDTO;
import com.avalicao.service.MovimentoManualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cosif")
public class CosifController {

    @Autowired
    private MovimentoManualService movimentoManualService;

    @GetMapping("/movimentos-manuais")
    public ResponseEntity<List<MovimentoManual>> list() {
        return ResponseEntity.ok(this.movimentoManualService.findAll());
    }

    @GetMapping("/{datMes}/{datAno}/{numLancamento}")
    public ResponseEntity<MovimentoManualDTO> buscar(Integer datMes, Integer datAno, Long numLancamento) {
        return ResponseEntity.ok(this.movimentoManualService.buscar(datMes, datAno, numLancamento));
    }

    @PostMapping("")
    public ResponseEntity<MovimentoManualDTO> buscar(@RequestBody MovimentoManualDTO movimentoManualDTO) {
        return ResponseEntity.ok(this.movimentoManualService.salvar(movimentoManualDTO));
    }


}
