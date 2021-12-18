
package Reto2_Web.controlador;

import Reto2_Web.modelo.Cleaningproductproduct;
import Reto2_Web.servicio.CleaningproductService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/cleaningproduct")
@CrossOrigin("*")
public class CleaningproductController {
    @Autowired
    private CleaningproductService cleaningproductService;

    @GetMapping("/all")
    public List<Cleaningproductproduct> getAll() {
        return cleaningproductService.getAll();
    }

    @GetMapping("/{reference}")
    public Optional<Cleaningproductproduct> getClothe(@PathVariable("reference") String reference) {
        return cleaningproductService.getClothe(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Cleaningproductproduct create(@RequestBody Cleaningproductproduct gadget) {
        return cleaningproductService.create(gadget);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Cleaningproductproduct update(@RequestBody Cleaningproductproduct gadget) {
        return cleaningproductService.update(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return cleaningproductService.delete(reference);
    }

    @GetMapping("/price/{price}")
    public List<Cleaningproductproduct> getByPrice(@PathVariable("price") double price){
        return cleaningproductService.getByPrice(price);
    }

    @GetMapping("/description/{description}")
    public List<Cleaningproductproduct> getByDescriptionContains(@PathVariable("description") String description){
        return cleaningproductService.getByDescriptionContains(description);
    }

}
