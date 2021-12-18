
package Reto2_Web.interfaces;


import Reto2_Web.modelo.Cleaningproductproduct;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CleaningproductInterface extends MongoRepository<Cleaningproductproduct, String> {

    public List<Cleaningproductproduct> findByPrice(double price);
    public List<Cleaningproductproduct> findByPriceLessThanEqua(String description);
    
}
