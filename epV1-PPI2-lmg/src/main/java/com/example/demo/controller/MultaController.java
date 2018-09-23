package com.example.demo.controller;

import com.example.demo.entity.Multa;
import com.example.demo.services.MultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/multa")
public class MultaController {

    @Autowired
    private MultaService multaService;

    @PostMapping
    public Multa criarMulta(@RequestBody Multa multa){
        return this.multaService.criarMulta(multa);
    }

    @PutMapping
    public Multa atualizarMulta(@RequestBody Multa multa){
        return this.multaService.atualizarMulta(multa);
    }

    @DeleteMapping
    public void deletarMulta(@RequestBody Multa multa){
        this.multaService.deletarMulta(multa);
    }

    @GetMapping
    public List<Multa> obterTodasMultas(){
        return this.multaService.listarTodasMultas();
    }

    @GetMapping("/{decricao}")
    public Multa lerMulta(@PathVariable String descricao){
        return this.multaService.lerMulta(descricao);
    }
}
