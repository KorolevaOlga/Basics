package com.epam.JavaIntro.Student;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String surname;
    private int numberGroup;
    private int[] academicPerformance;

    public Student() {
    }

    public Student(String surname, int numberGroup, int[] academicPerformance) {
        this.surname = surname;
        this.numberGroup = numberGroup;
        this.academicPerformance = academicPerformance;
    }


    public static void bestStudent(Student[] students) {
        System.out.println("Студенты с отметками не ниже 9 и 10");
        for (Student student : students) {
            int a = 10;
            for (int j = 0; j < student.academicPerformance.length; j++) {
                if (student.academicPerformance[j] < a) {
                    a = student.academicPerformance[j];
                }
            }
            if (a >= 9) {

                System.out.println(student.surname + " группа " + student.numberGroup + " " + Arrays.toString(student.academicPerformance));
            }
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(int[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getNumberGroup() == student.getNumberGroup() && Objects.equals(getSurname(), student.getSurname()) && Arrays.equals(getAcademicPerformance(), student.getAcademicPerformance());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getSurname(), getNumberGroup());
        result = 31 * result + Arrays.hashCode(getAcademicPerformance());
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", numberGroup=" + numberGroup +
                ", academicPerformance=" + Arrays.toString(academicPerformance) +
                '}';
    }
}

