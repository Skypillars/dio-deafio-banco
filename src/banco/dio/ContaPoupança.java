package banco.dio;

public class ContaPoupança extends Conta {
	
	public ContaPoupança(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("--- Extrato Conta Poupança ---");
		super.ImprimirInformacoes();
	}
}
