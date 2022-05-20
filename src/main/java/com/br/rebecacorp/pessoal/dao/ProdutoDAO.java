package com.br.rebecacorp.pessoal.dao;

import java.util.List;

import com.br.rebecacorp.pessoal.model.Produtos;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoDAO extends CrudRepository<Produtos, Integer> {
    @Query(value = "SELECT * FROM produtos", nativeQuery = true)
	public List<Produtos> recuperarTodos();
}
