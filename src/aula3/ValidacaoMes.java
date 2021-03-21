package aula3;

public class ValidacaoMes {


	boolean validaMes(int mes){
		if(mes <=0 || mes > 12){
			return false;
		}else{
			return true;
		}
	}
}