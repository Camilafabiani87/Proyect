package com.ecommerce.proyect.services.implement;


import com.ecommerce.proyect.DTOS.ClientDTO;
import com.ecommerce.proyect.models.Client;
import com.ecommerce.proyect.repositories.ClientRepository;
import com.ecommerce.proyect.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImplement implements ClientService {
    @Autowired
    ClientRepository clientRepository;

   @Override
    public void saveClient(Client client) {
    clientRepository.save(client);
    }

    @Override
    public List<ClientDTO> getClientsDTO() {
        return clientRepository.findAll().stream().map(client -> new ClientDTO(client)).collect(Collectors.toList());

    }
}
