package lista2.companhiaAerea;

import java.util.List;

public class CompanhiaArea {
	
	private List<Boeing> boeings;
	private List<Monomotor> monomotores;
	private List<Bimotor> bimotores;
	
	public List<Boeing> getBoeings() {
		return boeings;
	}


	public void setBoeings(List<Boeing> boeings) {
		this.boeings = boeings;
	}


	public List<Monomotor> getMonomotores() {
		return monomotores;
	}


	public void setMonomotores(List<Monomotor> monomotores) {
		this.monomotores = monomotores;
	}



	public List<Bimotor> getBimotores() {
		return bimotores;
	}


	public void setBimotores(List<Bimotor> bimotores) {
		this.bimotores = bimotores;
	}


	double retornaFaturamentoPassagens(){
		double faturamento = 0;
		for (Bimotor bimotor : bimotores) {
			double faturamentoBimotor = bimotor.getLugares() * bimotor.getValorPassagem();
			faturamento += faturamentoBimotor;
		}
		for (Boeing boeing : boeings) {
			double faturamentoBoeing = boeing.getLugares() * boeing.getValorPassagem();
			faturamento += faturamentoBoeing;
		}
		for (Monomotor monomotor : monomotores){
			double faturamentoMonomotor = monomotor.getLugares() * monomotor.getValorPassagem();
			faturamento += faturamentoMonomotor;
		}
		return faturamento;
	}

}
