package br.com.next.util;

import java.text.SimpleDateFormat;

import org.springframework.expression.ParseException;

import br.com.next.beans.Cliente;
import br.com.next.beans.Conta;
import br.com.next.beans.Endereco;
import br.com.next.beans.Pix;
import br.com.next.beans.TipoChavePix;

public class Util {
	
	public Util() {
	        
	    }
    
    public static Conta criarConta() throws ParseException, Exception{
        Cliente c = new Cliente();
        c.setNome("Karen");
        c.setCpf("12345678911");
        Endereco e = new Endereco();
        e.setLogradouro("Rua dos Bobos");
        e.setNumero(0);
        e.setCep("03021230");
        e.setBairro("Belém");
        e.setCidade("São Paulo");
        e.setUF("SP");
        c.setEndereco(e);
        Conta ct = new Conta();
        ct.setCliente(c);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
//            ct.setDataAbertura(sdf.parse("19/01/2022"));
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        Pix pix = new Pix();
        pix.setChave(TipoChavePix.CPF);
        pix.setActivated(true);
        pix.setConteudoChave("12345678911");
        ct.getPix().add(pix);
        
        return ct;
    }
    
    public void menuAbertura() {
        System.out.println("---MENU---");
        System.out.println("1 - Cadastro Cliente");
        System.out.println("2 - Cadastro Conta Corrente");
        System.out.println("3 - Cadastro Conta Poupança");
        System.out.println("4 - Cadastro Conta Corrente & Conta Poupança");
        System.out.println("5 - Logar");
    }
    
    public void menuLogado() {
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Cadastrar Chave-Pix");
        System.out.println("2 - Realizar Pix");
        System.out.println("3 - Solicitar Cartão Débito");
        System.out.println("4 - Solicitar Cartão Crédito");
        System.out.println("5 - Sair");
    }

    public void menuChavePix() {
        System.out.println("Selecione o tipo de chave:");
        System.out.println("1 - CPF");
        System.out.println("2 - Email");
        System.out.println("3 - Telefone");
        System.out.println("4 - Chave aleatória");
    }


}
