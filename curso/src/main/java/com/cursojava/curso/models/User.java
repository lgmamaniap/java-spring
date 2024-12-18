package com.cursojava.curso.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String password;
}
