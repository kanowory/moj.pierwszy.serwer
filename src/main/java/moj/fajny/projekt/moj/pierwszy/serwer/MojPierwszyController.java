package moj.fajny.projekt.moj.pierwszy.serwer;

import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/test")
public class MojPierwszyController {

    @GetMapping("/pierwsza")
    public String pierwsza(){
        return "Hello World!";
    }

    @GetMapping("/druga")
    public String druga(){
        return "Hello World2!";
    }

    // /test/czesc/Kasia -> "Czesc Kasia"
    @GetMapping("/czesc/{imie}")
    public String czesc(@PathVariable String imie){
        return "Czesc " + imie;
    }

    // /test/upper?wartosc=Kasia -> "KASIA"
    @GetMapping("/upper")
    public String upper(@RequestParam String wartosc){
        return wartosc.toUpperCase();
    }

    // http://localhost:8080/test/concat?pierwszy=asdf&drugi=123
    @GetMapping("/concat")
    public String concat(@RequestParam String pierwszy, @RequestParam String drugi){
        return pierwszy + drugi;
    }

    // http://localhost:8080/test/najwiekszy?liczby=1&liczby=2&liczby=-5 //lista - parametry nazywamy tak samo
    @GetMapping("/najwiekszy")
    public int najwiekszy(@RequestParam List<Integer>liczby) {
        liczby.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        return liczby.get(0);
    }
}
