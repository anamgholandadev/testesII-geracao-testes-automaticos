package com.exemplo;

public class AvaliacaoDesempenho {

    public double calcularPontuacaoFinal(Funcionario funcionario) {
        double mediaDesempenho = funcionario.calcularMediaDesempenho();

        // if (Double.isNaN(mediaDesempenho)) {
        // throw new IllegalArgumentException("A média de desempenho não pode ser NaN");
        // }

        double bonusProjetos = calcularBonusProjetos(funcionario);
        double feedback = calcularFeedback(funcionario);

        return mediaDesempenho + bonusProjetos + (feedback * 1);
    }

    private double calcularBonusProjetos(Funcionario funcionario) {
        int projetosConcluidos = 0;
        for (Avaliacao avaliacao : funcionario.getAvaliacoes()) {
            if (avaliacao.isProjetoConcluido()) {
                projetosConcluidos++;
            }
        }
        return projetosConcluidos * 0.5;
    }

    private double calcularFeedback(Funcionario funcionario) {
        double feedbackTotal = 0;
        int count = 0;
        for (Avaliacao avaliacao : funcionario.getAvaliacoes()) {
            feedbackTotal += avaliacao.getFeedback();
            count++;
        }
        return feedbackTotal / count;
    }
}
