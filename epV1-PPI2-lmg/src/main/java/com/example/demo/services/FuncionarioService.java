package com.example.demo.services;

import com.example.demo.entity.Funcionario;
import com.example.demo.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    // criar, ler, atualizar, deletar, listarTodos

    public Funcionario criarFuncionario(Funcionario funcionario){
        return this.funcionarioRepository.save(funcionario);
    }

    public Funcionario lerFuncionario(Long matricula){
        return this.funcionarioRepository.findByMatricula(matricula);
    }

    public Funcionario atualizarFuncionario(Funcionario funcionario){
        Funcionario funcionarioExistente = this.funcionarioRepository.getOne(funcionario.getId());
        funcionarioExistente.setMatricula(funcionario.getMatricula());
        funcionarioExistente.setNome(funcionario.getNome());
        return this.funcionarioRepository.save(funcionarioExistente);
    }

    public void deletarFuncionario(Funcionario funcionario){
        this.funcionarioRepository.delete(funcionario);
    }

    public List<Funcionario> listarTodosFuncionarios(){
        return this.funcionarioRepository.findAll();
    }
}
