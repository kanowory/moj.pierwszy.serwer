package moj.fajny.projekt.moj.pierwszy.serwer.crud;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class OsobaService {

    private Map<String, Osoba> repo= new HashMap<>();

    //CRUD -> create, read, update, delete

    private String getNewPesel(){
        LocalDateTime now = LocalDateTime.now();
        StringBuilder sb = new StringBuilder();
        return sb.append(now.getYear())
                .append( now.getMonthValue())
                .append(now.getDayOfMonth())
                .append(new Random().nextInt(10000, 99999))
                .toString();
    }

    public Osoba create(Osoba nowa){
        nowa.setPesel(getNewPesel());
        repo.put(nowa.getPesel(), nowa);
        return nowa;
    }

    public List<Osoba> list(){
        return new ArrayList<>(repo.values());
    }

    public Osoba get(String pesel){
        return repo.get(pesel);
    }

    public Osoba update (Osoba toUpdate) {
        if (repo.containsKey(toUpdate.getPesel())) {
            repo.put(toUpdate.getPesel(), toUpdate);
            return toUpdate;
        }
        return null;
    }

    public void delete(String pesel) {
        repo.remove(pesel);
    }

}
