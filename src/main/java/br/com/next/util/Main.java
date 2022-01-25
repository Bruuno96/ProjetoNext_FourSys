package br.com.next.util;

import java.util.Calendar;
import java.util.Date;

import org.springframework.expression.ParseException;

public class Main {
	
	public static void main(String[] args) throws ParseException, Exception {
		
		Calendar cal = Calendar.getInstance();
		Date date =new Date();
		cal.setTime(date);		
		System.out.println(cal.getTime());
		
//		Cliente cliente = new Cliente();
//        Conta conta = new Conta();
//        Scanner s = new Scanner(System.in);
//        ClienteBo cbo = new ClienteBo();
//        ContaBo ccbo = new ContaBo();
//        ContaPoupanca cp = new ContaPoupanca();
//        ContaPoupancaBo cpbo = new ContaPoupancaBo();
//        Pix pix = new Pix();
//        PixBo pbo = new PixBo();
//        Util u = new Util();
//
//        u.menuAbertura();
//
//        int opcao = 0;
//
//        if (opcao == 1) {
//            // String nome, String cpf, String logradouro, int numero, String cep, String
//            // bairro, String cidade, String uf
//            System.out.print("Digite seu nome: ");
//            s.next();
//            String nome = s.nextLine();
//            System.out.print("Digite seu CPF: ");
//            String cpf = s.next();
//            System.out.print("Logradouro: ");
//            s.next();
//            String end = s.nextLine();
//            System.out.print("Número: ");
//            int num = s.nextInt();
//            System.out.print("CEP: ");
//            String cep = s.next();
//            System.out.print("Bairro: ");
//            s.next();
//            String bairro = s.nextLine();
//            System.out.print("Cidade: ");
//            s.next();
//            String cidade = s.nextLine();
//            System.out.print("Estado: ");
//            s.next();
//            String uf = s.nextLine();
//
//            cliente = cbo.cadastrarCliente(nome, cpf, end, num, cep, bairro, cidade, uf);
//        } else if (opcao == 2) {
//            if (cliente != null) {
//                System.out.print("Digite a senha: ");
//                String senha = s.next();
//            }
//            System.out.println("Não é possível cadastrar conta sem cliente!");
//        } else if (opcao == 3) {
//            if (cliente != null) {
//                System.out.print("Digite a senha: ");
//                String senha = s.next();
//                cp = cpbo.cadastrarContaPoupanca(cliente, senha);
//            }
//            System.out.println("Não é possível cadastrar conta sem cliente!");
//        } else if (opcao == 4) {
//            if (cliente != null) {
//                System.out.print("Digite a senha: ");
//                String senha = s.next();
////                conta = ccbo.cadastrarConta(senha);
//                cp = cpbo.cadastrarContaPoupanca(cliente, senha);
//            }
//        } else if (opcao == 5) {
//            System.out.print("Digite seu CPF: ");
//            String cpf = s.next();
//            System.out.print("Digite sua senha: ");
//            String senha = s.next();
//
//            if (conta.getCliente().getCpf().equals(cpf) && conta.getSenha().equals(senha)) {
//                System.out.println("Você está logado");
//                opcao = 0;
//                u.menuLogado();
//                if (opcao == 1) {
//                    // Conta c, int tipoChave, String conteudoChave
//                    u.menuChavePix();
//                    opcao = 0;
//                    System.out.print("Digite a opção de chave: ");
//                    int tipoChave = s.nextInt();
//                    opcao = tipoChave;
//
//                    pbo.cadastrarPix(conta, opcao, senha);
//                } else if (opcao == 2) {
//                    // Conta c, String pix, double valor
//                    System.out.print("Digite o pix: ");
//                    String px = s.next();
//                    System.out.print("Digite o valor R$: ");
//                    double valor = s.nextDouble();
//                    if (!Util.criarConta().getCliente().getCpf().equals(px)){
//                        System.out.println("Chave inválida");
//                    }
//                    pbo.cadastrarPix(cp, opcao, senha);
//                }
//            }
//
//        }
		
		
	
}
}
