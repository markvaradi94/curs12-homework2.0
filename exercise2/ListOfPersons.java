package ro.fasttrackit.curs12.homeworkV2.exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfPersons {
    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        this.personList.add(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public List<String> extractPersonsNames() {
        List<String> names = new ArrayList<>();
        for (Person person : this.personList) {
            names.add(person.getName());
        }
        return names;
    }

    public Map<String, Integer> personsNameAndAge() {
        Map<String, Integer> result = new HashMap<>();
        for (Person person : this.personList) {
            result.put(person.getName(), person.getAge());
        }
        return result;
    }

    public Map<String, Integer> personsOlderThan(int age) {
        Map<String, Integer> result = new HashMap<>();
        for (Person person : this.personList) {
            if (person.getAge() > age) {
                result.put(person.getName(), person.getAge());
            }
        }
        return result;
    }

    public Map<String, List<String>> personsByHairColourAndName() {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : this.personList) {
            if (!result.containsKey(person.getHairColour())) {
                result.put(person.getHairColour(), new ArrayList<>());
            }
            result.get(person.getHairColour()).add(person.getName());
        }
        return result;
    }

    public Map<Integer, List<String>> personsByAgeAndNAme() {
        Map<Integer, List<String>> result = new HashMap<>();
        for (Person person : this.personList) {
            if (!result.containsKey(person.getAge())) {
                result.put(person.getAge(), new ArrayList<>());
            }
            result.get(person.getAge()).add(person.getName());
        }
        return result;
    }
}
