package aula3;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class RetornatextoTest {

	@Test
	public void testrestornaTexto() 
	{
		Retornatexto Retorna = new Retornatexto();

		String entrada1 = "campeao mundial";
		int resultadoExperado =	15;	
		int resultadoPrograma = Retorna.retornaTamanhoTexto(entrada1);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);

	}
}
