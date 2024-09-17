import java.util.Scanner;


public class ZooManagement {



    public static void main(String[] args) {
        //Instruction 1+Instruction2+3

        int nbrCages ;
        String zooName ;
        Scanner scanner =new Scanner(System.in);
        System.out.println("veuiller ajouter le nom du zoo");
        zooName =scanner.nextLine();
        System.out.println("veuiller ajouter le nombre des cages");
        nbrCages= scanner.nextInt();
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    scanner.close();}

}
