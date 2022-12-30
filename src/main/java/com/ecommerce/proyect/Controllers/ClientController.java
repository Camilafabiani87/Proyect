package com.ecommerce.proyect.Controllers;

import com.ecommerce.proyect.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ClientController {
@Autowired
    ClientService clientService;



}
