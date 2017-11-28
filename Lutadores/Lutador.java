package Lutadores;

public class Lutador {



	// ATRIBUTOS
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private int peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int impates;


	// CONSTRUTOR PRINCIPAL
	public Lutador(String nome, String nacionalidade, int idade,double altura,int peso, int vitorias, int derrotas, int impates) {
	this.nome=nome;
	this.nacionalidade=nacionalidade;
	this.idade=idade;
	this.altura=altura;
	this.peso=peso;
	this.vitorias=vitorias;
	this.derrotas=derrotas;
	this.impates=impates;
		
	}


	//METODOS GET E SET 
	
	


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public String getCategoria() {
		if(this.getPeso() < 52.2) {
			setCategoria(" Invalido ");
		}else if (this.getPeso() <=70.3) {
			setCategoria(" LEVE ");
		}else if (this.getPeso() <=83.9) {
			setCategoria(" MEDIO ");
		}else if(this.getPeso() <=120.2) {
			setCategoria(" PESADO ");
		}else {
		setCategoria(" INVALIDO ");	
		}
		
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public int getVitorias() {
		return vitorias;
	}


	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}


	public int getDerrotas() {
		return derrotas;
	}


	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}


	public int getImpates() {
		return impates;
	}


	public void setImpates(int impates) {
		this.impates = impates;
	}
	
	// METODOS PRINCIPAIS

	public void aprensetar(){
	
		System.out.println("Chegou a hora! apresentamos o lutador " + this.getNome());
		System.out.println("Diretamente do " + this.getNacionalidade());
		System.out.println("E o peso : " + this.getPeso() + " Kg ");
		System.out.println(getIdade()+ " Anos");
		System.out.println(getAltura() +" m de altura");
		System.out.println("Ganhou " +getVitorias() + " Lutas" );
		System.out.println("Perdeu" +getDerrotas()+" Lutas");
		System.out.println("Emapatou " + getImpates()+ "Lutas");
	}

	public void status() {
	System.out.println(this.getNome() + " pesa  " + this.getPeso() +" Kg "+ " Caterogoria "+getCategoria());
	System.out.println(" ganhou " + this.getVitorias() + " Lutas ");
	System.out.println(" Perdeu " + this.getDerrotas() + " Lutas ");
	System.out.println(" Empatou " + this.getImpates() + " Lutas ");
	}

	public void ganharLuta() {
	
		setVitorias(getVitorias()+1); 
	}

	public void perdeLuta() {
	
		setDerrotas(getDerrotas() + 1);
	}

	public void empatarLuta() {
		setImpates(getImpates() +1);
	}
}
