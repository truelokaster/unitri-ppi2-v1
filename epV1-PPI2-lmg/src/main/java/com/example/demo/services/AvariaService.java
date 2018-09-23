package com.example.demo.services;

import com.example.demo.entity.Avaria;
import com.example.demo.repository.AvariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvariaService {

    private final AvariaRepository avariaRepository;

    @Autowired
    public AvariaService(AvariaRepository avariaRepository) {
        this.avariaRepository = avariaRepository;
    }

    public Avaria criarAvaria(Avaria avaria) {
        return this.avariaRepository.save(avaria);
    }

    public Avaria lerAvaria(String descricao) {
        return this.avariaRepository.findByDescricao(descricao);
    }

    public Avaria atualizarAvaria(Avaria avaria) {
        Avaria avariaexistente = this.avariaRepository.getOne(avaria.getId());
        avariaexistente.setDescricao(avaria.getDescricao());
        avariaexistente.setValor(avaria.getValor());
        return this.avariaRepository.save(avariaexistente);
    }

    public void deletarAvaria(Avaria avaria) {
        this.avariaRepository.delete(avaria);
    }

    public List<Avaria> listartodasAvarias() {
        return this.avariaRepository.findAll();
    }
}
