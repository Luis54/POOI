import javax.swing.JOptionPane;
public class Pares{
	private int numero;
	
	public Pares(int num){
		this.numero=num;
	}
	public boolean esPar(){
		return this.numero % 2 ==0;
		
		
	}
	public String toString(){
		if (esPar()){return "el numero " +this.numero+ " Es Par " ;}
		else {return "el numero " +this.numero+ " Es Impar ";}
	}
	

public static void main(String[] args){
	String num1 =JOptionPane.showInputDialog("Introduce un mumero");
	int numero1 = Integer.parseInt(num1);
	Pares n1 = new Pares(numero1);
	boolean b1 = n1.esPar();
	String num2 =JOptionPane.showInputDialog("Introduce otro numero");
	int numero2 = Integer.parseInt(num2);
	Pares n2 = new Pares(numero2);
	boolean b2 = n2.esPar();
	System.out.println(n1);
	System.out.println(n2);
	}

}
