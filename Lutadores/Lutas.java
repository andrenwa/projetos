package Lutadores;

import java.util.Random;

public class Lutas {
	
	// ATRIBUTOS
	private  Lutador desafiado ;
	private	 Lutador  desafiante ;
	private	boolean rounds;
	private	boolean aprovada;
		
			
	
	
	// METODOS GET E SET
		
		public Lutador getDesafiado() {
			return desafiado;
		}

		public void setDesafiado(Lutador desafiado) {
			this.desafiado = desafiado;
		}

		public boolean isAprovada() {
			return aprovada;
		}

		public void setAprovada(boolean aprovada) {
			this.aprovada = aprovada;
		}

		
		
		// METODOS 
		
	
		
		
		public void marcaLuta(Lutador l1 , Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
		this.aprovada=true;	
		this.desafiado=l1;
		this.desafiante=l2;
		}else {
		this.aprovada=false;
		this.desafiado=null;
		this.desafiante=null;
		}
			
		}
		
		public void lutar() {
		
		if(this.aprovada) {
		System.out.println("###DESAFIADO###");
		this.desafiado.aprensetar();
		System.out.println("##DESAFIANTE###");
		this.desafiante.aprensetar();
		
		Random aleatorio = new Random();
		int vencedor= aleatorio.nextInt(3); // 0 1 2
				
		switch (vencedor) {
		
		case 0://empata
			this.desafiado.empatarLuta();
			this.desafiante.empatarLuta();
			break;
			
		case 1:// desafiado ganha
			System.out.println("Vitoria do " + this.desafiado);
			this.desafiado.ganharLuta();
			this.desafiante.perdeLuta();
			break;
			
		case 2:// desafiante ganha
			System.out.println("A vitoria e do " + this.desafiante);
			this.desafiado.perdeLuta();
			this.desafiante.ganharLuta();
			break;
		
		}
		System.out.println("===================================================================");
		System.out.println("Vencedor (0= empata/ 1= desafiado ganha/ 2= desafiante ganha) = "+vencedor);	
		System.out.println("===================================================================");
		}else {
		System.out.println("A luta nao pode acontecer");	
		}
			
		
		}
	
	
	
	

}
