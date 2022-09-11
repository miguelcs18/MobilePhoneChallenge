import java.util.ArrayList;

public class MobilePhone {
    public static void main(String[] args) {
    Contact contacto = new Contact();

    contacto.addContact("Gaby","4431333003");
    contacto.addContact("Miguel","4431333003");
    contacto.addContact("Chapa","1234567890");

    contacto.printContactList();

    contacto.modifyContact("Miguel");

    //contacto.findContact("Chapa");


    }
}
