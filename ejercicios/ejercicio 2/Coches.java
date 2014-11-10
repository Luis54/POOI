public class Coches{
	private double deposito;
	private double consumo;
	
	public double getDeposito(){
		return this.deposito;
	
		}
	
	public double getConsumo(){
		return this.consumo;
	
		}
	public void setDeposito(double d){
		 this.deposito+=d;
	
	}
	public void setConsumo(double con ){
		this.consumo=con;

	
	}
	
	public double getKilometros(){
		return Math.round((this.deposito*100)/this.consumo); 

	
	}
	
	//este metodo no lo solicita el ejercicio.
	//metodo que ajusta el combustible despues de recorrer
	//cierta distancia
	
	public void combustibleRestante(double km){
		this.deposito -= km * this.consumo/100;
		//variable que me dice (true o false) si se puede hacer ese trayecto
		boolean posibleTrayecto = this.consumo >=0 ;
		System.out.println("¿Puede realizar el trayecto de " +km+ " km? " +posibleTrayecto);
		
		}
}	
class TestCoche{
		public static void main(String[] args){
		Coches c1 = new Coches ();
		Coches c2 = new Coches ();
		c1.setConsumo (4.5);	
		c1.setDeposito (5);
		c2.setConsumo (6.5);	
		c2.setDeposito (5);
		System.out.println("EL coche 1 tiene un consumo: " +c1.getConsumo() + " litros a los 100 kilometros " +c1.getKilometros()); 
		System.out.println("EL coche 2 tiene un consumo: " +c2.getConsumo() + " litros a los 100 kilometros " +c2.getKilometros() );
		c1.combustibleRestante (100);
		c2.combustibleRestante (100);
		 
		
	}
	
}	
 
