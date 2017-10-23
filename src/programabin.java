import java.util.Scanner;

public class programabin {

	public static void main(String[] args){
	
		Scanner entrada = new Scanner( System.in );
		
	convertirbin conv = new convertirbin();
	
	System.out.println("Ingrese un numero para convertir de decimal a binario: ");
	int convertirbin= entrada.nextInt();
	
	conv.convertir(convertirbin);
	
	
	}
}
