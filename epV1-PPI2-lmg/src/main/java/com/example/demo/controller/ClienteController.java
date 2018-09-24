package com.example.demo.controller;

import com.example.demo.entity.Cliente;
import com.example.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente){
        return this.clienteService.criarCliente(cliente);
    }

    @GetMapping("/{cpf}")
    public Cliente lerCliente(@PathVariable Long cpf){

        return this.clienteService.lerCliente(cpf);
    }

    @GetMapping
    public List<Cliente> listarTodosClientes(){

        return this.clienteService.listarTodosClientes();
    }

    @PutMapping
    public Cliente atualizarCliente(@RequestBody Cliente cliente){

        return this.clienteService.atualizarCliente(cliente);
    }

    @DeleteMapping
    public void deletarCliente(@RequestBody Cliente cliente){

        this.clienteService.deletarCliente(cliente);
    }
}
