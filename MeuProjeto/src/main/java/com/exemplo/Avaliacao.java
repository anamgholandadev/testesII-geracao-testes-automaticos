package com.exemplo;

public class Avaliacao {
    private double pontuacao;
    private boolean projetoConcluido;
    private double feedback;

    public Avaliacao(double pontuacao, boolean projetoConcluido, double feedback) {
        this.pontuacao = pontuacao;
        this.projetoConcluido = projetoConcluido;
        this.feedback = feedback;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public boolean isProjetoConcluido() {
        return projetoConcluido;
    }

    public double getFeedback() {
        return feedback;
    }
}
