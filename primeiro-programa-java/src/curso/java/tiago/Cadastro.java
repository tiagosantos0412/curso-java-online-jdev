package curso.java.tiago;

public class Cadastro {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Tiago");
		p1.setSobrenome("Felipe dos Santos");
		p1.setIdade(36);
		p1.setCpf("36568593885");
		
		System.out.println(p1.getNome() + " " + p1.getSobrenome() + " " + p1.getIdade() + " anos.");
		System.out.println("Número do CPF: " + p1.getCpf());

	}

}
