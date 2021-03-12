package banco;

import java.util.Calendar;

public class PessoaFisica extends Pessoa{
	private int cpf;
	private Calendar dtNascimento;
	private String genero;
	
	public PessoaFisica(int id, String nome, String endereco, int cpf, Calendar dtNascimento, String genero) {
		super(id, nome, endereco);
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.genero = genero;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Calendar getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getIdade() {
		int idade;
		Calendar hoje = Calendar.getInstance();
		
		int dhoje = hoje.get(Calendar.DAY_OF_MONTH);
		int mhoje = hoje.get(Calendar.MONTH);
		int ahoje = hoje.get(Calendar.YEAR);
		
		int daniv = this.dtNascimento.get(Calendar.DAY_OF_MONTH);
		int maniv = this.dtNascimento.get(Calendar.MONTH);
		int aaniv = this.dtNascimento.get(Calendar.YEAR);
		
		idade = ahoje - aaniv;
		
		if(mhoje<maniv)
			idade--;
		
		else if(mhoje==maniv)
			if(dhoje<daniv)
				idade--;
		
		return idade;
	}
	
}
