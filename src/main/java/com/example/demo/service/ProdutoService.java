package com.example.demo.service;

import com.example.demo.models.Produto;
import com.example.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto cadastrarProduto( Produto produto){
        return produtoRepository.save(produto);
    }

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Produto listarUmProduto(UUID id){
        return produtoRepository.findById(id).get();
    }

    public Produto atualizarProduto(UUID id, Produto produto){
        Produto existente = produtoRepository.findById(id).get();
        existente.setNome(produto.getNome());
        existente.setPreco(produto.getPreco());
        return produtoRepository.save(existente);
    }

    public Produto deletarProduto(UUID id){
        Produto existente = produtoRepository.findById(id).get();
        produtoRepository.delete(existente);
        return existente;
    }

    public List<Produto> listarPeloNome(String nome){
        return produtoRepository.findByNome(nome);
    }

    public Collection<Produto> listarPrecoDesconhecido(){
        return produtoRepository.findByUnknownPrice();
    }
}
