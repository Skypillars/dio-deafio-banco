package banco.dio;

import java.util.ArrayList;
import java.util.List;

public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Conta> contas = new ArrayList<Conta>();
		
		Cliente cliente = new Cliente("Váleria"); 
		
		Conta cc = new ContaCorrente(cliente);
		Conta cp = new ContaPoupança(cliente);
		
		cc.depositar(100);
		cp.depositar(50);
		cc.transferir(25, cp);
		
		contas.add(cc);
		contas.add(cp);
		
		Banco banco = new Banco("Bradesco", contas);
		
		for(Conta conta : banco.getContas()) {
			conta.imprimirExtrato();
		}
	}

}
