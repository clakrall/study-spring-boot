package br.com.studyspringboot.service;

import br.com.studyspringboot.domain.Client;
import br.com.studyspringboot.exception.NotFoundException;

import java.util.List;

public interface ClientService {
	Client save(Client client);

	Client findOne(Long id) throws NotFoundException;

	List<Client> getAllClients();
}