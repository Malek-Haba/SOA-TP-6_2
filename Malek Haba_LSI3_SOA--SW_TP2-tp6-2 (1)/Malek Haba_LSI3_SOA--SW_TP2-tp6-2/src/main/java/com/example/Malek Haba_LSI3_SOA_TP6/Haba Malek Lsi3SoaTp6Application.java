package com.example.MbarekAmine_LSI3_SOA_TP6;

import com.example.MbarekAmine_LSI3_SOA_TP6.entities.Compte;
import com.example.MbarekAmine_LSI3_SOA_TP6.entities.TypeCompte;
import com.example.MbarekAmine_LSI3_SOA_TP6.entities.EtatCompte;
import com.example.MbarekAmine_LSI3_SOA_TP6.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MbarekAmineLsi3SoaTp6Application {

	// Main method to start the Spring Boot application
	public static void main(String[] args) {
		SpringApplication.run(MbarekAmineLsi3SoaTp6Application.class, args);
	}

	// Bean definition for a CommandLineRunner, executed on application startup
	@Bean
	public CommandLineRunner start(CompteRepository compterep) {
		return args -> {
			// Creating three Compte (account) objects with initial values
			Compte compte1 = new Compte(null, 1000.0, new Date(), TypeCompte.EPARGNE, EtatCompte.ACTIVE);
			Compte compte2 = new Compte(null, 1500.0, new Date(), TypeCompte.EPARGNE, EtatCompte.ACTIVE);
			Compte compte3 = new Compte(null, 2000.0, new Date(), TypeCompte.COURANT, EtatCompte.ACTIVE);

			// Saving the Compte objects using the CompteRepository
			compterep.save(compte1);
			compterep.save(compte2);
			compterep.save(compte3);

			// Printing a success message after adding accounts
			System.out.println("Comptes ajoutés avec succès!");

			// Displaying the balances of all accounts
			System.out.println("Soldes des comptes :");
			compterep.findAll().forEach(compte -> {
				System.out.println(compte.getId() + " - Type: " + compte.getType() +
						", Solde: " + compte.getSolde());
			});
		};
	}
}
