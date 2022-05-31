package com.epam.JavaIntro.Triangle;

// Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.

public class Main {

    public static void main(String[] args) {

                Triangle triangle = new Triangle(25, 5, 7);
                Triangle triangle2 = new Triangle(2, 5, 6, 8, -1, -15);

                triangle.perimeter();
                triangle.area();

                triangle2.medianIntersection();
            }
        }
