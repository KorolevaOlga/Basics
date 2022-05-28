package com.epam.JavaIntro.student;


public class Main {

        public static void main (String[]args){
            Student[] students = new Student[]{
                    new Student("Петров И.С.", 105, new int[]{3, 5, 6, 2, 3}),
                    new Student("Иванова П.С.", 105, new int[]{9, 10, 9, 9, 9}),
                    new Student("Степанова В.Р.", 104, new int[]{5, 7, 9, 4, 8}),
                    new Student("Мержицкий И.И.", 106, new int[]{10, 10, 10, 10, 10}),
                    new Student("Иваницкая Е.С.", 105, new int[]{9, 9, 9, 9, 9}),
                    new Student("Петровская И.Н.", 105, new int[]{3, 5, 6, 2, 3}),
                    new Student("Иванович Д.С.", 105, new int[]{9, 10, 9, 9, 9}),
                    new Student("Степановский Е.М.", 104, new int[]{5, 7, 9, 4, 8}),
                    new Student("Московский И.П.", 106, new int[]{10, 10, 10, 10, 10}),
                    new Student("Иварская Е.Е.", 105, new int[]{9, 9, 9, 9, 9}),
            };

            Student.bestStudent(students);

        }
    }
