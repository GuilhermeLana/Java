package collectionsJava;

import java.util.ArrayList;
import java.util.List;


public class TesteConta {
	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
		ContaCorrente cc3 = new ContaCorrente();
		ContaCorrente cc4 = new ContaCorrente();
		ContaCorrente cc5 = new ContaCorrente();
		ContaCorrente cc6 = new ContaCorrente();
		ContaCorrente cc7 = new ContaCorrente();
		ContaCorrente cc8 = new ContaCorrente();
		ContaCorrente cc9 = new ContaCorrente();
		
		
		List<ContaCorrente> lContas = new ArrayList<>();
		
		lContas.add(cc1);
		lContas.add(cc2);
		lContas.add(cc3);
		lContas.add(cc4);
		lContas.add(cc5);
		lContas.add(cc6);
		lContas.add(cc7);
		lContas.add(cc8);
		lContas.add(cc9);
		
		System.out.println(lContas.size());
		
		ContaPoupanca cp1 = new ContaPoupanca();
		ContaPoupanca cp2 = new ContaPoupanca();
		ContaPoupanca cp3 = new ContaPoupanca();
		ContaPoupanca cp4 = new ContaPoupanca();
		ContaPoupanca cp5 = new ContaPoupanca();
		ContaPoupanca cp6 = new ContaPoupanca();
		ContaPoupanca cp7 = new ContaPoupanca();
		ContaPoupanca cp8 = new ContaPoupanca();
		ContaPoupanca cp9 = new ContaPoupanca();
		
		List<ContaPoupanca> lContasP = new ArrayList<>();
		
		lContasP.add(cp1);
		lContasP.add(cp2);
		lContasP.add(cp3);
		lContasP.add(cp4);
		lContasP.add(cp5);
		lContasP.add(cp6);
		lContasP.add(cp7);
		lContasP.add(cp8);
		lContasP.add(cp9);
		
		System.out.println(lContasP.size());
		
		lContas.remove(cc1);
		lContas.remove(2);
		
		lContasP.remove(cp1);
		lContasP.remove(2);
		
		System.out.println(lContas.size());
		System.out.println(lContasP.size());
		
		for (ContaCorrente cc : lContas) {
			System.out.println(cc.);
		}

		for (Object object : lContasP) {
			System.out.println(object);
		}
		
		lContas.clear();
		lContasP.clear();
		
		System.out.println(lContas.size());
		System.out.println(lContasP.size());

	}

}
