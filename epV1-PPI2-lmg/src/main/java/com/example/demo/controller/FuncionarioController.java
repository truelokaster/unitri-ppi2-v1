package com.example.demo.controller;

import com.example.demo.entity.Funcionario;
import com.example.demo.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public Funcionario criarFuncionario(@RequestBody Funcionario funcionario){
        return this.funcionarioService.criarFuncionario(funcionario);
    }

    @PutMapping
    public Funcionario atualizarFuncionario(@RequestBody Funcionario funcionario){
        return this.funcionarioService.atualizarFuncionario(funcionario);
    }

    @DeleteMapping
    public void deletarFuncionario(@RequestBody Funcionario funcionario){
        this.funcionarioService.deletarFuncionario(funcionario);
    }

    @GetMapping("/{matricula}")
    public Funcionario lerFuncionario(Long matricula){
        return this.funcionarioService.lerFuncionario(matricula);
    }

    @GetMapping
    public List<Funcionario> listarTodosFuncionarios(){
        return this.funcionarioService.listarTodosFuncionarios();
    }
}
