package com.example.demo.services;

import com.example.demo.entity.Locacao;
import com.example.demo.repository.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocacaoService {

    @Autowired
    private LocacaoRepository locacaoRepository;

    public Locacao criarLocacao(Locacao locacao){
        return this.locacaoRepository.save(locacao);
    }

    public Locacao lerLocacao(Long id){
        return this.locacaoRepository.getOne(id);
    }

    public Locacao atualizarLocacao(Locacao locacao){
        Locacao locacaoExistente = this.locacaoRepository.getOne(locacao.getId());
        locacaoExistente.setData(locacao.getData());
        return this.locacaoRepository.save(locacaoExistente);
    }

    public void deletarLocacao(Locacao locacao){
        this.locacaoRepository.delete(locacao);
    }

    public List<Locacao> listarTodasLocacoes(){
        return this.locacaoRepository.findAll();
    }
}
