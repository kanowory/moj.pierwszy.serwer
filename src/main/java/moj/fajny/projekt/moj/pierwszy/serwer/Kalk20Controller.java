package moj.fajny.projekt.moj.pierwszy.serwer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kalkulator20")
public class Kalk20Controller {

    /**
     * POST /kalkulator20/policz
     * <p>
     * {
     * "a" : 123
     * "b" : 90
     * "oPeracja" : "DODAJ"//DODAJ, ODEJMIJ, POMNOZ, PODZIEL, POTEGA
     * }
     */

    enum Operacja {
        DODAJ,
        ODEJMIJ,
        POMNOZ,
        PODZIEL,
        POTEGA
    }

    public static class Działanie {
        int a;
        int b;
        Operacja operacja;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public Operacja getOperacja() {
            return operacja;
        }

        public void setOperacja(Operacja operacja) {
            this.operacja = operacja;
        }

    }

    @PostMapping("/policz")
    public int policz(@RequestBody Działanie działanie) {
        switch (działanie.operacja) {
            case DODAJ:
                return działanie.a + działanie.b;
            case ODEJMIJ:
                return działanie.a - działanie.b;
            case PODZIEL:
                return działanie.a / działanie.b;
            case POMNOZ:
                return działanie.a * działanie.b;
            case POTEGA:
                return (int) Math.pow(działanie.a, działanie.b);
            default:
                return 0;
        }
    }
}
