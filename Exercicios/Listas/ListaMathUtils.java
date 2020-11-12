package lista;

import java.util.List;
import java.util.ArrayList;

public class ListaMathUtils {
	
	public List<Integer> calculaDivisores(int num){
		
		List<Integer> divisores = new ArrayList<>();
		for(int i=1 ; i<=num ; i++) {
			
			if(num % i == 0 )
				divisores.add(i);
		}
		
		return divisores;
	}
	
	public double computaMaior(List<Double> numeros) {
		double Maior = numeros.get(0);
		for(int i = 0; i< numeros.size(); i++) {
			if(numeros.get(i) > Maior)
				Maior = numeros.get(i);
		}
		return Maior;
	}
	
	

	public double computaMenor(List<Double> numeros) {
		double Menor = numeros.get(0);
		for(int i = 0; i< numeros.size(); i++) {
			if(numeros.get(i) < Menor) {
				Menor = numeros.get(i);
			}
			
		}
		return Menor;
	}
	
	
	public double computaMedia(List<Double> numeros) {
		double Media = 0;
		int contador = 0;
		double soma = 0;
		
		for (int i = 0; i < numeros.size(); i++) {
			soma += numeros.get(i);
			contador ++;
		}
		Media = soma / contador;
		return Media;
		
		}
	public boolean numeroRepetido (List <Double> numeros) {
		int repetido = 0;
		for (int i = 0; i < numeros.size(); i++) {
			for (int j = 0; j< numeros.size(); j++) {
				if (numeros.get(i) != numeros.get(j) && numeros.get(i).equals(numeros.get(j)))
						repetido ++;
			}
		}
		if (repetido > 0 )
			return true;
		else
			return false;
	}
}
