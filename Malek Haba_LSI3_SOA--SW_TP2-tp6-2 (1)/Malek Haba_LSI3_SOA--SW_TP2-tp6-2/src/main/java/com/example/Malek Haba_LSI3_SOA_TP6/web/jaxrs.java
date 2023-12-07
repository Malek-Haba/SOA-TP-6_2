package com.example.MbarekAmine_LSI3_SOA_TP6.web;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import com.example.MbarekAmine_LSI3_SOA_TP6.entities.Compte;
import com.example.MbarekAmine_LSI3_SOA_TP6.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Path("/banque")
public class jaxrs {
    @Autowired
    private CompteRepository compteRepository;
    @Path("/comptes")
    @GET
    @Produces({MediaType.APPLICATION_JSON_VALUE , MediaType.APPLICATION_XML_VALUE})
    @Transactional
    public  List<Compte> compteList() {return compteRepository.findAll();} //Pour récupérer la liste des comptes bancaires au format JSON
    @Path("/comptes/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON_VALUE})
    public Compte getOne(@PathParam(value = "id") Long id) { return compteRepository.findById(id).get();}
    //Pour récupérer un compte spécifique par son identifiant.
    @Path("/comptes")
    @POST
    @Produces({MediaType.APPLICATION_JSON_VALUE})
    @Consumes({MediaType.APPLICATION_JSON_VALUE})
    public  Compte save(Compte compte) {return compteRepository.save(compte);}
    //Pour créer un nouveau compte en utilisant les données fournies.
    @Path("/comptes/{id}")
    @PUT
    @Produces(value = {MediaType.APPLICATION_JSON_VALUE})
    public  Compte update(Compte compte, @PathParam(value = "id") Long id) {
        compte.setId(id);
        return compteRepository.save(compte);}
    //Pour mettre à jour un compte existant en utilisant les données fournies
    @Path("/comptes/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON_VALUE})
    public void delete(@PathParam(value = "id") Long id) { compteRepository.deleteById(id);}
    //Pour supprimer un compte en fonction de son identifiant.
}