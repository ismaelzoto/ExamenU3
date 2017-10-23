import java.util.Stack;

public class convertirbin {

	public void convertir(int n){	


		Stack<Integer> pila=new Stack<Integer>();

		do{	
			pila.push((int) (n % 2)); 
			n = n / 2;
		}while(n>0);	

		// Vaciamos la pila
		System.out.println("conversion en una --Pila-- de Decimal a Binario ");
		while (!pila.empty())
		System.out.println(pila.pop());
	}
}


