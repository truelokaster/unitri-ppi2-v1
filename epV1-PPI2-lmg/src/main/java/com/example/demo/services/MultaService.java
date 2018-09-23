package com.example.demo.services;

import com.example.demo.entity.Multa;
import com.example.demo.repository.MultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultaService {

    @Autowired
    private MultaRepository multaRepository;

    public Multa criarMulta(Multa multa){
        return this.multaRepository.save(multa);
    }

    public Multa lerMulta(String descricao){
        return this.multaRepository.findByDescricao(descricao);
    }

    public Multa atualizarMulta(Multa multa){
        Multa multaExistente = this.multaRepository.getOne(multa.getId());
        multaExistente.setDescricao(multa.getDescricao());
        multaExistente.setValor(multa.getValor());
        return this.multaRepository.save(multaExistente);
    }

    public void deletarMulta(Multa multa){
        this.multaRepository.delete(multa);
    }

    public List<Multa> listarTodasMultas(){
        return this.multaRepository.findAll();
    }
}
