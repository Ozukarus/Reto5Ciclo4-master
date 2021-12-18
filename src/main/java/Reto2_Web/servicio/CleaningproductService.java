/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.servicio;

import Reto2_Web.modelo.Cleaningproductproduct;
import Reto2_Web.repositorio.CleaningproductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class CleaningproductService {
    @Autowired
    private CleaningproductRepository cleaningproductRepository;

    public List<Cleaningproductproduct> getAll() {
        return cleaningproductRepository.getAll();
    }

    public Optional<Cleaningproductproduct> getClothe(String reference) {
        return cleaningproductRepository.getClothe(reference);
    }

    public Cleaningproductproduct create(Cleaningproductproduct accesory) {
        if (accesory.getReference() == null) {
            return accesory;
        } else {
            return cleaningproductRepository.create(accesory);
        }
    }

    public Cleaningproductproduct update(Cleaningproductproduct Cleaningproductproduct){
        if (Cleaningproductproduct.getReference()!= null){
            Optional<Cleaningproductproduct> clotheDb = cleaningproductRepository.getClothe(Cleaningproductproduct.getReference());
            if (!clotheDb.isEmpty()){
                if (Cleaningproductproduct.getReference()!=null){
                    clotheDb.get().setReference(Cleaningproductproduct.getReference());
                }
                if (Cleaningproductproduct.getCategory()!=null){
                    clotheDb.get().setCategory(Cleaningproductproduct.getCategory());
                }
                if (Cleaningproductproduct.getBrand()!=null){
                    clotheDb.get().setBrand(Cleaningproductproduct.getBrand());
                }
                if (Cleaningproductproduct.getDescription()!=null){
                    clotheDb.get().setDescription(Cleaningproductproduct.getDescription());
                }
                if (Cleaningproductproduct.getPrice()!= 0.0){
                    clotheDb.get().setPrice(Cleaningproductproduct.getPrice());
                }
                if (Cleaningproductproduct.getQuantity()!=0){
                    clotheDb.get().setQuantity(Cleaningproductproduct.getQuantity());
                }
                if (Cleaningproductproduct.getPhotography()!=null){
                    clotheDb.get().setPhotography(Cleaningproductproduct.getPhotography());
                }
                clotheDb.get().setAvailability(Cleaningproductproduct.isAvailability());
                cleaningproductRepository.update(clotheDb.get());
                return clotheDb.get();
            }else{
                return Cleaningproductproduct;
            }
        }else{
            return Cleaningproductproduct;
        }
    }

    public boolean delete(String reference){
        boolean del = getClothe(reference).map(clothe -> {
            cleaningproductRepository.delete(clothe);
            return true;
        }).orElse(false);
        return del;
    }

    public List<Cleaningproductproduct> getByPrice(double price){
        return cleaningproductRepository.getByPrice(price);
    }

    public List<Cleaningproductproduct> getByDescriptionContains(String description){
        return cleaningproductRepository.getByDescriptionContains(description);
    }
    
    
}
