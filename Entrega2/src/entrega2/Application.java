package entrega2;

/*
 * Para esse exercicio foram "criados" dois novos cadastros na instituição. Porem o novo aluno(aluno2), já era professor da instituiçao.
 * O novo professor(professor2) já era aluno da instituição. Portanto os dois pussuem cadastro na mesma. Sendo assim foi criada uma tentativa
 * de "baratear" o custo com novos objetos, fazendo com que os dados do professor2 apontassem para os mesmos dados do aluno1. Para o aluno2, acontece
 * a mesma coisa.
 */

public class Application {
	public static void main(String[] args) {
		Aluno aluno1= new Aluno();
		Endereco al = new Endereco();
		aluno1.setNome("Gabriel Santana");
		aluno1.setCpf("123456789-00");
		al.setRua("Rua Aldalberto Guerra");
		al.setNumero(191);
		al.setComplemento("A");
		al.setCidade("Recife/PE");
		aluno1.setEndereco(al);
		aluno1.setAnoEntrada(2018);
		aluno1.setPeriodoEntrada(1);
						
		Professor professor1 = new Professor();
		Endereco prof = new Endereco();
		professor1.setNome("Juvenal Rodrigues");
		professor1.setCpf("987654321-00");
		professor1.setAdmissao(new java.util.Date());
		prof.setRua("Rua Joaquim Felipe");
		prof.setNumero(123);
		prof.setComplemento("");
		prof.setCidade("Olinda/PE");
		professor1.setEndereco(prof);
				
		System.out.printf("Aluno: %s \nCPF: %s \n", aluno1.getNome(), aluno1.getCpf());
		System.out.printf("Endereço: %s %s %s, %s \n", aluno1.getEndereco().getRua(), aluno1.getEndereco().getNumero(), aluno1.getEndereco().getComplemento(), aluno1.getEndereco().getCidade() );
		System.out.printf("Ano de Entrada: %s Periodo: %s \n", aluno1.getAnoEntrada(), aluno1.getPeriodoEntrada());
		System.out.println();
		
		System.out.printf("Professor: %s \nCPF: %s \n", professor1.getNome(), professor1.getCpf());
		System.out.printf("Endereço: %s %s %s, %s \n", professor1.getEndereco().getRua(), professor1.getEndereco().getNumero(), professor1.getEndereco().getComplemento(), professor1.getEndereco().getCidade());
		System.out.println(professor1.getAdmissao());
		System.out.println();
		
		//Criação do novo professor(professor2).
		Professor professor2 = new Professor();
		professor2.setNome(aluno1.getNome());
		professor2.setCpf(aluno1.getCpf());
		professor2.setEndereco(aluno1.getEndereco());
		professor2.setAdmissao(new java.util.Date());
		
		//Criação do novo aluno(aluno2).
		Aluno aluno2 = new Aluno();
		aluno2.setNome(professor1.getNome());
		aluno2.setCpf(professor1.getCpf());
		aluno2.setEndereco(professor1.getEndereco());
		aluno2.setAnoEntrada(2019);
		aluno2.setPeriodoEntrada(2);
		
		System.out.printf("Aluno: %s \nCPF: %s \n", aluno2.getNome(), aluno2.getCpf());
		System.out.printf("Endereço: %s %s %s, %s \n", aluno2.getEndereco().getRua(), aluno2.getEndereco().getNumero(), aluno2.getEndereco().getComplemento(), aluno2.getEndereco().getCidade() );
		System.out.printf("Ano de Entrada: %s Periodo: %s \n", aluno2.getAnoEntrada(), aluno2.getPeriodoEntrada());
		System.out.println();
		
		System.out.printf("Professor: %s \nCPF: %s \n", professor2.getNome(), professor2.getCpf());
		System.out.printf("Endereço: %s %s %s, %s \n", professor2.getEndereco().getRua(), professor2.getEndereco().getNumero(), professor2.getEndereco().getComplemento(), professor2.getEndereco().getCidade());
		System.out.println(professor2.getAdmissao());
		System.out.println();
		
		
		
	}
	
}