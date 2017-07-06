package heranca;

import java.util.Date;
import orientacao_a_objetos.Cliente;
import orientacao_a_objetos.Funcionario;

public class TesteHeranca {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setNome("João");
		
		Cliente cliente2 = new Cliente();
		cliente2.setCodigo(2);
		cliente2.setNome("Maria");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("José");
		funcionario.setSalario(1000d);
		
		Funcionario funcionario1 = new Funcionario();
		funcionario.setNome("Joaquim");
		funcionario.setSalario(1000d);
		
		Emprestimo emprestimo = new Emprestimo(3000d, cliente, funcionario1);
		emprestimo.setDataDeContratacao(new Date());
		emprestimo.setTaxa(0.8);
		emprestimo.calculaTaxa();
		
		SeguroDeVeiculo seguroDeVeiculo = new SeguroDeVeiculo();
		seguroDeVeiculo.setCliente(cliente2);
		seguroDeVeiculo.setFuncionario(funcionario);
		seguroDeVeiculo.setDataDeContratacao(new Date());
		seguroDeVeiculo.setFranquia(1500d);
		seguroDeVeiculo.setValorDoSeguroDeVeiculo(2000d);
		seguroDeVeiculo.calculaTaxa();
		
	}

}
