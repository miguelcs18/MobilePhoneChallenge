import java.util.ArrayList;

public class Contact {
    private String name;
    private String phone_number;

    ArrayList<Contact> contactsList = new ArrayList<>();
    ArrayList<String> cadenas = new ArrayList<>();
    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void addContact(String name, String phone_number)
    {
        Contact contact = new Contact();
        contact.setName(name);
        contact.setPhone_number(phone_number);
        contactsList.add(contact);

    }

    public void modifyContact(String name)
    {
        System.out.println("ENCONTRADO = " + findContact(name));

    }

    public int findContact(String name)
    {
        for(int i=0; i<contactsList.size(); i++)
        {
            if(contactsList.get(i).getName() == name)
            {
                return i;
            }
        }
        return -1;
    }

    public void printContactList()
    {
        for(int i=0; i<contactsList.size(); i++)
        {
            System.out.println("Nombre (" + i + ")= " + contactsList.get(i).getName() + " Number (" + i + ")= " + contactsList.get(i).getPhone_number());
            System.out.println("------------------------------------------------------------------------------------------------------------");
        }
    }
}
