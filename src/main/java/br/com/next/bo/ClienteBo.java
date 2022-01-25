package br.com.next.bo;

import org.springframework.stereotype.Service; 

import br.com.next.beans.Cliente;
import br.com.next.beans.Endereco;
import br.com.next.repositories.ClienteRepository;

@Service
public class ClienteBo {
	
	private ClienteRepository clienteRepository;
	
	public Cliente cadastrarCliente(String nome, String cpf, String logradouro, int numero, String cep, String bairro, String cidade, String uf) {
		Cliente c = new Cliente();
		c.setNome(nome);
		c.setCpf(cpf);
		Endereco e = new Endereco();
		e.setLogradouro(logradouro);
		e.setNumero(numero);
		e.setCep(cep);
		e.setCidade(cidade);
		e.setBairro(bairro);
		e.setUF(uf);
		c.setEndereco(e);
		return clienteRepository.save(c);
	}
	
	

}
