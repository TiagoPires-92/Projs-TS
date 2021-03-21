package aula3;

public class CalculaTaxaJuros {
	double valor = 1000;
	
	public double validaJuros(double juros) {
		if (juros >=0.05 && juros <=0.20) { 
			return  valor * juros;
		}

		return 0;

	}
}