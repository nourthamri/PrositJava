public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "Ressources Humaines", 5);
        Departement d3 = new Departement(3, "Finance", 8);

        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);

        System.out.println("Liste des départements :");
        gestionDepartements.displayDepartement();

        System.out.println("\nRecherche par nom : 'Finance'");
        System.out.println(gestionDepartements.rechercherDepartement("Finance"));

        System.out.println("\nTrie des départements par ID :");
        gestionDepartements.trierDepartementById().forEach(System.out::println);

        System.out.println("\nSuppression du département d2 :");
        gestionDepartements.supprimerDepartement(d2);
        gestionDepartements.displayDepartement();
    }
}
