/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto2_Web.interfaces;


import Reto2_Web.modelo.Cleaningproductproduct;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface CleaningproductInterface extends MongoRepository<Cleaningproductproduct, String> {

    public List<Cleaningproductproduct> findByPrice(double price);
    public List<Cleaningproductproduct> findByDescriptionContainingIgnoreCase(String description);
    
}
