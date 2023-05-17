package com.chnulabs.students;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private String groupNumber;
    public Student (String name, String groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return name;
    }

    public String getGroupNumber() {
        return groupNumber;
    }
    private final static ArrayList<Student> students = new ArrayList<Student>(
            Arrays.asList(
                    new Student("Щелконогов Олександр", "301"),
                    new Student("Грекова Дар'я", "301"),
                    new Student("Морунова Олександра", "301"),
                    new Student("Козлан Анастасія", "308"),
                    new Student("Бондаренко Данило", "308"),
                    new Student("Лісова Ірина", "308"),
                    new Student("Сіліверстов Максим", "309")

            )
    );

    public static ArrayList<Student> getStudents(String groupNumber) {
        ArrayList<Student> stList = new ArrayList<>();
        for (Student s: students) {
            if (s.getGroupNumber().equals(groupNumber)) {
                stList.add(s);
            }
        }
        return stList;
    }

    @Override
    public String toString() {
        return name;
    }
}
