public class Libro{
	private String isbn;
	private String autor;
	private String titulo;
	private boolean disponible = true;
	
	
	public Libro (String nombre,String autor,String isbn){
		this.titulo=nombre;
		this.autor=autor;
		this.isbn=isbn;		
	}
	public String getTitulo(){
		return this.titulo;
		
		}
	
	public String getAutor(){
		return this.autor;
		
		}
		
		
	public String getIsbn(){
		return this.isbn;
		
		}	
	public boolean getDisponible(){
		return this.disponible;
		
		
		}
		
	public void setIsbn (String isbn){
		 this.isbn=isbn;
		
		
		}	
	public void prestar(){
			this.disponible=false;
		
	}
	@Override	
	public String toString(){
		return "Libro: "+this.titulo+ " de " +this.autor+ " con isbn: "+this.isbn;
		
		
		}	
			
	}
class TestLibro{
	public static void main (String[] args){
		//creamos objetos o instancias de la clase libro
		Libro l1 = new Libro("El Quijote", "Cervantes", "1-23-11111-3"); 
		Libro l2 = new Libro("El lazarrillo ...", "Anonimo", "2-23-11111-3"); 
		Libro l3 = new Libro("La Celestina ", "Fernando de Rojas", "3-23-11111-3"); 
		
		//vamos a invocar el metodo ToString()
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		//consulta de disponibilidad
		System.out.println("----------------------------------");
		System.out.println(l1+"DISPONIBLE: "+ l1.getDisponible());
		System.out.println(l2+"DISPONIBLE: "+ l2.getDisponible());
		System.out.println(l3+"DISPONIBLE: "+ l3.getDisponible());
		//preastmos los dos primeros
		l1.prestar(); l2.prestar();
		//Consutla disponibilidad
		System.out.println(l1+" DISPONIBLE: "+ l1.getDisponible());
		System.out.println(l2+" DISPONIBLE: "+ l2.getDisponible());
		System.out.println(l3+" DISPONIBLE: "+ l3.getDisponible());
		
	}
}	
	
