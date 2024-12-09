package levels;

import models.Teacher;
import utils.Data;

import java.util.List;
import java.util.stream.Collectors;

public class Level2 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();

        // TO DO 1: Retourner le nombre des enseignants dont le nom commence avec s
        long nbr = teachers.stream()
                .filter(teacher -> teacher.getName().toLowerCase().startsWith("s"))
                .count();
        System.out.println("Nombre d'enseignants dont le nom commence par 's': " + nbr);

        // TO DO 2: Retourner la somme des salaires de tous les enseignants Flutter
        long sum = teachers.stream()
                .filter(teacher -> "Flutter".equalsIgnoreCase(teacher.getSubject().toString()))
                .mapToLong(Teacher::getSalary)
                .sum();
        System.out.println("Somme des salaires des enseignants Flutter: " + sum);

        // TO DO 3: Retourner la moyenne des salaires des enseignants dont le nom commence avec a
        double average = teachers.stream()
                .filter(teacher -> teacher.getName().toLowerCase().startsWith("a"))
                .mapToDouble(Teacher::getSalary)
                .average()
                .orElse(0.0);
        System.out.println("Moyenne des salaires des enseignants dont le nom commence par 'a': " + average);

        // TO DO 4: Retourner la liste des enseignants dont le nom commence par f
        List<Teacher> teachers1 = teachers.stream()
                .filter(teacher -> teacher.getName().toLowerCase().startsWith("f"))
                .collect(Collectors.toList());
        System.out.println("Enseignants dont le nom commence par 'f': " + teachers1);

        // TO DO 5: Retourner la liste des enseignants dont le nom commence par s
        List<Teacher> teachers2 = teachers.stream()
                .filter(teacher -> teacher.getName().toLowerCase().startsWith("s"))
                .collect(Collectors.toList());
        System.out.println("Enseignants dont le nom commence par 's': " + teachers2);

        // TO DO 6: Vérifier s'il existe un enseignant avec un salaire > 100000
        boolean test = teachers.stream()
                .anyMatch(teacher -> teacher.getSalary() > 100000);
        System.out.println("Y a-t-il un enseignant dont le salaire est > 100000 ? " + test);

        // TO DO 7: Afficher le premier enseignant Unity dont le nom commence avec g
        teachers.stream()
                .filter(teacher -> "Unity".equalsIgnoreCase(teacher.getSubject().toString()))
                .filter(teacher -> teacher.getName().toLowerCase().startsWith("g"))
                .findFirst()
                .ifPresent(System.out::println);

        // TO DO 8: Afficher le deuxième enseignant dont le nom commence avec s
        teachers.stream()
                .filter(teacher -> teacher.getName().toLowerCase().startsWith("s"))
                .skip(1) // Skip le premier
                .findFirst()
                .ifPresent(System.out::println);
    }
}
