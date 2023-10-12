package com.projet.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.projet.cinema.entities.Salle;
@RepositoryRestResource
public interface SalleRepository extends JpaRepository<Salle, Long> {

}
