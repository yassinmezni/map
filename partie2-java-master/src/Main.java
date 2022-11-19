public class Main {
    public static void main(String[] args) {
        Etudiant E = new Etudiant("oueslati", "ameni", 1);

        Enseignant e1 = new Enseignant(01, "salwa", "arfaoui");
        Enseignant e2 = new Enseignant(01, "ahmed", "oueslati");
        Enseignant e3 = new Enseignant(03, " ", " ");

        System.out.println("Hashset");

        EspritHashSet ehs = new EspritHashSet();

        System.out.println("---------------------------------------------------------------");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());


        System.out.println("---------------------------------------------------------------");

        System.out.println("vérification de l'égalité entre e1 et e2 :" + e1.equals(e1));


        System.out.println("---------------------------------------------------------------");
        ehs.ajouterEnseignant(e1);
        ehs.ajouterEnseignant(e2);
        ehs.ajouterEnseignant(e1);
        System.out.println("---------------------------------------------------------------");
        ehs.displayEnseignants();
        System.out.println("---------------------------------------------------------------");
        System.out.println("recherche de e1   :" + ehs.rechercherEnseignant(e1));
        System.out.println("recherche de e2   :" + ehs.rechercherEnseignant(e1));
        System.out.println("---------------------------------------------------------------");
        System.out.println("recherche de l'id 01  :" + ehs.rechercherEnseignant(01));
        System.out.println("recherche de l'id 02  :" + ehs.rechercherEnseignant(02));
        System.out.println("---------------------------------------------------------------");
        ehs.supprimerEnseignant(e3);
        ehs.displayEnseignants();


        System.out.println("++++++++++++++++++  Test de EspritTreeSet ++++++++++++++++++++++");

        EspritTreeSet ets = new EspritTreeSet();

        System.out.println("---------------------------------------------------------------");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());


        System.out.println("---------------------------------------------------------------");

        System.out.println("vérification de l'égalité entre e1 et e2 :" + e1.equals(e2));


        System.out.println("---------------------------------------------------------------");
        ets.ajouterEnseignant(e1);
        ets.ajouterEnseignant(e2);
        ets.ajouterEnseignant(e3);
        ets.ajouterEnseignant(e1);
        System.out.println("---------------------------------------------------------------");
        ets.displayEnseignants();
        System.out.println("---------------------------------------------------------------");
        System.out.println("recherche de e1   :" + ets.rechercherEnseignant(e1));
        System.out.println("recherche de e2   :" + ets.rechercherEnseignant(e2));
        System.out.println("---------------------------------------------------------------");
        System.out.println("recherche de l'id 01  :" + ehs.rechercherEnseignant(01));
        System.out.println("recherche de l'id 02  :" + ehs.rechercherEnseignant(02));
        System.out.println("---------------------------------------------------------------");
        ets.supprimerEnseignant(e3);
        ets.displayEnseignants();

    }
    }
