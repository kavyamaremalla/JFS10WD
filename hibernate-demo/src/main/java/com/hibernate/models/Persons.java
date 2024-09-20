package com.hibernate.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "persons")
@Data
public class Persons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;

    @Column( nullable = false, unique = true)
    private String firstName;

    @Column(name = "surName")
    private String lastName;

    private Boolean isMarried;

    @OneToMany(mappedBy = "persons")
    private List<Orders> orders;
}
