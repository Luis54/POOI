public class Letra{
	 //atributo
	 private int letra;
	 
	public Letra(String arg){
		new Letra();
	}
	public int getLetra(){
	 return this.letra;	
		
	}	
}
class TestLetra{
		public static void main(String[]args){
				//new Letra(); el constrctor es privado
				new Letra();
				Letra l1 = new Letra();
				int let = l1.getLetra();
				System.out.println(+l1.getLetra());
				System.out.println(let);
				let= 10;
				System.out.println("l1 "+l1.getLetra());
				System.out.println("let" +let);
			
	}

}
