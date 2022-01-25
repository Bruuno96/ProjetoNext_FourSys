package br.com.next.bo;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.next.beans.Apolice;
import br.com.next.repositories.ApoliceRepository;

@Service
public class ApoliceBo {
	
	@Autowired
	private ApoliceRepository apoliceRepository;
	
	Date dataAtual = new Date();
	Apolice a = new Apolice();
	public Date calculaCarencia(Apolice apolice, int prazoCarencia) {
	//pegar data assinatura - pegar prazo carencia - setar o vencimento carencia
	Calendar cal = apolice.getDataAssinatura(); 
	cal.add(Calendar.DATE, prazoCarencia); // data atual + 15 dias  = data vencimento
	return cal.getTime();
	}
	
	public Apolice cadastrarApolice(Apolice apolice) {
		return apoliceRepository.save(apolice);
	}
	
	
}
