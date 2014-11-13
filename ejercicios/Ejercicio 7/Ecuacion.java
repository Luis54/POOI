public class Ecuacion{
	//atributos
	private double a;
	private double b;
	private double c;
	
	//constructor
	public Ecuacion (double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	
	}
	
	public double x1(){
		return (-this.b+ Math.sqrt(this.b*this.b-(4*this.a*this.c)))/(2*this.a);
	
		}
	public double x2(){
		return (-this.b - Math.sqrt(this.b*this.b-(4*this.a*this.c)))/(2*this.a);
	
		}
	
}
class TestEcuacion{
		public static void main(String[]args){
		Ecuacion n = new Ecuacion(1,-6,5);
		System.out.println("La ecuacion de segundo grado tiene la solucion x1 : " +n.x1());
		System.out.println("La ecuacion de segundo grado tiene la solucion x2 : " +n.x2());
	
	
}
}
