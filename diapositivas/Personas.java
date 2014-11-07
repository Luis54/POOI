public class Personas{
	//atributos
	private String nombre;
	private int edad;
	//constructor
	public Personas (String n, int e){
		this.nombre=n;
		this.edad=e;
	}
	//getter porque los atributos son private
	
	public String getNombre(){
		return this.nombre;
		
	}
	public int getEdad(){
		return this.edad;
		
	}
	public void setNombre(String n){
		this.nombre=n;
		
	}
	public void setEdad(int e){
		this.edad=e;
		
	}
}
class TestPersonas{
	public static void main (String [] args){
		//sin referenica
		
		//new Personas(); no compila porque hay constructores
		new Personas("juan",23);
		new Personas("juan",23);
		//con referencias
		Personas p1= new Personas ("juan",23);
		Personas p2= new Personas ("Luis",23);
		//Personas p1= new Personas ("juan",25);//error ya que p1 ya esta definida aunque cambies los datos
		System.out.println(p1+" "+p1.getNombre()+" "+p1.getEdad());
		System.out.println(p2+" "+p2.getNombre()+" "+p2.getEdad());
		p1=p2;
		System.out.println(p1+" "+p1.getNombre()+" "+p1.getEdad());
		System.out.println(p2+" "+p2.getNombre()+" "+p2.getEdad());
		
		p1.setNombre("Berna");
		p1.setEdad(102);
		System.out.println(p1+" "+p1.getNombre()+" "+p1.getEdad());
		System.out.println(p2+" "+p2.getNombre()+" "+p2.getEdad());
		
		
		
		
		}
	
	
	
	
}
