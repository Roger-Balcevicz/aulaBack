package com.example.demo.repository;

import com.example.demo.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
    List<Produto> findByNome(String nome);
    @Query("SELECT p FROM Produto p WHERE p.preco = 0")
    Collection<Produto> findByUnknownPrice();
}
