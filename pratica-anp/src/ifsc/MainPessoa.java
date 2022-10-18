package ifsc;

public class MainPessoa {

	public static void main(String[] args) {
		
		Professor prof = new Professor();
		Aluno aluno = new Aluno();
		
		aluno.setNome("Ana Clara");
		aluno.setMatricula(698);
		aluno.setCpf("09433987977");
		
		prof.setNome("Bruna");
		prof.setSiape(4000);
		prof.setCpf("23695684711");
		
		System.out.println("Nome do aluno:"+aluno.getNome());
		System.out.println("Mátricula do aluno:"+aluno.getMatricula());
		System.out.println("Cpdf do aluno:"+aluno.getCpf());

		System.out.println("\nNome do professor:"+prof.getNome());
		System.out.println("Siape do professor:"+prof.getSiape());
		System.out.println("Cpf do professor:"+prof.getCpf());
		
	}
	
}
