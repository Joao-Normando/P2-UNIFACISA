package Classes;

public class Carro {
	public String nome, marca, cor;
	int portas;
	boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	double precoBase;
	
	Carro(String nome, String marca, double precoBase) {
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		
		this.portas = 2;
		this.cor = "BRANCO";
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
	}
	
	Carro(String nome, String marca, String cor,int portas, boolean vidroEletrico,
			boolean arCondicionado, boolean cambioAutomatico, boolean direcaoEletrica,double precoBase){
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
		
	}
	
	Carro(){
		
	}
	
	double calculaPreco() {
		
		double valorTotal = precoBase;
		
		switch(cor) {
		case "BRANCO":
		case "AZUL":
		case "VERMELHO":
		case "PRETO":
		break;
		default: valorTotal += 1000.00;
		}
		
		if (this.vidroEletrico) {
			valorTotal += 1250.00;
		}
		if (this.arCondicionado) {
			valorTotal+= 1250.00;
		}
		if (this.cambioAutomatico) {
			valorTotal += 1250.00;
		}
		if (this.direcaoEletrica) {
			valorTotal+= 1250.00;
		}
		return valorTotal;
		
		
	}
	
	public String toString() {
		return "\nNome: " + nome
			+"\nMarca: "+ marca
			+"\nCor: " +cor
			+"\nPortas: " + portas
			+"\nVidro Eletrico: " + vidroEletrico
			+"\n Ar Condicionado: " + arCondicionado					
			+"\nCambio Automatico: " + cambioAutomatico
			+"\nDirecao Eletrica: " + direcaoEletrica
			+"\nValor Total: " + calculaPreco();			
	}
	
}
