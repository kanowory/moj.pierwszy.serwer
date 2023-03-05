package moj.fajny.projekt.moj.pierwszy.serwer.zadanie;

import moj.fajny.projekt.moj.pierwszy.serwer.crud.Osoba;
import moj.fajny.projekt.moj.pierwszy.serwer.crud.OsobaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profiles")
public class ProfilController {

    @Autowired
    private ProfilService service;

    @GetMapping
    public List<Profil> list(){
        return service.list();
    }

    @GetMapping("/{id}")
    public Profil get(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping
    public Profil create (@RequestBody Profil profil){
        return service.create(profil);
    }

    @PutMapping
    public Profil update (@RequestBody Profil profil) {
        return service.update(profil);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

}
