package com.demo.demolucas.repository;

import com.demo.demolucas.model.ClienteDto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IClienteRepository extends CrudRepository<ClienteDto, Long> {

}
