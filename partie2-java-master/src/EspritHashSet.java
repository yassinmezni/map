import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EspritHashSet implements GestionEnseignant {

    Set<Enseignant> hs = new HashSet<Enseignant>();

    @Override
    public void ajouterEnseignant(Enseignant e) {

        hs.add(e);

    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return hs.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {

        Iterator<Enseignant> it = hs.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        hs.remove(e);

    }

    @Override
    public void displayEnseignants() {
        System.out.println(" pas de personne");
        System.out.println(hs); // aff non perso
        System.out.println(" voila : ");

        for (Enseignant e : hs) {
            System.out.println(e.toString());
        }

    }

}
