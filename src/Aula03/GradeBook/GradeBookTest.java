package Aula03.GradeBook;

import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();

        String curso;
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o nome do curso: ");
            curso = scanner.nextLine();
        }

        gradeBook.displayMessage("Engenharia de Software");
    }
}
