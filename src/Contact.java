import java.util.ArrayList;

public class Contact {
    private String name;
    private String phoneNumber;

    ArrayList<Contact> contactsList = new ArrayList<>();
    public Contact() {
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(String phone_number) {
        this.phoneNumber = phone_number;
    }

    public void addContact(String name, String phone_number)
    {
        Contact contact = new Contact();
        contact.setName(name);
        contact.setPhoneNumber(phone_number);
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
            modifiedContact.setPhoneNumber(newPhoneNumber);
            contactsList.set(index,modifiedContact);
            System.out.println("Contact name changed from name  " + name + " to " + newName
                    + " and phone number " + newPhoneNumber);
        }
        else
        {
            System.out.println("Contact not found in contact list");
        }

    }

    private int findContact(String name)
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
            return "Name: " + contactsList.get(index).getName() + " Phone number: " + contactsList.get(index).getPhoneNumber();
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
        if(contactsList.size()>0){
            System.out.println("------------------------------------------------------------------------------------------------------------");
            for(int i=0; i<contactsList.size(); i++)
            {
                System.out.println("Nombre (" + i + ")= " + contactsList.get(i).getName() + " Number (" + i + ")= " + contactsList.get(i).getPhoneNumber());
            }
            System.out.println("------------------------------------------------------------------------------------------------------------");
        }
        else
            System.out.println("Contact list is empty");
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
