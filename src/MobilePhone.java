import java.util.Scanner;

public class MobilePhone {
    Contact contacto = new Contact();
    public static void main(String[] args) {

     MobilePhone mp = new MobilePhone();

        mp.optionsMenu();


    }

    public void optionsMenu()
    {


        Scanner scanner = new Scanner(System.in);


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
                    printContactList();
                    //prueba();
                    break;
                case 2:
                    System.out.println("Add contact to list");
                    System.out.println("Type name and press enter");
                    String name = scanner.nextLine();
                    System.out.println("Type phone number and press enter");
                    String phoneNumber = scanner.nextLine();
                    addContact(name,phoneNumber);
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
                    //printMenuOptions();
                    break;
                case 7:
                    System.out.println("Quit");
                    break;
                default:
                    break;
            }

        }

    }

    public void printContactList()
    {
        contacto.printContactList();
    }

    public void addContact(String name, String phoneNumber)
    {
        contacto.addContact(name,phoneNumber);
    }

}
