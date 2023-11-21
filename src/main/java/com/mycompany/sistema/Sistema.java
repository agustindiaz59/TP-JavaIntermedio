/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema;

import com.mycompany.sistema.modelo.Tecnico;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.eclipse.persistence.config.PersistenceUnitProperties.*;

/**
 *
 * @author matia
 */
public class Sistema {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("a"); //Creo una unidad de persistencia con el nombre 'a', la buscará en src/resources/persistence.xml
        EntityManager entityManager = emf.createEntityManager();//Instancio la implementacion de JPA que trajimos con el ManagerFactory
        EntityTransaction entityTransaction = entityManager.getTransaction();//Equivalente a Statement en JDBC

        entityTransaction.begin();//Equivalente a createStatement()

        Tecnico t = new Tecnico();//Creo la entidad a persistir
        t.setNombre("matias");

        entityManager.persist(t); //Ejecuta un insert, pueden hacerse varias operaciones antes de enviarse

        entityTransaction.commit();//Ejecuta la consulta a la base de datos

        System.out.println("Hello world!");

    }
}
