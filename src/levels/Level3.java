import models.Subject;
import models.Teacher;
import utils.Data;

import java.util.*;
import java.util.stream.Collectors;

public class Level3 {
    public static void main(String[] args) {
        // Charger les données des enseignants
        List<Teacher> teachers = Data.employees();

        // TO DO 4 : Regrouper les enseignants par matière
        Map<Subject, List<Teacher>> teachersBySubject = teachers.stream()
                .collect(Collectors.groupingBy(Teacher::getSubject));
        System.out.println("Enseignants regroupés par matière : ");
        teachersBySubject.forEach((subject, teacherList) -> {
            System.out.println("- " + subject + ": " + teacherList.stream()
                    .map(Teacher::getName)
                    .collect(Collectors.joining(", ")));
        });

        // TO DO 5 : Retourner une Map qui regroupe les noms des enseignants par salaire
        Map<Integer, String> namesBySalary = teachers.stream()
                .collect(Collectors.toMap(
                        Teacher::getSalary, // Utiliser le salaire comme clé
                        Teacher::getName, // Utiliser le nom comme valeur
                        (name1, name2) -> name1 + ", " + name2 // Combiner les noms en cas de doublons
                ));
        System.out.println("\nNoms des enseignants regroupés par salaire : ");
        namesBySalary.forEach((salary, names) -> {
            System.out.println("- Salaire " + salary + " : " + names);
        });

        // TO DO 6 : Afficher les noms des enseignants de chaque module
        System.out.println("\nEnseignants par matière : ");
        teachersBySubject.forEach((subject, teacherList) -> {
            System.out.println("Matière : " + subject);
            teacherList.forEach(teacher -> System.out.println(" - " + teacher.getName()));
        });
    }
}
