package br.com.next;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.next.beans.Apolice;
import br.com.next.beans.Cartao;
import br.com.next.beans.Cliente;
import br.com.next.beans.Conta;
import br.com.next.beans.Endereco;
import br.com.next.beans.Pix;
import br.com.next.beans.Seguro;
import br.com.next.beans.TipoChavePix;
import br.com.next.exceptions.ResourceNotFoundException;
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
		// Cadastrar Pix
		Pix pix = new Pix(TipoChavePix.CPF,"chavePix",true);
		
		List<Pix> listaPix = new ArrayList<>();
		listaPix.add(pix);
		
	
		// Cadastrar conta
		Conta conta = new Conta(cliente,"39965",0,"banana",Util.toCalendar(Calendar.getInstance().getTime()),3.0,listaPix);
		
		contaRepository.save(conta);
		
		// CADASTRO DE APOLICE E SEGURO
		Seguro seguroDead  = new Seguro(2000.00,Util.toCalendar(Calendar.getInstance().getTime()),"Seguro de Morte","MEU seguro MINHAS regras");
		Seguro seguroJob  = new Seguro(1000.00,Util.toCalendar(Calendar.getInstance().getTime()),"Seguro Desespero","MEU seguro MINHAS regras");
		Seguro seguroInvalid  = new Seguro(500.00,Util.toCalendar(Calendar.getInstance().getTime()),"Seguro Invalidez","MEU seguro MINHAS regras");
//		
		
		
		double total = seguroDead.getValor() + seguroInvalid.getValor() + seguroJob.getValor(); 
		
		Apolice apolice = new Apolice(Util.toCalendar(Calendar.getInstance().getTime()),Arrays.asList(seguroDead,seguroJob,seguroInvalid),total);
		
		
		seguroDead.setApolice(apolice);
		seguroInvalid.setApolice(apolice);
		seguroJob.setApolice(apolice);
		
		apoliceRepository.save(apolice);
		
		Conta c = contaRepository.findById(1).orElseThrow(() -> new ResourceNotFoundException("Nenhuma conta encontrada"));
		
		Cartao cartao = new Cartao(c,"123456","ELO","654321",true,3000.00);
		
		cartaoRepository.save(cartao);


		/*
		int opcao = 0;
		while(opcao == 0 ) {
			System.out.println("Continua ? :");
			opcao = scanner.nextInt();
			if(opcao == 1) {
				
			} break;
		}
		*/
	}
	
	

}
