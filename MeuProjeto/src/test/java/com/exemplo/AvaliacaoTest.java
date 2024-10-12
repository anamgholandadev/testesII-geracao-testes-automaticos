package com.exemplo;

import org.junit.Test;
import org.junit.Assert;

public class AvaliacaoTest {

    @Test
    public void testarCriacaoAvaliacao() {
        Avaliacao avaliacao = new Avaliacao(85.0, true, 9.0);
        Assert.assertEquals(85.0, avaliacao.getPontuacao(), 0.01);
        Assert.assertTrue(avaliacao.isProjetoConcluido());
        Assert.assertEquals(9.0, avaliacao.getFeedback(), 0.01);
    }

    @Test
    public void testarPontuacaoNegativa() {
        Avaliacao avaliacao = new Avaliacao(-10.0, false, 5.0);
        Assert.assertEquals(-10.0, avaliacao.getPontuacao(), 0.01);
        Assert.assertFalse(avaliacao.isProjetoConcluido());
        Assert.assertEquals(5.0, avaliacao.getFeedback(), 0.01);
    }

    @Test
    public void testarProjetoNaoConcluido() {
        Avaliacao avaliacao = new Avaliacao(75.0, false, 8.0);
        Assert.assertFalse(avaliacao.isProjetoConcluido());
        Assert.assertEquals(75.0, avaliacao.getPontuacao(), 0.01);
    }

    @Test
    public void testarFeedbackValido() {
        Avaliacao avaliacao = new Avaliacao(90.0, true, 10.0);
        Assert.assertEquals(10.0, avaliacao.getFeedback(), 0.01);
    }

    @Test
    public void testarFeedbackNegativo() {
        Avaliacao avaliacao = new Avaliacao(70.0, true, -5.0);
        Assert.assertEquals(-5.0, avaliacao.getFeedback(), 0.01);
    }

    @Test
    public void testarPontuacaoZero() {
        Avaliacao avaliacao = new Avaliacao(0.0, true, 0.0);
        Assert.assertEquals(0.0, avaliacao.getPontuacao(), 0.01);
    }
}
