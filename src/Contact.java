import java.util.ArrayList;

public class Contact {
    private String name;
    private String phone_number;

    ArrayList<Contact> contactsList = new ArrayList<>();
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
        int index = findContact(name);
        if(index == -1 ) {

            contactsList.add(contact);
        }
        else
        {
            System.out.println("Contact already exists in index (" + index + ")" );
        }

    }

    public void modifyContact(String name, String newName, String newPhoneNumber)
    {
        int index = findContact(name);
        if(index >= 0)
        {
            Contact modifiedContact = new Contact();
            modifiedContact.setName(newName);
            modifiedContact.setPhone_number(newPhoneNumber);
            contactsList.set(index,modifiedContact);
            System.out.println("Contact name changed from name  " + name + " to " + newName
                    + " and phone number " + newPhoneNumber);
        }
        else
        {
            System.out.println("Contact not found in contact list");
        }

    }

    public int findContact(String name)
    {
        for(int i=0; i<contactsList.size(); i++)
        {
            if(contactsList.get(i).getName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(String name)
    {

        int index = findContact(name);
        if(index>=0)
        {
            return "Name: " + contactsList.get(index).getName() + " Phone number: " + contactsList.get(index).getPhone_number();
        }
        return "Contact not found in contact list";
    }

    public void removeContact(String name)
    {
        int index = findContact(name);
        if(index>=0)
        {
            contactsList.remove(index);
            System.out.println("Contact with name " + name + " was removed successfully!");
        }
        else
        {
            System.out.println("Contact with name " + name + " not found in contact list");
        }
    }

    public void printContactList()
    {
        for(int i=0; i<contactsList.size(); i++)
        {
            System.out.println("Nombre (" + i + ")= " + contactsList.get(i).getName() + " Number (" + i + ")= " + contactsList.get(i).getPhone_number());
        }
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }

    public void printMenuOptions()
    {
        System.out.println("1--- Print contact list");
        System.out.println("2--- Add contact to list");
        System.out.println("3--- Search contact in list");
        System.out.println("4--- Modify contact in list");
        System.out.println("5--- Delete contact in list");
        System.out.println("6--- Show menu options");
        System.out.println("7--- Quit program");
    }
}
