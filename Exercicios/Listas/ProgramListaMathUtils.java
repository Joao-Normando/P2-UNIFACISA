package lista;

import java.util.ArrayList;
import java.util.Arrays;

public class ProgramListaMathUtils {

	public static void main(String[] args) {
		
		ListaMathUtils a = new ListaMathUtils();
		
		System.out.println(a.calculaDivisores(12));
		System.out.println(a.computaMaior(new ArrayList<Double>(Arrays.asList(12.4, 43.1, 4.3, 54.0, 6.7))));
		System.out.println(a.numeroRepetido(new ArrayList<Double>(Arrays.asList(12.4, 43.1, 4.3, 54.0, 6.7))));
		System.out.println(a.computaMenor(new ArrayList<Double>(Arrays.asList(12.4, 43.1, 4.3, 54.0, 6.7))));
		System.out.println(a.computaMedia(new ArrayList<Double>(Arrays.asList(12.4, 43.1, 4.3, 54.0, 6.7))));
	}
	

}
