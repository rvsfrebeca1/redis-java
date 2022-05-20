package com.br.rebecacorp.pessoal.dao;

import com.br.rebecacorp.pessoal.model.Clientes;


import org.springframework.data.repository.CrudRepository;


public interface ClienteDAO extends CrudRepository<Clientes, Integer> {
    
}
