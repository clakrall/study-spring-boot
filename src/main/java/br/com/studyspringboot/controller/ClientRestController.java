package br.com.studyspringboot.controller;

import br.com.studyspringboot.domain.Client;
import br.com.studyspringboot.exception.NotFoundException;
import br.com.studyspringboot.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.NoSuchMessageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ClientRestController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(path = "/api/clients", method = RequestMethod.GET)
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @PostMapping("/api/clients/create")
    public ResponseEntity<?> create(@RequestBody Client client) {
        Map<String, Object> result = new HashMap<String, Object>();
        clientService.save(client);
        result.put("message", "Salvo com sucesso!");
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
