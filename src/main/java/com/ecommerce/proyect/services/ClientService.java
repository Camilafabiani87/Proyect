package com.ecommerce.proyect.services;

import com.ecommerce.proyect.dtos.ClientDTO;
import com.ecommerce.proyect.models.Client;

import java.util.List;

public interface ClientService {
    List<ClientDTO> getClientsDTO();
    void saveClient(Client client);
}
