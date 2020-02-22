package ro.fasttrackit.curs12.homeworkV2.exercise2;

public class Main {
    public static void main(String[] args) {
        ListOfPersons personList = new ListOfPersons();
        personList.addPerson(new Person("Mark", 26, "brown"));
        personList.addPerson(new Person("Ion", 37, "bald"));
        personList.addPerson(new Person("Vasile", 54, "grey"));
        personList.addPerson(new Person("Ana", 26, "black"));
        personList.addPerson(new Person("Mara", 37, "blond"));
        personList.addPerson(new Person("Max", 39, "brown"));
        personList.addPerson(new Person("Rares", 44, "black"));
        personList.addPerson(new Person("Renata", 26, "brown"));

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(personList.getPersonList());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(personList.extractPersonsNames());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(personList.personsNameAndAge());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(personList.personsOlderThan(36));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(personList.personsByHairColourAndName());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(personList.personsByAgeAndNAme());
        System.out.println("-----------------------------------------------------------------------------------------");


    }
}
