import java.util.ArrayList;

public class MobilePhone {
    public static void main(String[] args) {
    Contact contacto = new Contact();

    contacto.addContact("Gaby","4431333003");
    contacto.addContact("Miguel","4431333003");
    contacto.addContact("Chapa","1234567890");

    contacto.printContactList();

    contacto.modifyContact("Chapa","Chaparro","11111111");

    //contacto.findContact("Chapa");

        contacto.printContactList();

    }
}
