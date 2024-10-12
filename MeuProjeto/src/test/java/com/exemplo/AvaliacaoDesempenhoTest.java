package com.exemplo;

import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;

public class AvaliacaoDesempenhoTest {

    @Test
    public void testarCalculoPontuacaoFinalComValoresValidos() {
        Funcionario funcionario = new Funcionario("João", "Desenvolvedor",
                Arrays.asList(new Avaliacao(80.0, true, 7.5),
                        new Avaliacao(85.0, true, 8.0)));

        AvaliacaoDesempenho avaliacaoDesempenho = new AvaliacaoDesempenho();
        double resultado = avaliacaoDesempenho.calcularPontuacaoFinal(funcionario);

        Assert.assertEquals(172.0, resultado, 0.1);
    }

    @Test
    public void testarPontuacaoComMediaNaN() {
        Funcionario funcionario = new Funcionario("Maria", "Gerente", Arrays.asList());

        AvaliacaoDesempenho avaliacaoDesempenho = new AvaliacaoDesempenho();

        try {
            avaliacaoDesempenho.calcularPontuacaoFinal(funcionario);
            Assert.fail("Esperava-se IllegalArgumentException quando a média é NaN");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("A média de desempenho não pode ser NaN", e.getMessage());
        }
    }

    @Test
    public void testarDivisaoPorZeroNoCalculoDeFeedback() {
        Funcionario funcionario = new Funcionario("Carlos", "Analista", Arrays.asList());

        AvaliacaoDesempenho avaliacaoDesempenho = new AvaliacaoDesempenho();

        try {
            avaliacaoDesempenho.calcularPontuacaoFinal(funcionario);
            Assert.fail("Esperava-se ArithmeticException por divisão por zero");
        } catch (ArithmeticException e) {
            Assert.assertTrue("Divisão por zero não tratada", true);
        }
    }

    @Test
    public void testarPontuacaoFinalSemAvaliacoes() {
        Funcionario funcionario = new Funcionario("Ana", "Desenvolvedora", Arrays.asList());

        AvaliacaoDesempenho avaliacaoDesempenho = new AvaliacaoDesempenho();
        double resultado = avaliacaoDesempenho.calcularPontuacaoFinal(funcionario);

        Assert.assertTrue("Pontuação final deve ser NaN quando não há avaliações", Double.isNaN(resultado));
    }

    @Test
    public void testarCalculoPontuacaoComProjetosNaoConcluidos() {
        Funcionario funcionario = new Funcionario("Lucas", "Desenvolvedor",
                Arrays.asList(new Avaliacao(70.0, false, 6.0),
                        new Avaliacao(75.0, false, 7.0)));

        AvaliacaoDesempenho avaliacaoDesempenho = new AvaliacaoDesempenho();
        double resultado = avaliacaoDesempenho.calcularPontuacaoFinal(funcionario);

        Assert.assertEquals(152.0, resultado, 0.1);
    }

    @Test
    public void testarCalculoPontuacaoComFeedbackVariado() {
        Funcionario funcionario = new Funcionario("Fernanda", "Analista",
                Arrays.asList(new Avaliacao(90.0, true, 9.0),
                        new Avaliacao(60.0, true, 5.0),
                        new Avaliacao(80.0, true, 8.0)));

        AvaliacaoDesempenho avaliacaoDesempenho = new AvaliacaoDesempenho();
        double resultado = avaliacaoDesempenho.calcularPontuacaoFinal(funcionario);

        Assert.assertEquals(175.0, resultado, 0.1);
    }

    @Test
    public void testarCalculoPontuacaoComUmProjetoNaoConcluido() {
        Funcionario funcionario = new Funcionario("Renato", "Gerente",
                Arrays.asList(new Avaliacao(100.0, true, 10.0),
                        new Avaliacao(80.0, false, 8.0)));

        AvaliacaoDesempenho avaliacaoDesempenho = new AvaliacaoDesempenho();
        double resultado = avaliacaoDesempenho.calcularPontuacaoFinal(funcionario);

        Assert.assertEquals(181.0, resultado, 0.1);
    }

    @Test
    public void testarCalculoPontuacaoComZeroFeedback() {
        Funcionario funcionario = new Funcionario("João", "Analista",
                Arrays.asList(new Avaliacao(75.0, true, 0.0),
                        new Avaliacao(85.0, true, 0.0)));

        AvaliacaoDesempenho avaliacaoDesempenho = new AvaliacaoDesempenho();
        double resultado = avaliacaoDesempenho.calcularPontuacaoFinal(funcionario);

        Assert.assertEquals(162.0, resultado, 0.1);
    }

    @Test
    public void testarCalculoPontuacaoComTodosProjetosNaoConcluidos() {
        Funcionario funcionario = new Funcionario("Patrícia", "Coordenadora",
                Arrays.asList(new Avaliacao(90.0, false, 9.0),
                        new Avaliacao(70.0, false, 8.0)));

        AvaliacaoDesempenho avaliacaoDesempenho = new AvaliacaoDesempenho();
        double resultado = avaliacaoDesempenho.calcularPontuacaoFinal(funcionario);

        Assert.assertEquals(163.0, resultado, 0.1);
    }
}
