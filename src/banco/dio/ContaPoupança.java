package banco.dio;

public class ContaPoupan�a extends Conta {
	
	public ContaPoupan�a(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("--- Extrato Conta Poupan�a ---");
		super.ImprimirInformacoes();
	}
}
