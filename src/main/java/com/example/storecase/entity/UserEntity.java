package com.example.storecase.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "user")
@Data
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "fullname")
    private String fullName;
}
