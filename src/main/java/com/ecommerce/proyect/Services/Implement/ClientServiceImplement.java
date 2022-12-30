package com.ecommerce.proyect.Services.Implement;

import com.ecommerce.proyect.Models.Client;
import com.ecommerce.proyect.Repositories.ClientRepository;
import com.ecommerce.proyect.Services.ClientService;
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

//  @Override
//    public Client findByEmail(String email) {
//        return clientRepository.findByEmail(email);
//    }
}
