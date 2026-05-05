package src.Consola;

import java.util.Scanner;
import src.Logica.Parcial;

public class ConsolaInteractiva {
	
	private Parcial parcial;
	private Scanner sc;
	
	public ConsolaInteractiva() {
		
		this.parcial = new Parcial();
		this.sc = new Scanner(System.in);
		
		System.out.println("digite el valor b:");
		int num1 = this.sc.nextInt();
		
		System.out.println("digite el valor e:");
		int num2 = this.sc.nextInt();
		
		try {
			System.out.println(this.parcial.potencia(num1, num2));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		new ConsolaInteractiva();
		
	}
	
}	
	
	
	