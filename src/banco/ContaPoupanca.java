package banco;

public class ContaPoupanca extends Conta{
	private double txCorrecao;

	public ContaPoupanca(Pessoa cliente, int nrConta, double saldo, double txCorrecao) {
		super(cliente, nrConta, saldo);
		this.txCorrecao = txCorrecao;
	}

	public double getTxCorrecao() {
		return txCorrecao;
	}

	public void setTxCorrecao(double txCorrecao) {
		this.txCorrecao = txCorrecao;
	}
	
	public void atualizaSaldoRendimento(ContaPoupanca c) {
		double s = c.getSaldo();
	    double tx = c.getTxCorrecao();
	    s*=tx;
	    c.setSaldo(s);
	}
	
	public ContaPoupanca abrirConta(Pessoa cliente, int nrConta, double saldo,  double txCorrecao){
		ContaPoupanca c = new ContaPoupanca(cliente, nrConta, saldo, txCorrecao);
		return c;
	}

}
