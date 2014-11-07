public class Digitos{
	private int valor;

	
	}
	
class Digitos2{
	//constructor
	private int valor;
	public Digitos2(){
		this.valor=5;
	}
	//constructor
	public Digitos2(int d){
		this.valor=d;
	}
	//getter
	public int getValor(){
		return this.valor;
		
	}
	//setter
	public void setValor(int d){
		this.valor=d;
		
		}
}	
	
class TestDigitos{
	public static void main(String[] args){
		/*vamos a crear un objeto de
		 * la clase digitos,sin que tenga
		 * un constructor y ademas
		 * sin referencia*/
		 
		 new Digitos();
		//creo ahora un objeto Digitos con referencia
		Digitos d= new Digitos();
		//intento acceder al valor de un atributo
		//System.out.println(d.valor); no puedo acceder porque valor es privado
		
		
		//Crea objetos de tipo Digitos2
		
		
		
		Digitos2 d2= new Digitos2();
		System.out.println(d2.getValor());
		//d.2Digitos2 (8); no funciona, tampoco esto d2.valor=8 porque atributo valor es de tipo private
		
		Digitos2 d22 = new Digitos2(8);
		System.out.println(d22.getValor()); //para comprobar que se inicializa a valor de 8
		
		d22.setValor(18);
		System.out.println(d22.getValor()); //actualiza al valor de 19
		}
	
	
	
	
}
