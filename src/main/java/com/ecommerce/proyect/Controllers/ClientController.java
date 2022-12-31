package com.ecommerce.proyect.Controllers;

import com.ecommerce.proyect.DTOS.ClientDTO;
import com.ecommerce.proyect.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientService clientService;

@GetMapping("api/client")
    public List<ClientDTO> getClientsDTO(){
    return clientService.getClientsDTO();
    }
}
