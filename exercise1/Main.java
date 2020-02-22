package ro.fasttrackit.curs12.homeworkV2.exercise1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Mark", 8);
        studentMap.put("Renata", 10);
        studentMap.put("Eduard", 7);
        studentMap.put("Robert", 9);
        studentMap.put("Clara", 8);
        studentMap.put("Gheorghe", 6);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(studentMap);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(getMapMaxGrade(studentMap));
    }

    public static String getMapMaxGrade(Map<String, Integer> studentMap) {
        String result = "";
        int maxGrade = Collections.max(studentMap.values());
        for (String key : studentMap.keySet()) {
            if (studentMap.get(key) == maxGrade) {
                result = "Student with highest grade: " + key + " = " + studentMap.get(key).toString();
            }
        }
        return result;
    }
}
