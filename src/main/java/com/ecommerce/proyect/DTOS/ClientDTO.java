package com.ecommerce.proyect.DTOS;

import com.ecommerce.proyect.models.Client;

public class ClientDTO {
    private long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.firstname = client.getFirstname();
        this.lastname = client.getLastname();
        this.email = client.getEmail();
        this.password = client.getPassword();
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
