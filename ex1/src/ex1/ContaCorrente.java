package ex1;

//Escreva uma classe ContaCorrente tendo como atributos (public) o nome do titular, cpf, numero da conta e saldo. Implemente os métodos sacar, depositar e mostrarDados.
//Crie uma classe ContaCorrenteMain com um método main que instancia um objeto de ContaCorrente e testa a classe criada. 
public class ContaCorrente {

	public String Nome;
	public String CPF;
	public Integer NumC;
	public Double Saldo;

	public Double Sacar(Double sacarD) {
		Saldo -= sacarD;
		return Saldo;
	}

	public Double Depositar(Double dep) {
		Saldo += dep;
		return Saldo;
	}

	public void mostrarD() {
		System.out.println("Titular: " + Nome);
		System.out.println("CPF: " + CPF);
		System.out.println("Numero Conta: " + NumC);
		System.out.println("Saldo: " + Saldo);
	}

}
