package aula3;

import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.Assert;

public class CalculaTaxaJurosTest {


	@Test
	public void testCalculoJuros() {

		CalculaTaxaJuros objJuros = new CalculaTaxaJuros();

		double entrada = 0.15;
		double saidaExperada = 150;
		double saidaPrograma = objJuros.validaJuros(entrada);
		Assert.assertEquals(saidaExperada, saidaPrograma,0);


	}

	@Test
	public void testCalculoJurosInvalidos() {

		CalculaTaxaJuros objJuros = new CalculaTaxaJuros();

		double entrada = 0.21;
		double saidaExperada = 0;
		double saidaPrograma = objJuros.validaJuros(entrada);
		Assert.assertEquals(saidaExperada, saidaPrograma,0);


	}
}
