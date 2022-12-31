package com.ecommerce.proyect.Services;

import com.ecommerce.proyect.DTOS.ClientDTO;
import com.ecommerce.proyect.Models.Client;

import java.util.List;

public interface ClientService {
    List<ClientDTO> getClientsDTO();
    void saveClient(Client client);
}
