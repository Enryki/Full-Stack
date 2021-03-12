package banco;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(Pessoa cliente, int nrConta, double saldo, double limite) {
		super(cliente, nrConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	protected int temSaldo(double valor) {
		int ver=0;
		double s = getSaldo();
		
		if(valor<=s+limite)
			ver++;
		
		return ver;
	}
	
	public ContaEspecial abrirConta(Pessoa cliente, int nrConta, double saldo, double limite){
		ContaEspecial c = new ContaEspecial(cliente, nrConta, saldo, limite);
		return c;
	}

}
