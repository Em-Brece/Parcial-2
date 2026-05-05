package src.Logica;

public class Parcial {
	
	public int potencia(int b, int e) throws Exception {
		
		
		int acc = b;
	
		if(e<0) {
			throw new Exception("fuera del scope posible");
		}
		
		for(int i=2; i<e; i++) {
			
			acc = acc * b;
			
		}
		
		if(acc>2147483647) {
			
			throw new Exception("fuera del scope posible");
		}
		
		return acc;
	}

}
