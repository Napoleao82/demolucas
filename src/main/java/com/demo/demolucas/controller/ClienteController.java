package com.demo.demolucas.controller;

import com.demo.demolucas.model.ClienteDto;
import com.demo.demolucas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @RequestMapping( method = POST)
    public ResponseEntity<ClienteDto> usuarioPost(@RequestBody ClienteDto request){
        return ResponseEntity.ok(service.salvarCliente(request));
    }

    @RequestMapping(method = GET)
    public ResponseEntity<String> usuarioGet(){
        return ResponseEntity.ok("Cadastro realizado com sucesso GET");
    }

    @RequestMapping( method = PUT)
    public ResponseEntity<String> usuarioPUT(){
        return ResponseEntity.ok("Cadastro realizado com sucesso PUT");
    }

    @RequestMapping(method = DELETE)
    public ResponseEntity<String> usuarioDelete(){
        return ResponseEntity.ok("Cadastro realizado com sucesso DELETE");
    }
}
