package com.example.demo.services;

import com.example.demo.entity.Veiculo;
import com.example.demo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Veiculo criarVeiculo(Veiculo veiculo) {
        return this.veiculoRepository.save(veiculo);
    }

    public Veiculo lerVeiculo(String modelo) {
        return this.veiculoRepository.findByModelo(modelo);
    }

    public Veiculo atualizarVeiculo(Veiculo veiculo) {
        Veiculo veiculoExistente = this.veiculoRepository.getOne(veiculo.getId());
        veiculoExistente.setMarca(veiculo.getMarca());
        veiculoExistente.setModelo(veiculo.getModelo());
        return this.veiculoRepository.save(veiculoExistente);
    }

    public void deletarVeiculo(Veiculo veiculo) {
        this.veiculoRepository.delete(veiculo);
    }

    public List<Veiculo> listarTodosVeiculos() {
        return this.veiculoRepository.findAll();
    }
}
