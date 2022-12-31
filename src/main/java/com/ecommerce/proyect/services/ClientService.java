package com.ecommerce.proyect.services;

import com.ecommerce.proyect.DTOS.ClientDTO;
import com.ecommerce.proyect.models.Client;

import java.util.List;

public interface ClientService {
    void saveClient(Client client);
     List<ClientDTO> getClientsDTO();
}
