package Chapter8;

import java.util.Scanner;

public class ex8_85 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean loop = true;
        MobilePhone phone = new MobilePhone();

        while (loop) {
            showOptions();

            System.out.println("Select an option number:");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    loop = false;
                    break;
                case 2:
                    phone.showContacts();
                    System.out.println("Total number of contacts: " + phone.getContactList().size());
                    break;
                case 3:
                    System.out.println("Name of new contact?");
                    String newName = scanner.nextLine();
                    System.out.println("Phone of new contact?");
                    String newPhone = scanner.nextLine();
                    phone.storeNewContact(newName,newPhone);
                    break;
                case 4:
                    System.out.println("Name of existing contact?");
                    String existingContact = scanner.nextLine();
                    System.out.println("New name?");
                    String replaceName = scanner.nextLine();
                    System.out.println("New phone number?");
                    String replaceNumber = scanner.nextLine();
                    phone.modifyExistingContact(existingContact,replaceName,replaceNumber);
                    break;
                case 5:
                    System.out.println("Name of contact that must be removed?");
                    String removeName = scanner.nextLine();
                    phone.remove(removeName);
                    break;
                case 6:
                    System.out.println("Search which name?");
                    String searchName = scanner.nextLine();
                    phone.search(searchName);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        scanner.close();
    }

    private static void showOptions() {
        System.out.println("Options");
        System.out.println("\t 1. Quit");
        System.out.println("\t 2. Print list of contacts");
        System.out.println("\t 3. Add new contact");
        System.out.println("\t 4. Update existing contact");
        System.out.println("\t 5. Remove contact");
        System.out.println("\t 6. Find contact");
    }
}
