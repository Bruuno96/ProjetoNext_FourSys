package br.com.next.bo;


import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import br.com.next.beans.Seguro;
import br.com.next.repositories.SeguroRepository;

@Service
public class SeguroBo {
	
	@Autowired
	private SeguroRepository repository;
		
	public Seguro cadastraSeguro(String nome, double valor, String regras) {
		Seguro s = new Seguro();
		s.setNome(nome);
		s.setValor(valor);
		s.setRegras(regras);
		return repository.save(s);
	}

}
