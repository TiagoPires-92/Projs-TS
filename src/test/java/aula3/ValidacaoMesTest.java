package aula3;

import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.Assert;


public class ValidacaoMesTest {

	@Test
	public void testvalidaMes() {
		ValidacaoMes Valida = new ValidacaoMes();
		int entrada1 = 12;
		boolean resultadoExperado = true;
		boolean resultadoPrograma = Valida.validaMes(entrada1);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);	

	}
	@Test
	public void testvalidaMesInvalido() {
		ValidacaoMes Valida = new ValidacaoMes();
		int entrada1 = -1;
		boolean resultadoExperado = false;
		boolean resultadoPrograma = Valida.validaMes(entrada1);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);	

	}
}