
package Reto2_Web.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "cleaningproduct")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cleaningproductproduct {
    @Id
    private String reference;
    private String category;
    private String brand;
    private String description;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography;
}
