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
		
		
		List<Object> contaCorrente = new ArrayList<>();
		
		contaCorrente.add(cc1);
		contaCorrente.add(cc2);
		contaCorrente.add(cc3);
		contaCorrente.add(cc4);
		contaCorrente.add(cc5);
		contaCorrente.add(cc6);
		contaCorrente.add(cc7);
		contaCorrente.add(cc8);
		contaCorrente.add(cc9);
		
		System.out.println(contaCorrente.size());
		
		ContaPoupanca cp1 = new ContaPoupanca();
		ContaPoupanca cp2 = new ContaPoupanca();
		ContaPoupanca cp3 = new ContaPoupanca();
		ContaPoupanca cp4 = new ContaPoupanca();
		ContaPoupanca cp5 = new ContaPoupanca();
		ContaPoupanca cp6 = new ContaPoupanca();
		ContaPoupanca cp7 = new ContaPoupanca();
		ContaPoupanca cp8 = new ContaPoupanca();
		ContaPoupanca cp9 = new ContaPoupanca();
		
		List<Object> contaPoupanca = new ArrayList<>();
		
        contaPoupanca.add(cp1);
		contaPoupanca.add(cp2);
		contaPoupanca.add(cp3);
		contaPoupanca.add(cp4);
		contaPoupanca.add(cp5);
		contaPoupanca.add(cp6);
		contaPoupanca.add(cp7);
		contaPoupanca.add(cp8);
		contaPoupanca.add(cp9);
		
		System.out.println(contaPoupanca.size());
		
		contaCorrente.remove(cc1);
		contaCorrente.remove(2);
		
		contaPoupanca.remove(cp1);
		contaPoupanca.remove(2);
		
		System.out.println(contaCorrente.size());
		System.out.println(contaPoupanca.size());
		
		for (Object object : contaCorrente) {
			System.out.println(object);
		}

		for (Object object : contaPoupanca) {
			System.out.println(object);
		}
		
		contaCorrente.clear();
		contaPoupanca.clear();
		
		System.out.println(contaCorrente.size());
		System.out.println(contaPoupanca.size());

	}

}
