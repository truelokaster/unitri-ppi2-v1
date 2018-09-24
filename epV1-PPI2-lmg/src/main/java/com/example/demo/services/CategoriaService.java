package com.example.demo.services;

import com.example.demo.entity.Categoria;
import com.example.demo.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {

        this.categoriaRepository = categoriaRepository;
    }

    public Categoria criarCategoria(Categoria categoria){

        return this.categoriaRepository.save(categoria);
    }

    public Categoria lerCategoria(String descricao) {

        return this.categoriaRepository.findByDescricao(descricao);
    }

    public Categoria atualizarCategoria(Categoria categoria) {
        Categoria categoriaExistente = this.categoriaRepository.getOne(categoria.getId());
        categoriaExistente.setDescricao(categoria.getDescricao());
        return this.categoriaRepository.save(categoriaExistente);
    }

    public void deletarCategoria(Categoria categoria){

        this.categoriaRepository.delete(categoria);
    }

    public List<Categoria> listarTodasCategorias() {

        return this.categoriaRepository.findAll();
    }
}
