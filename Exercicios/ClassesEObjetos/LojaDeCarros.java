package Classes;

public class LojaDeCarros {

	public static void main(String[] args) {
		Carro palio = new Carro("Pálio", "Fiat", 35000.00);
		Carro palioPrata = new Carro("Palio", "Fiat", "Prata",2, false,false,false, false,35000.00);
		Carro HondaCivic = new Carro("Honda Civic","Honda","Vermelho",4,true,true,true,true,110000.00);
		Carro Toyota = new Carro("Corolla","Toyota","Preto",4,true,true,false,true,110000.00);
		Carro VolksWagem = new Carro("Gol","VolksWagem","Azul",4,true,true,true,true,55000.00);
		System.out.println(palio);
		System.out.println(palioPrata);
		System.out.println(HondaCivic.toString());
		System.out.println(Toyota.toString());
		System.out.println(VolksWagem.toString());
		
	}

}
