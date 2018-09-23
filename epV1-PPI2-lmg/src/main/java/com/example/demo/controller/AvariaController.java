package com.example.demo.controller;

import com.example.demo.entity.Avaria;
import com.example.demo.services.AvariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/avaria")
public class AvariaController {

    @Autowired
    private AvariaService avariaService;

    @PostMapping
    public Avaria criarAvaria(@RequestBody Avaria avaria) {
        return this.avariaService.criarAvaria(avaria);
    }

    @PutMapping
    public Avaria atualizarAvaria(@RequestBody Avaria avaria) {
        return this.avariaService.atualizarAvaria(avaria);
    }

    @DeleteMapping
    public void deletarAvaria(@RequestBody Avaria avaria) {
        this.avariaService.deletarAvaria(avaria);
    }

    @GetMapping
    public List<Avaria> obterTodasAvarias() {
        return avariaService.listartodasAvarias();
    }

    @GetMapping("/{descricao}")
    public Avaria lerAvaria(@PathVariable String descricao) {
        return avariaService.lerAvaria(descricao);
    }
}
