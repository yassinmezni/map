import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EspritArrayList implements University {
    List<Etudiant> ListE;

    public EspritArrayList(List<Etudiant> listE) {
        ListE = new ArrayList();
    }

    //ajout d'un etudiant avec "add"
    @Override
    public void ajouterEtudiant(Etudiant e) {
        ListE.add(e);
    }

    //recherche  etudiant "contains"
    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return ListE.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (int i = 0; i < ListE.size(); i++) {
            if (ListE.get(i).getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        ListE.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for (Etudiant e : ListE) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void trierEtudiantsParId() {
//        Collections.sort(ListE);
    }

    @Override
    public void trierEtudiantsParNom() {

    }
}
