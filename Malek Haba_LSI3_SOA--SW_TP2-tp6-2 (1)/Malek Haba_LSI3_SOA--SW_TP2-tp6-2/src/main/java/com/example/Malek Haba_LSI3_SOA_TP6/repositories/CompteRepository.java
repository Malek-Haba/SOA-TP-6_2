package com.example.MbarekAmine_LSI3_SOA_TP6.repositories;

import com.example.MbarekAmine_LSI3_SOA_TP6.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository interface for managing Compte entities, extending JpaRepository for CRUD operations
public interface CompteRepository extends JpaRepository<Compte, Long> {

}
