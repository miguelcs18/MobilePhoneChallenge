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

        System.out.println("1--- Print contact list");
        System.out.println("2--- Add contact to list");
        System.out.println("3--- Search contact in list");
        System.out.println("4--- Modify contact in list");
        System.out.println("5--- Delete contact in list");
        System.out.println("6--- Show menu options");
        System.out.println("7--- Quit program");

        Scanner scanner = new Scanner(System.in);
        int menuOption = scanner.nextInt();




    }
}
