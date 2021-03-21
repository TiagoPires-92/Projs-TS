package aula3;

public class ValidaDia {

	boolean validaDiasMes(int mes, int dia) {
		if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11) && dia == 30) { 
			return true;
		}else {
			return false;

		}
	}
}