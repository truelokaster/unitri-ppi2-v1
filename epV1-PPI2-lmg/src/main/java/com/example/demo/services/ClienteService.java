package com.example.demo.services;

import com.example.demo.entity.Categoria;
import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {

        this.clienteRepository = clienteRepository;
    }

    public Cliente criarCliente(Cliente cliente) {

        return this.clienteRepository.save(cliente);
    }

    public Cliente lerCliente(Long cpf){

        return this.clienteRepository.findByCpf(cpf);
    }

    public Cliente atualizarCliente(Cliente cliente){

        Cliente clienteExistente = this.clienteRepository.getOne(cliente.getId());
        clienteExistente.setNome(cliente.getNome());
        clienteExistente.setCpf(cliente.getCpf());
        return this.clienteRepository.save(clienteExistente);
    }

    public void deletarCliente(Cliente cliente){

        this.clienteRepository.delete(cliente);
    }

    public List<Cliente> listarTodosClientes() {

        return this.clienteRepository.findAll();
    }
}
