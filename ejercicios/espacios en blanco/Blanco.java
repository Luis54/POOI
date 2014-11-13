//complemento del ejercicio Palabra.java
public class Blanco{
	//atributos
 private String palabra;
	//constructor
 public Blanco(String p){	
		this.palabra=p;
}	
	//metodo que elimina espacios en blanco
	//al principio y al final
	public String eliminaBlancosPrincipioFinal(){
	return this.palabra.trim();
}

	//metodo que elimna todos los espacios en blanco
	public String eliminaTodosBlancos(){
		return this.palabra.replace(" ","");
		
		}
	public String getPalabra(){
		return this.palabra;
	}	
}
class TestBlancos{
		public static void main(String[] args){
			
				//creamos un objeto de tipo BLanco
				
				Blanco b = new Blanco(" Esto es una cadena ");
				System.out.println(b.getPalabra()+" "+b.getPalabra().length());
				System.out.println(b.eliminaBlancosPrincipioFinal());
				System.out.println(b.eliminaTodosBlancos());
			
	
	
}

}
