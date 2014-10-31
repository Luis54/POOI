public class Circulo{

	//atributo
	/*cualquier Circulo que creemos tendra 
	*siempre un valor INICIAL de 5 */
	private int radio=5;

	//metodo que devulve el radio
	public int getRadio(){
		return this.radio;

	}
	
	//metodo que cambia el radio
	public void SetRadio(int r){
		this.radio=r;
	}

}
class TestCirculo{
	public static void main(String[]args){
		//crea un objeto de tipo circulo
		Circulo c=new Circulo();//Crea un circulo de radio 5
		Circulo c2 = new Circulo(); //Cambio el valor del circulo 2 
		c2.SetRadio (15);
		System.out.println("Radio del circulo: " + c.getRadio());
		System.out.println("Radioi del circulo2: " + c2.getRadio());
	}	
}
