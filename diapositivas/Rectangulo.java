public class Rectangulo{
	private int alto ;
	private int ancho ;

	public int getAlto(){
		return this.alto;
	}
	public int getAncho(){
		return this.ancho;
	}

	public int getArea(){
		return this.ancho*this.alto;
	}
	public void setAlto(int al){
		this.alto=al;
	}
	public void setAncho (int an){
		this.ancho=an;
	}

}
class TestRectangulo{
	public static void main (String[]args){
	Rectangulo r = new Rectangulo();
	r.setAlto (15);
	r.setAncho (20);
	System.out.println("El area del rectangulo es: " +r.getArea());

}

}
