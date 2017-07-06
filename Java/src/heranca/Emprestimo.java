package heranca;

import orientacao_a_objetos.Cliente;
import orientacao_a_objetos.Funcionario;

public class Emprestimo {
	
	private double valor;
	private double taxa;
	
	public Emprestimo() {
	}
	
	public Emprestimo(double valor, Cliente cliente, Funcionario funcionario){
		super(cliente, funcionario);
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	@Override
	public double calculaTaxa() {
		return super.calculaTaxa() + this.valor * 0.1;
	}


}
