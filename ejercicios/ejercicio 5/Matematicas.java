public class Matematicas{
	private double numero;
	
	//getter
	
	public double getNumero(){
		return this.numero;
	}	
	
	public double getRaiz(){
		return (Math.sqrt (numero));
		
	}	
	
	public double getRaizCubica(){
		return (Math.round(Math.cbrt (numero)));
		
	}
	
	public long getRedonde(){
		return (Math.round (numero));
		
	}
	public double getAleatorio(){
		return Math.round(Math.random()*this.numero);
	}
	//setter
	
	public void setNumero(double num){
		this.numero=num;
	}	

		
	
}	
class TestMatematicas{
	public static void main (String[]args){
	Matematicas n1 = new Matematicas();
	Matematicas n2 = new Matematicas();
	Matematicas n3 = new Matematicas();
	Matematicas n4 = new Matematicas();
	Matematicas n5 = new Matematicas();
	n1.setNumero(4);
	n2.setNumero(6);
	n3.setNumero(12);
	n4.setNumero(2.3);
	n5.setNumero(2.3);
	System.out.println("funcionamiento del metodo: " +n1.getNumero());
	System.out.println("Un metodo que devuelva la raiz cuadrada de dicho numero: " +n2.getRaiz());
	System.out.println("Un metodo que devuelva la raiz cubica de dicho numero en valor absoluto: " +n3.getRaizCubica());
	System.out.println("Un metodo que redondee el numero de tipo double a entero: " +n4.getRedonde());
	System.out.println("Numero aleatorio : " +n5.getAleatorio());
	}
	
}
