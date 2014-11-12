public class Palabra{
	private String palabra;

	//constructor
	
	public Palabra (String letra){
		this.palabra=letra;
	}
	
	public String getPalabra(){
		return this.palabra;
	}	
	//Metodo mayuscula
	public String toUpperCase(){
		return this.palabra.toUpperCase();
	}	
	
	//Metodo minuscula
	public String toLowerCase(){
		return this.palabra.toLowerCase();
	}	

	//Devuelve el numero de letras
	public int length(){
		return this.palabra.length();
	}	
	//Cambio la letra
	public String replace(char oldChar, char newChar){
			return this.palabra.replace('e' , 'a');
	}	
	
	//Metodo que devuelve la primera letra
	public String substring(int inicio ,int fin){
		return this.palabra.substring(0 ,1);
	}

}
class TestPalabra{
	public static void main(String[] args){
	Palabra p1 = new Palabra ("esto es un cadena"); 
	System.out.println("Palabra en Mayuscula: " +p1.toUpperCase());
	System.out.println("Palabra en Minuscula: " +p1.toLowerCase());
	System.out.println("La cadena tiene el numero de letras: " +p1.length());
	System.out.println("La cadena cambia la letra E por la A: " +p1.replace('e' , 'a' ));
	System.out.println("La primera letra de la cadena es: " +p1.substring(0,1));
	System.out.println("La primera letra de la cadena es: " +p1.substring(0,1));
}

}	
