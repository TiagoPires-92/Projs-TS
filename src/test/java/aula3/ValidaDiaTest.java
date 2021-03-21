package aula3;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ValidaDiaTest {

	@Test
	public void testvalidaDiasMes() {
		ValidaDia Validao = new ValidaDia();
		int entdia1 = 6;
		int entmes2 = 30;
		boolean resultadoExperado = true ;
		boolean resultadoPrograma = Validao.validaDiasMes(entdia1, entmes2);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);

	}
	
	@Test
	public void testvalidaDiasMesinvalido() {
		ValidaDia Validao = new ValidaDia();
		int entdia1 = 1;
		int entmes2 = 31;
		boolean resultadoExperado = false ;
		boolean resultadoPrograma = Validao.validaDiasMes(entdia1, entmes2);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);

	}

}


