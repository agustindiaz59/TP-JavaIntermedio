/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

/**
 *
 * @author matia
 */
@Entity
@Table(name = "tecnicos")@Setter
public class Tecnico {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     @Column
    private String nombre;
}
