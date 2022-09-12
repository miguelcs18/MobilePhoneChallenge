import java.util.Scanner;

public class MobilePhone {
    public static void main(String[] args) {
    Contact contacto = new Contact();

    contacto.addContact("Gaby","4431333003");
    contacto.addContact("Miguel","4431333003");
    contacto.addContact("Chapa","1234567890");

    contacto.printContactList();

    contacto.modifyContact("Chapa","Chaparro","11111111");

        contacto.removeContact("Chaparro");

        contacto.printContactList();

        System.out.println("Found contact = " + contacto.queryContact("Gaby") );

        contacto.printContactList();


        Scanner scanner = new Scanner(System.in);

        contacto.printMenuOptions();
        int menuOption = 1;
        while(menuOption != 7)
        {
            System.out.println("Choose option");
            menuOption = scanner.nextInt();
            scanner.nextLine();

            switch (menuOption)
            {
                case 1:
                    System.out.println("Print contact List");
                    break;
                case 2:
                    System.out.println("Add contact to list");
                    break;
                case 3:
                    System.out.println("Search contact in List");
                    break;
                case 4:
                    System.out.println("Modify contact in List");
                    break;
                case 5:
                    System.out.println("Delete contact in List");
                    break;
                case 6:
                    System.out.println("Show menu options");
                    break;
                case 7:
                    System.out.println("Quit");
                    break;
                default:
                    break;
            }

        }

    }
}
