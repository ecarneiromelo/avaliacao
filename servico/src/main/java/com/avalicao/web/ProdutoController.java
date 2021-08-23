package com.avalicao.web;

import com.avalicao.domain.Produto;
import com.avalicao.domain.dto.ProdutoDTO;
import com.avalicao.service.ProdutoService;
import com.avalicao.util.SelectItem;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping("")
    public ResponseEntity<List<SelectItem>> listSelectItem() {
        return ResponseEntity.ok(this.produtoService.findAllSeletItem());
    }
}
