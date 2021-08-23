package com.avalicao.web;

import com.avalicao.domain.MovimentoManual;
import com.avalicao.domain.ProdutoCosif;
import com.avalicao.domain.dto.MovimentoManualDTO;
import com.avalicao.service.CosifService;
import com.avalicao.service.MovimentoManualService;
import com.avalicao.util.SelectItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/cosif")
public class CosifController {

    @Autowired
    private CosifService cosifService;

    @GetMapping("/produto/{idProduto}")
    public ResponseEntity<List<SelectItem>> list(@PathVariable("idProduto") String idProduto) {
        return ResponseEntity.ok(this.cosifService.findAllByProduto(idProduto));
    }

}
