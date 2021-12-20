package lesson14;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.String.valueOf;

public class PhonebookRunner {


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        int maxCountContacts = 50;
        int minCountContacts = 10;
        List<Phonebook> contactList = Phonebook.createContactList();
        Random random = new Random();
        for (Iterator<Phonebook> Iterator = contactList.listIterator(); Iterator.hasNext(); ) {
            Phonebook next = Iterator.next();
            int contactListSize = random.nextInt(maxCountContacts - minCountContacts) + minCountContacts;
            LinkedList<Phonebook> linkedList = new LinkedList<>();
            for (int i = 1; i <= contactListSize; i++) {
                Phonebook voidContact = contactList.get(random.nextInt(contactList.size()));
                if (voidContact.getNumber().equals(next.getNumber())) {
                    i--;
                } else {
                    linkedList.add(voidContact);
                }
            }
            next.setContacts(linkedList);
        }

        Map<Phonebook, Integer> contactGroup = new HashMap<>();
        for (Iterator<Phonebook> Iterator = contactList.listIterator(); Iterator.hasNext(); ) {
            Phonebook next = Iterator.next();
            List<Phonebook> innerPhonebook = next.getPhonebooks();
            for (Iterator<Phonebook> InnerIterator = innerPhonebook.listIterator(); InnerIterator.hasNext(); ) {
                Phonebook innerNext = InnerIterator.next();
                if (contactGroup.containsKey(innerNext)) {
                    contactGroup.put(innerNext, contactGroup.get(innerNext) + 1);
                } else {
                    contactGroup.put(innerNext, 1);
                }
            }
        }
        int n = 0;
        Phonebook mostCommon = null;
        for (Phonebook phonebook1 : contactGroup.keySet()) {
            if (n < contactGroup.get(phonebook1)) {
                n = contactGroup.get(phonebook1);
                mostCommon = phonebook1;
            }
        }
        System.out.println("Наиболее часто в списках контактов встречается человек с ФИО: " +
                mostCommon.getFio() + " (" + n + " раз)");
    }
}




