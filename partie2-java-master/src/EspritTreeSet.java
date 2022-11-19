import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseignant {
    Set<Enseignant> treeset = new TreeSet<Enseignant>();

    @Override
    public void ajouterEnseignant(Enseignant e) {
        treeset.add(e);

    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return treeset.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        Iterator<Enseignant> it = treeset.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        treeset.remove(e);

    }

    @Override
    public void displayEnseignants() {
        System.out.println(" pas de personne");
        System.out.println(treeset); // aff non perso
        System.out.println(" voila : ");

        for (Enseignant e : treeset) {
            System.out.println(e.toString());
        }

    }
}
