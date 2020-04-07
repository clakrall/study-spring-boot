package br.com.studyspringboot.controller;

import br.com.studyspringboot.domain.Client;
import br.com.studyspringboot.exception.NotFoundException;
import br.com.studyspringboot.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public String index(Model model) {
        return "clients/list";
    }

    @GetMapping("new")
    public String register(Model model) throws NoSuchMessageException, NotFoundException {
        model.addAttribute("client", new Client());
        return "clients/new";
    }

    @GetMapping("{id}")
    public String edit(@PathVariable Long id, Model model) throws NoSuchMessageException, NotFoundException{
        Client client = clientService.findOne(id);
        model.addAttribute("client", client);
        return "clients/edit";
    }
}
