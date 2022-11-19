import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete {
    Map<Employe, Departement> ED;

    public SocieteTreeMap() {
        ED = new TreeMap<Employe, Departement>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {

        ED.put(e, d);

    }

    @Override
    public void supprimerEmploye(Employe e) {
        ED.remove(e);

    }

    @Override
    public void afficherLesEmployesLeursDepartements() {

    }

    @Override
    public void afficherLesEmployes() {

    }

    @Override
    public void afficherLesDepartements() {

        System.out.println("avec doublons");
        for (Employe e : ED.keySet()) {
            System.out.println(ED.get(e).toString());
        }

        System.out.println("sans doublons");


        Set<Departement> s = new HashSet<Departement>();

        s.addAll(ED.values());
        for (Departement d : s) {
            System.out.println(d.toString());
        }

    }

    @Override
    public void afficherDepartement(Employe e) {
        if (rechercherEmploye(e))
            System.out.println(" le Departement de l'Employe : " + e.toString()
                    + " est : " + ED.get(e).toString());
        else System.out.println(" l'Employe non trouvable !");
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return ED.containsKey(e);

    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return ED.containsValue(d);

    }

}