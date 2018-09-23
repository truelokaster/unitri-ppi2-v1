package com.example.demo.services;

import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Cliente lerCliente(Long cpf){}
}
