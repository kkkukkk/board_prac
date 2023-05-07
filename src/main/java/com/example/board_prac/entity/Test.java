package com.example.board_prac.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TEST")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String test;
}
