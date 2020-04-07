package br.com.studyspringboot.service;

import br.com.studyspringboot.domain.Client;
import br.com.studyspringboot.exception.NotFoundException;
import br.com.studyspringboot.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.NoSuchMessageException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public Client save(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client findOne(Long id) throws NoSuchMessageException, NotFoundException {
		Client client = clientRepository.getOne(id);
		if (client == null) throw new NotFoundException("Cliente não encontrado!");
		return client;
	}

	@Override
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}
}