package com.example.demo.controller;

import com.example.demo.entity.Veiculo;
import com.example.demo.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    public Veiculo criarVeiculo(@RequestBody Veiculo veiculo) {
        return this.veiculoService.criarVeiculo(veiculo);
    }

    @PutMapping
    public Veiculo atualizarVeiculo(@RequestBody Veiculo veiculo) {
        return this.veiculoService.atualizarVeiculo(veiculo);
    }

    @DeleteMapping
    public void deletarVeiculo(@RequestBody Veiculo veiculo) {
        this.veiculoService.deletarVeiculo(veiculo);
    }

    @GetMapping
    public List<Veiculo> obterTodosVeiculos() {
        return this.veiculoService.listarTodosVeiculos();
    }

    @GetMapping("/{modelo}")
    public Veiculo lerVeiculo(@PathVariable String modelo) {
        return this.veiculoService.lerVeiculo(modelo);
    }

}
