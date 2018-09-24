package com.example.demo.controller;

import com.example.demo.entity.Categoria;
import com.example.demo.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public Categoria criarCategoria(@RequestBody Categoria categoria) {

        return this.categoriaService.criarCategoria(categoria);
    }

    @PutMapping
    public Categoria atualizarCategoria(@RequestBody Categoria categoria){

        return this.categoriaService.atualizarCategoria(categoria);
    }

    @DeleteMapping
    public void deleteCategoria(@RequestBody Categoria categoria) {

        this.categoriaService.deletarCategoria(categoria);
    }

    @GetMapping
    public List<Categoria> obterTodasCategorias() {

        return categoriaService.listarTodasCategorias();
    }

    @GetMapping("/descricao")
    public Categoria lerCategoria(@PathVariable String descricao) {

        return categoriaService.lerCategoria(descricao);
    }
}
