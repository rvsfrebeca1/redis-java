package com.br.rebecacorp.pessoal.controller;

import com.br.rebecacorp.pessoal.dao.ProdutoDAO;
import com.br.rebecacorp.pessoal.services.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class init {
    private RedisService jedis = new RedisService();

    @Autowired
    private ProdutoDAO dao;



    @GetMapping("/")
    public String hello() {
        jedis.write("produtos","teste do redis", 20);
        return "Hello World";
    }


    @GetMapping("/produtos")
    public ResponseEntity<?> recuperarProdutos() {
        var result =  jedis.read("produtos");

        if(result != null){
            System.out.println("pegou do redis");
            return ResponseEntity.ok(result);
        }
        System.out.println("pegou do postgre");
        return ResponseEntity.ok(dao.recuperarTodos());
    }

}
