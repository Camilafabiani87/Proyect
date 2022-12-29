package com.ecommerce.proyect.services.implement;

import com.ecommerce.proyect.models.Client;
import com.ecommerce.proyect.repositories.ClientRepository;
import com.ecommerce.proyect.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImplement implements ClientService {
    @Autowired
    ClientRepository clientRepository;

    @Override
    public void saveClient(Client client) {
    clientRepository.save(client);
    }
}
