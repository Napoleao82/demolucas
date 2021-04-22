package com.demo.demolucas.service;

import com.demo.demolucas.model.ClienteDto;
import com.demo.demolucas.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    IClienteRepository repository;

    public ClienteDto salvarCliente(ClienteDto request){



        ClienteDto response = repository.save(request);
        return response;
    }
}
