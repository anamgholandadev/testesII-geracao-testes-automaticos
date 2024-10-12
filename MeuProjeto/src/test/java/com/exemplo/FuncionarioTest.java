package com.exemplo;

import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;

public class FuncionarioTest {

    @Test
    public void testarCriacaoFuncionario() {
        Avaliacao avaliacao1 = new Avaliacao(80.0, true, 7.5);
        Avaliacao avaliacao2 = new Avaliacao(90.0, true, 8.5);
        Funcionario funcionario = new Funcionario("João", "Desenvolvedor", Arrays.asList(avaliacao1, avaliacao2));

        Assert.assertEquals("João", funcionario.getNome());
        Assert.assertEquals("Desenvolvedor", funcionario.getCargo());
        Assert.assertEquals(2, funcionario.getAvaliacoes().size());
    }

    @Test
    public void testarCalculoMediaDesempenho() {
        Avaliacao avaliacao1 = new Avaliacao(80.0, true, 7.5);
        Avaliacao avaliacao2 = new Avaliacao(90.0, true, 8.5);
        Funcionario funcionario = new Funcionario("João", "Desenvolvedor", Arrays.asList(avaliacao1, avaliacao2));

        double media = funcionario.calcularMediaDesempenho();
        Assert.assertEquals(85.0, media, 0.01);
    }

    @Test
    public void testarCalculoMediaDesempenhoSemAvaliacoes() {
        Funcionario funcionario = new Funcionario("Maria", "Gerente", Arrays.asList());
        double media = funcionario.calcularMediaDesempenho();

        Assert.assertTrue("A média deve ser NaN quando não há avaliações", Double.isNaN(media));
    }

    @Test
    public void testarCalculoMediaDesempenhoComAvaliacoesNegativas() {
        Avaliacao avaliacao1 = new Avaliacao(-20.0, true, 5.0);
        Avaliacao avaliacao2 = new Avaliacao(0.0, false, 2.0);
        Funcionario funcionario = new Funcionario("Carlos", "Analista", Arrays.asList(avaliacao1, avaliacao2));

        double media = funcionario.calcularMediaDesempenho();
        Assert.assertEquals(-10.0, media, 0.01);
    }

    @Test
    public void testarCalculoMediaDesempenhoComAvaliacoesVariadas() {
        Avaliacao avaliacao1 = new Avaliacao(100.0, true, 10.0);
        Avaliacao avaliacao2 = new Avaliacao(50.0, false, 5.0);
        Funcionario funcionario = new Funcionario("Ana", "Desenvolvedora", Arrays.asList(avaliacao1, avaliacao2));

        double media = funcionario.calcularMediaDesempenho();
        Assert.assertEquals(75.0, media, 0.01);
    }

    @Test
    public void testarCalculoMediaDesempenhoComUmAvaliacao() {
        Avaliacao avaliacao = new Avaliacao(95.0, true, 9.5);
        Funcionario funcionario = new Funcionario("Pedro", "Tester", Arrays.asList(avaliacao));

        double media = funcionario.calcularMediaDesempenho();
        Assert.assertEquals(95.0, media, 0.01);
    }

    @Test
    public void testarCalculoMediaDesempenhoComAvaliacoesZero() {
        Avaliacao avaliacao1 = new Avaliacao(0.0, true, 0.0);
        Avaliacao avaliacao2 = new Avaliacao(0.0, false, 0.0);
        Funcionario funcionario = new Funcionario("Lucia", "Analista", Arrays.asList(avaliacao1, avaliacao2));

        double media = funcionario.calcularMediaDesempenho();
        Assert.assertEquals(0.0, media, 0.01);
    }
}
