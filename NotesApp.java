import java.io.*;
import java.util.Scanner;

public class NotesApp {

    private static final String FILE_NAME = "notes.txt";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Notes App =====");
            System.out.println("1. Create New Note");
            System.out.println("2. View All Notes");
            System.out.println("3. Append to Notes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = getChoice();

            switch (choice) {
                case 1:
                    createNote();
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    appendNote();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }

    // Get choice safely
    private static int getChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Invalid input
        }
    }

    // Create new note (overwrites file)
    private static void createNote() {
        try (FileWriter writer = new FileWriter(FILE_NAME, false)) {
            System.out.println("Enter your note (type 'END' to finish):");
            String line;
            while (!(line = scanner.nextLine()).equalsIgnoreCase("END")) {
                writer.write(line + System.lineSeparator());
            }
            System.out.println("Note saved successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    // View all notes
    private static void viewNotes() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- Your Notes ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("------------------");
        } catch (FileNotFoundException e) {
            System.out.println("No notes found. Create one first!");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Append to existing notes
    private static void appendNote() {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            System.out.println("Enter text to append (type 'END' to finish):");
            String line;
            while (!(line = scanner.nextLine()).equalsIgnoreCase("END")) {
                writer.write(line + System.lineSeparator());
            }
            System.out.println("Note appended successfully!");
        } catch (IOException e) {
            System.out.println("Error appending file: " + e.getMessage());
        }
    }
}
