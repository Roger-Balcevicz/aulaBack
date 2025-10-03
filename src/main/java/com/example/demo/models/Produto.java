package com.example.demo.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private float preco;

    public Produto(){}

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    // métodos geters e seter abaixo:


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
