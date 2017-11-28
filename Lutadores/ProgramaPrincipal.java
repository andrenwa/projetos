package Lutadores;

public class ProgramaPrincipal {

	public static void main (String[] args) {
	Lutador lutador1= new Lutador("antonio", "brasil", 40,1.65,83, 2, 3, 1);
	
	Lutador lutador2= new Lutador("carlos", "franca", 40,1.65,55, 2, 3, 3);
	
	Lutador lutador3= new Lutador("miguel", "irlanda", 40,1.65,84, 3, 3, 3);
	
	Lutador lutador4= new Lutador("marcos", "noruega", 40,1.65,70, 2, 3, 3);
	
	Lutador lutador5= new Lutador("pedro", "portugal", 40,1.65,73, 2, 3, 3);
	
	Lutas luta1= new Lutas();
	
	luta1.marcaLuta(lutador1, lutador5);
	System.out.println("=======================================");
	luta1.lutar();

	
	
	
	
	
	
	
	
	//lutador1.status();
	
	//System.out.println();
	//lutador2.status();
	//System.out.println();
	//lutador3.status();
	//System.out.println();
	//lutador4.status();
	//System.out.println();
	//lutador5.status();

	}
	
	
	

}