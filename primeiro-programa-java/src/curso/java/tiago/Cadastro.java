package curso.java.tiago;

public class Cadastro {

	public static void main(String[] args) {
		
		String nome = "Tiago";
		String sobreNome = "Felipe dos Santos";
		int idade = 36;
		
		Pessoa p1 = new Pessoa();
		
		p1.setNome(nome);
		p1.setSobrenome(sobreNome);
		p1.setIdade(idade);
		
		System.out.println(p1.getNome() + " " + p1.getSobrenome() + " " + p1.getIdade() + " anos.");

	}

}
