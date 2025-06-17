import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {

    private HashMap<String, String> contacts;
    private Scanner scanner;

    public Phonebook() {
        contacts = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String number = scanner.nextLine();
        contacts.put(name, number);
        System.out.println("Contact added.");
    }

    public void searchContact() {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        if (contacts.containsKey(name)) {
            System.out.println("Phone number: " + contacts.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Phonebook is empty.");
        } else {
            System.out.println("Contacts:");
            for (String name : contacts.keySet()) {
                System.out.println(name + ": " + contacts.get(name));
            }
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add contact");
            System.out.println("2. Search contact");
            System.out.println("3. List contacts");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = phonebook.scanner.nextInt();
            phonebook.scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    phonebook.addContact();
                    break;
                case 2:
                    phonebook.searchContact();
                    break;
                case 3:
                    phonebook.listContacts();
                    break;
                case 0:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}