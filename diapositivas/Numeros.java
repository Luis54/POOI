public class Numeros{
		//atributos valor
		private int valor;
		//getter
		public int getValor(){
			return this.valor;
		}
		//setter
		public void setValor(int valor){
			System.out.println("Usando metodo setValor(int valor)");
			this.valor=valor;
			
			}
			
		public void setValor(double valor){
			System.out.println("Usando metodo setValor(double valor)");
			this.valor=(int)valor; //convierte el entero en double (int)
			return;
			//System.out.println("Saliendo de metodo setValor(double valor)"); //no lo imprime ya que a salido del return
			
			}

}

