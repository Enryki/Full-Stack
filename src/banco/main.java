package banco;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class main {
	public static void main (String[] args) {
		
		Calendar idadeLuiz = Calendar.getInstance();
		idadeLuiz.set(2001,4,23);
		
		Calendar idadeMaria = Calendar.getInstance();
		idadeMaria.set(1999,2,14);
		
		PessoaFisica Luiz = new PessoaFisica(1, "Luiz", "Anápolis", 999, idadeLuiz, "Masculino");
		PessoaFisica Maria = new PessoaFisica(2, "Maria", "Goiânia", 888, idadeMaria, "Feminino");
		
		System.out.println(Luiz.getIdade());
		System.out.println(Maria.getIdade());
		
		System.out.println("-------------------------");
		
		ContaEspecial ceLuiz = new ContaEspecial(Luiz, 14, 1000.0, 200.0);
		ContaPoupanca cpMaria = new ContaPoupanca(Maria, 15, 1000.0, 1.005);
		
		System.out.println(ceLuiz.getSaldo());
		System.out.println(cpMaria.getSaldo());
		
		ceLuiz.transferir(cpMaria, 200.0);
		
		System.out.println(ceLuiz.getSaldo());
		System.out.println(cpMaria.getSaldo());
		
		System.out.println("-------------------------");
		
		PessoaJuridica Apple = new PessoaJuridica(3, "Apple SA", "California", 111, "Tecnologia");
		PessoaJuridica Padaria = new PessoaJuridica(3, "Pão de Quejo e Companhia", "Setor Universitário", 222, "Alimentação");
		
		ContaEspecial ceApple = new ContaEspecial(Apple, 3, 100000.0, 10000.0);
		ContaPoupanca cpPadaria = new ContaPoupanca(Padaria, 4, 1500.0, 0.03);
		
		System.out.println(ceApple.getSaldo());
		System.out.println(cpPadaria.getSaldo());
		
		ceApple.transferir(cpPadaria, 5000.0);
		
		System.out.println(ceApple.getSaldo());
		System.out.println(cpPadaria.getSaldo());
		
		System.out.println("-------------------------");
		
		System.out.println(ceLuiz.getSaldo());
		ceLuiz.sacar(1100.0);
		System.out.println(ceLuiz.getSaldo());
		ceLuiz.sacar(1000.0);
		System.out.println(ceLuiz.getSaldo());
		
		System.out.println("-------------------------");
		
		List<Conta> listConta = new ArrayList<Conta>();
		listConta.add(ceLuiz);
		listConta.add(cpMaria);
		listConta.add(ceApple);
		listConta.add(cpPadaria);
		
		Double total = 0.0;
		for(Conta c : listConta){
			System.out.println("Nome: "+c.getCliente().getNome()+", saldo: R$ "+c.getSaldo());
			total += c.getSaldo();
		}
		
		System.out.println("-------------------------");
		
		System.out.println("Total: R$ " + total);
	}
}
