package br.com.next;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.next.beans.Cartao;
import br.com.next.beans.Cliente;
import br.com.next.beans.Conta;
import br.com.next.beans.Endereco;
import br.com.next.beans.Pix;
import br.com.next.beans.Seguro;
import br.com.next.beans.TipoChavePix;
import br.com.next.repositories.ApoliceRepository;
import br.com.next.repositories.CartaoRepository;
import br.com.next.repositories.ClienteRepository;
import br.com.next.repositories.ContaPoupancaRepository;
import br.com.next.repositories.ContaRepository;
import br.com.next.repositories.SeguroRepository;
import br.com.next.util.Util;

@SpringBootApplication
public class NextApplication implements CommandLineRunner{

	@Autowired
	private ContaRepository contaRepository;
	
	@Autowired
	private ContaPoupancaRepository contaPoupancaRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private CartaoRepository cartaoRepository;
	
	@Autowired
	private SeguroRepository seguroRepository;
	
	@Autowired
	private ApoliceRepository apoliceRepository;
	
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(NextApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//
//		Scanner scanner = new Scanner(System.in);
//		HashMap<Integer, Seguro> listaSeguros = new HashMap<>();
//		HashMap<Integer, Apolice> listaApolices= new HashMap<>();

		// Cadastrar endereco pelo cliente
		Endereco endereco = new Endereco("Elisio Teixeira",666,"039666-010","São Rafael","São Paulo","SP");	

		// Cadastrar Cliente e endereco
		Cliente cliente = new Cliente("Bruno","48256878809",endereco);

		clienteRepository.save(cliente);

//		// Cadastrar Pix
//		Pix pix = new Pix(TipoChavePix.CPF,"chavePix",true);
//		
//		List<Pix> listaPix = new ArrayList<>();
//		listaPix.add(pix);
//		
//	
//		// Cadastrar conta
//		Conta conta = new Conta(cliente,"39965",2000.00,"banana",Util.toCalendar(Calendar.getInstance().getTime()),3.0,listaPix);
//		
//		// Cadastrar cartao
//		Cartao cartao = new Cartao(conta,"123456789","ELO","123456",true,3000.00);
		

		// Cadastrar Seguro
//		Calendar cal = apolice.getDataAssinatura();
//		Seguro seguro = new Seguro(400.00, Calendar.getInstance());

		
//		conta.setNumeroConta(UUID.randomUUID().toString());
//		System.out.println(conta.getSaldo());
//		conta.setSaldo(0);
//		conta.setSenha("1234567");use
//		contaRepository.save(conta);
//		
//		Conta c = contaRepository.findByNumberAccount("a419b8df-5e5a-4a46-be1a-b00d70d25880");
//		System.out.println(c.getSenha());
//		u.menuAbertura();
//
//		int opcao = 0;
//		while(opcao == 0 ) {
//			System.out.println("Continua ? :");
//			opcao = scanner.nextInt();
//			if(opcao == 1) {
//				
//			} break;
//		}
		


//		if (opcao == 1) {
//			// String nome, String cpf, String logradouro, int numero, String cep, String
//			// bairro, String cidade, String uf
//			System.out.print("Digite seu nome: ");
//			s.next();
//			String nome = s.nextLine();
//			System.out.print("Digite seu CPF: ");
//			String cpf = s.next();
//			System.out.print("Logradouro: ");
//			s.next();
//			String end = s.nextLine();
//			System.out.print("N�mero: ");
//			int num = s.nextInt();
//			System.out.print("CEP: ");
//			String cep = s.next();
//			System.out.print("Bairro: ");
//			s.next();
//			String bairro = s.nextLine();
//			System.out.print("Cidade: ");
//			s.next();
//			String cidade = s.nextLine();
//			System.out.print("Estado: ");
//			s.next();
//			String uf = s.nextLine();
//
//			cliente = cbo.cadastrarCliente(nome, cpf, end, num, cep, bairro, cidade, uf);
//		}

//		Util u = new Util();
//
//		// Cadastrar Seguro
//		Seguro seguro = new Seguro();
//		
//		System.out.println("===== CADASTRO DE SEGUROS =====");
//		
//		System.out.println("Nome do seguro: ");
//		String nomeSeguro = scanner.nextLine();
//		seguro.setNome(nomeSeguro);
//		
//		System.out.println("Regras: ");
//		String regras = scanner.nextLine();
//		seguro.setRegras(regras);
//		
//		System.out.println("Valor: ");
//		double valor = scanner.nextDouble();
//		seguro.setValor(valor);
//		
//		listaSeguros.put(1, seguro);
//		
//		listaSeguros.forEach((chave, val) -> {System.out.println("chave: " + chave+ ", valor: " + val.getNome());});
//		
//		System.out.println("===== CADASTRO DE APÓLICE =====");
//		Apolice apolice = new Apolice();
//		
//		System.out.println("Data da assinatura ( DD/MM/YYY )");
//		String dataAsssinatura = scanner.next();
//	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//	    Calendar c = Calendar.getInstance();     
//	    c.setTime(sdf.parse(dataAsssinatura));
//	    apolice.setDataAssinatura(c);
//	    apolice.setSeguros(listaSeguros);
//	    listaApolices.put(1, apolice);
//	    
//	    
//	    //	    
//		listaApolices.forEach((chave, val) -> {
//			System.out.println("ID Apólice: " + chave+ "\nNome do seguro: " + val.getSeguros().toString());
//			});
//		
//		System.out.println("fim");

	}
	
	

}
