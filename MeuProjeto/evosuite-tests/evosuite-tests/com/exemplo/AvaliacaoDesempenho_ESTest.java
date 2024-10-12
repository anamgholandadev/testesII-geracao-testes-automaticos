/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 12 17:57:40 GMT 2024
 */

package com.exemplo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.exemplo.Avaliacao;
import com.exemplo.AvaliacaoDesempenho;
import com.exemplo.Funcionario;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AvaliacaoDesempenho_ESTest extends AvaliacaoDesempenho_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AvaliacaoDesempenho avaliacaoDesempenho0 = new AvaliacaoDesempenho();
      LinkedList<Avaliacao> linkedList0 = new LinkedList<Avaliacao>();
      Avaliacao avaliacao0 = new Avaliacao((-1.0), true, 0.0);
      linkedList0.add(avaliacao0);
      linkedList0.add(avaliacao0);
      Funcionario funcionario0 = new Funcionario("|M/||\"1?MVQ#K;q+U", "YGVZ;10MjG 5MzRD", linkedList0);
      double double0 = avaliacaoDesempenho0.calcularPontuacaoFinal(funcionario0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AvaliacaoDesempenho avaliacaoDesempenho0 = new AvaliacaoDesempenho();
      LinkedList<Avaliacao> linkedList0 = new LinkedList<Avaliacao>();
      Funcionario funcionario0 = new Funcionario("com.exemplo.Avaliacao", "VDvyl^r};*", linkedList0);
      Avaliacao avaliacao0 = new Avaliacao(1128.53, true, 1128.53);
      linkedList0.offerLast(avaliacao0);
      double double0 = avaliacaoDesempenho0.calcularPontuacaoFinal(funcionario0);
      assertEquals(2257.56, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AvaliacaoDesempenho avaliacaoDesempenho0 = new AvaliacaoDesempenho();
      LinkedList<Avaliacao> linkedList0 = new LinkedList<Avaliacao>();
      Avaliacao avaliacao0 = new Avaliacao((-2682.8100989907), true, (-2597.623035));
      linkedList0.add(avaliacao0);
      Funcionario funcionario0 = new Funcionario(".&osjR`W{:IRJ{", ".&osjR`W{:IRJ{", linkedList0);
      double double0 = avaliacaoDesempenho0.calcularPontuacaoFinal(funcionario0);
      assertEquals((-5279.9331339907), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AvaliacaoDesempenho avaliacaoDesempenho0 = new AvaliacaoDesempenho();
      LinkedList<Avaliacao> linkedList0 = new LinkedList<Avaliacao>();
      Avaliacao avaliacao0 = new Avaliacao((-1405.758200903406), false, 0.5);
      linkedList0.add(avaliacao0);
      Funcionario funcionario0 = new Funcionario("com.exemplo.Avaliacao", "com.exemplo.Avaliacao", linkedList0);
      double double0 = avaliacaoDesempenho0.calcularPontuacaoFinal(funcionario0);
      assertEquals((-1405.258200903406), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AvaliacaoDesempenho avaliacaoDesempenho0 = new AvaliacaoDesempenho();
      LinkedList<Avaliacao> linkedList0 = new LinkedList<Avaliacao>();
      Funcionario funcionario0 = new Funcionario("0#om'X|T`fyA", "0#om'X|T`fyA", linkedList0);
      double double0 = avaliacaoDesempenho0.calcularPontuacaoFinal(funcionario0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AvaliacaoDesempenho avaliacaoDesempenho0 = new AvaliacaoDesempenho();
      // Undeclared exception!
      try { 
        avaliacaoDesempenho0.calcularPontuacaoFinal((Funcionario) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.exemplo.AvaliacaoDesempenho", e);
      }
  }
}
