package moj.fajny.projekt.moj.pierwszy.serwer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kalkulator")
public class KalkulatorController {

    // /kalkulator/dodaj/1/2
    @GetMapping("/dodaj/{a}/{b}")
    public int dodaj (@PathVariable int a, @PathVariable int b){
        return a + b;
    }

    // /kalkulator/ddejmij/1/2
    @GetMapping("/odejmij/{a}/{b}")
    public int odjemij (@PathVariable int a, @PathVariable int b){
        return a - b;
    }

    // /kalkulator/pomnoz/1/2
    @GetMapping("/pomnoz/{a}/{b}")
    public int pomnoz (@PathVariable int a, @PathVariable int b){
        return a * b;
    }

    // /kalkulator/podziel/1/2
    @GetMapping("/podziel/{a}/{b}")
    public float podziel (@PathVariable int a, @PathVariable int b){
        return a / (float) b;
    }
}
