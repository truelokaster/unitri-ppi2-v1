package com.example.demo.controller;

import com.example.demo.entity.Locacao;
import com.example.demo.services.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locacao")
public class LocacaoController {

    @Autowired
    private LocacaoService locacaoService;

    @PostMapping
    public Locacao criarLocacao(@RequestBody Locacao locacao){
        return this.locacaoService.criarLocacao(locacao);
    }

    @PutMapping
    public Locacao atualizarLocacao(@RequestBody Locacao locacao){
        return this.locacaoService.atualizarLocacao(locacao);
    }

    @DeleteMapping
    public void deletarLocacao(@RequestBody Locacao locacao){
        this.locacaoService.deletarLocacao(locacao);
    }

    @GetMapping
    public List<Locacao> obterTodasLocacoes(){
        return this.locacaoService.listarTodasLocacoes();
    }

    @GetMapping("/{id}")
    public Locacao lerLocacao(@PathVariable Long id){
        return this.locacaoService.lerLocacao(id);
    }
}
