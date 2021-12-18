/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.interfaces.CleaningproductInterface;
import Reto2_Web.modelo.Cleaningproductproduct;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CleaningproductRepository {
    @Autowired
    private CleaningproductInterface crudInterface;

    public List<Cleaningproductproduct> getAll() {
        return crudInterface.findAll();
    }

    public Optional<Cleaningproductproduct> getClothe(String reference) {
        return crudInterface.findById(reference);
    }

    public Cleaningproductproduct create(Cleaningproductproduct Cleaningproductproduct) {
        return crudInterface.save(Cleaningproductproduct);
    }

    public void update(Cleaningproductproduct Cleaningproductproduct) {
        crudInterface.save(Cleaningproductproduct);
    }

    public void delete(Cleaningproductproduct Cleaningproductproduct) {
        crudInterface.delete(Cleaningproductproduct);
    }

    public List<Cleaningproductproduct> getByPrice(double price){
        return crudInterface.findByPrice(price);
    }

    public List<Cleaningproductproduct> getByDescriptionContains(String description){
        return crudInterface.findByPriceLessThanEqua(description);
    }

}
