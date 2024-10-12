package com.exemplo;

import java.util.List;

public class Funcionario {
    private String nome;
    private String cargo;
    private List<Avaliacao> avaliacoes;

    public Funcionario(String nome, String cargo, List<Avaliacao> avaliacoes) {
        this.nome = nome;
        this.cargo = cargo;
        this.avaliacoes = avaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public double calcularMediaDesempenho() {
        double soma = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            soma += avaliacao.getPontuacao();
        }
        return soma / avaliacoes.size();
    }
}
