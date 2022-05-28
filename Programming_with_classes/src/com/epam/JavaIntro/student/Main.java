package com.epam.JavaIntro.student;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость(массив из 5 элементов). 
Создайте массив из 10 элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки только 9 или 10.
*/

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
