package heranca;

import java.util.Date;
import orientacao_a_objetos.Cliente;
import orientacao_a_objetos.Funcionario;

public class Servico {
	
	private Cliente cliente;
	private Funcionario funcionario;
	private Date dataDeContratacao;

	public Servico(){
	}
	
	public Servico(Cliente cliente, Funcionario funcionario){
		this.cliente = cliente;
		this.funcionario = funcionario;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Date getDataDeContratacao() {
		return dataDeContratacao;
	}

	public void setDataDeContratacao(Date dataDeContratacao) {
		this.dataDeContratacao = dataDeContratacao;
	}
	
	public double calculaTaxa() {
	    return 5;
	}

}
