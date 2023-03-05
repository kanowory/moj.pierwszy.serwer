package moj.fajny.projekt.moj.pierwszy.serwer.zadanie;

import moj.fajny.projekt.moj.pierwszy.serwer.crud.Osoba;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProfilService {

    private Map<Integer, Profil> repo= new HashMap<>();

    private int newId(){
        return new Random().nextInt();
    }

    public Profil create (Profil nowy){
        nowy.setId(newId());
        repo.put(nowy.getId(), nowy);
        return nowy;
    }

    public List<Profil> list (){
        return new ArrayList<>(repo.values());
    }

    public Profil get (int id) {
        return repo.get(id);
    }

    public Profil update (Profil toUpdate){
        if (repo.containsKey(toUpdate.getId())){
            repo.put(toUpdate.getId(), toUpdate);
            return toUpdate;
        }
        return null;
    }

    public void delete(int id) {
        repo.remove(id);
    }
}
