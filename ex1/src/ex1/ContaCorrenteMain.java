package ex1;

public class ContaCorrenteMain extends ContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente cC = new ContaCorrente();
		cC.Nome = "Ana Clara";
		cC.CPF = "094.339.879-77";
		cC.NumC = 033;
		cC.Saldo = 3300.00;
		
		cC.mostrarD();
		
		Double sacarD = 20.00;
		cC.Sacar(sacarD);
		System.out.println("Saldo:"+ cC.Saldo);
		
		Double dep = 330.00;
		cC.Depositar(dep);
		System.out.println("Saldo:" + cC.Saldo);
	}
	

}
