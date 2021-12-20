package lesson14;

import java.util.*;

public class Phonebook {
    private final String fio;
    private final String number;
    private LinkedList<Phonebook> phonebooks;

    public void setContacts(LinkedList<Phonebook> contacts) {
        this.phonebooks = contacts;
    }

    public Phonebook(String fio, String number) {
        this.fio = fio;
        this.number = number;
    }

    public LinkedList<Phonebook> getPhonebooks() {
        return phonebooks;
    }

    public String getFio() {
        return fio;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phonebook phonebook = (Phonebook) o;
        return Objects.equals(number, phonebook.number);
    }

    public static Map<String, String> fillOperators() {
        Map<String, String> operators = new HashMap<>();
        operators.put("Megafon", "921");
        operators.put("Beeline", "905");
        operators.put("Tele2", "952");
        operators.put("MTS", "910");
        operators.put("Yota", "999");
        operators.put("Megafon-szo", "931");
        operators.put("Megafon-msk", "925");
        operators.put("MTS-msk", "917");
        operators.put("MTS-szo", "911");
        operators.put("Tele2-msk", "977");
        return operators;
    }

    public static String generateNumber(Map<String, String> operators) {
        int numMaxLimit = 9999999;
        int numMinLimit = 1000000;

        Random random = new Random();
        List<String> keys = new ArrayList<String>(operators.keySet());
        String randomKey = keys.get(random.nextInt(keys.size()));
        String value = operators.get(randomKey);
        return "8" + value + (random.nextInt(numMaxLimit - numMinLimit) + numMinLimit);
    }

    public static List createContactList() {
        int contactsCount = 10000;
        int i = 1;
        List<String> familyMan = fillListFamily(true);
        List<String> familyWoman = fillListFamily(false);
        List<String> nameMan = fillListName(true);
        List<String> nameWoman = fillListName(false);
        List<String> otchestvoMan = fillListOtchestvo(true);
        List<String> otchestvoWoman = fillListOtchestvo(false);
        Map<String, String> operators = fillOperators();
        List<Phonebook> contactList = new ArrayList<>();
        Random random = new Random();
        while (i <= contactsCount) {
            contactList.add(new Phonebook(familyMan.get(random.nextInt(familyMan.size())) + " "
                    + nameMan.get(random.nextInt(nameMan.size())) + " "
                    + otchestvoMan.get(random.nextInt(otchestvoMan.size())), generateNumber(operators)));
            contactList.add(new Phonebook(familyWoman.get(random.nextInt(familyWoman.size())) + " "
                    + nameWoman.get(random.nextInt(nameWoman.size())) + " "
                    + otchestvoWoman.get(random.nextInt(otchestvoWoman.size())), generateNumber(operators)));
            i++;
        }
        return contactList;

    }

    public static List<String> fillListFamily(Boolean sex) {
        List<String> family = new ArrayList<>();
        if (sex) {
            family.add("Иванов");
            family.add("Петров");
            family.add("Белов");
            family.add("Чернов");
            family.add("Сидоров");
            family.add("Песков");
            family.add("Носов");
            family.add("Гаврилов");
            family.add("Леонтьев");
            family.add("Крылов");
        } else {
            family.add("Терентьева");
            family.add("Витальева");
            family.add("Петрова");
            family.add("Гусева");
            family.add("Лесева");
            family.add("Прутковская");
            family.add("Приходько");
            family.add("Степаненко");
            family.add("Боброва");
            family.add("Иванова");
        }
        return family;
    }

    public static List<String> fillListName(Boolean sex) {
        List<String> names = new ArrayList<>();
        if (sex) {
            names.add("Иван");
            names.add("Василий");
            names.add("Евгений");
            names.add("Даниил");
            names.add("Артем");
            names.add("Леонид");
            names.add("Игорь");
            names.add("Виталий");
            names.add("Денис");
            names.add("Александр");
        } else {
            names.add("Анастасия");
            names.add("Евгения");
            names.add("Александра");
            names.add("Марина");
            names.add("Ирина");
            names.add("Наталья");
            names.add("Екатерина");
            names.add("Инга");
            names.add("Елена");
            names.add("Ольга");
        }
        return names;
    }

    public static List<String> fillListOtchestvo(Boolean sex) {
        List<String> Otchestvo = new ArrayList<>();
        if (sex) {
            Otchestvo.add("Иванович");
            Otchestvo.add("Петрович");
            Otchestvo.add("Павлович");
            Otchestvo.add("Витальевич");
            Otchestvo.add("Олегович");
            Otchestvo.add("Игоревич");
            Otchestvo.add("Борисович");
            Otchestvo.add("Андреевич");
            Otchestvo.add("Александрович");
            Otchestvo.add("Викторович");
        } else {
            Otchestvo.add("Ивановна");
            Otchestvo.add("Петровна");
            Otchestvo.add("Павловна");
            Otchestvo.add("Александровна");
            Otchestvo.add("Евгеньевна");
            Otchestvo.add("Витальевна");
            Otchestvo.add("Григорьевна");
            Otchestvo.add("Аркадьевна");
            Otchestvo.add("Борисовна");
            Otchestvo.add("Николаевна");
        }
        return Otchestvo;
    }

    public static void printContacts(List<Phonebook> contacts) {
        for (Iterator<Phonebook> Iterator = contacts.listIterator(); Iterator.hasNext(); ) {
            Phonebook next = Iterator.next();
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println(next.getFio() + " " + next.getNumber());
            System.out.println("Связанные контакты:--------------------------");
            for (Iterator<Phonebook> Iterator1 = next.phonebooks.listIterator(); Iterator1.hasNext(); ) {
                Phonebook nextContact = Iterator1.next();
                System.out.println(nextContact.getFio() + " " + nextContact.getNumber());
            }
        }
    }

    public static List<Phonebook> fullContactsList(List<Phonebook> contacts) {
        List<Phonebook> fullList = new ArrayList<>();
        for (Iterator<Phonebook> Iterator = contacts.listIterator(); Iterator.hasNext(); ) {
            Phonebook next = Iterator.next();
            for (Iterator<Phonebook> Iterator1 = next.phonebooks.listIterator(); Iterator1.hasNext(); ) {
                Phonebook nextContact = Iterator1.next();
                fullList.add(nextContact);
            }
        }
        return fullList;
    }

}