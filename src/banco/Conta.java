package banco;

public class Conta {
	private Pessoa cliente;
	private int nrConta;
	
	public Conta(Pessoa cliente, int nrConta, double saldo) {
		super();
		this.cliente = cliente;
		this.nrConta = nrConta;
		this.saldo = saldo;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	private double saldo;
	
	public int getNrConta() {
		return nrConta;
	}
	public void setNrConta(int nrConta) {
		this.nrConta = nrConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta abrirConta(Pessoa cliente, int nrConta, double saldo){
		Conta c = new Conta(cliente, nrConta, saldo);
		return c;
	}
	
	public void sacar(double valor) {
		int ver = temSaldo(valor);
		
		if(ver==0) {
			System.out.println("Saldo insuficiente para essa operação");
		}
		
		else{
			debitar(valor);
			System.out.println("Operação de saque realizada com sucesso");
		}
	}
	
	private void debitar(double valor) {
		this.saldo -= valor;
	}
	
	protected int temSaldo(double valor) {
		int ver=0;
		
		if(valor<=saldo)
			ver++;
		
		
		return ver;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void transferir(Conta recebedora, double valor) {
		int ver = temSaldo(valor);
		
		if(ver==0) {
			System.out.println("Saldo insuficiente para essa operação");
		}
		else {
			debitar(valor);
			recebedora.depositar(valor);
			System.out.println("Transferência realizada com sucesso");
		}
	}
	
}
